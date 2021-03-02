/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Dog
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun DogList(dogs: List<Dog>, clickDog: (Dog) -> Unit = {}) {
    LazyColumn(
        Modifier.background(MaterialTheme.colors.background),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(8.dp),
    ) {
        items(dogs) { dog ->
            ShowDog(
                dog,
                Modifier
                    .clickable {
                        clickDog(dog)
                    }
                    .fillMaxWidth()
            )
        }
    }
}

@Composable
fun ShowDog(dog: Dog, modifier: Modifier = Modifier) {
    Card() {
        Row(modifier) {
            Image(
                painter = painterResource(dog.img),
                contentDescription = "this is ${dog.name}",
                Modifier.size(90.dp),
                contentScale = ContentScale.Crop
            )
            Column(Modifier.padding(10.dp)) {
                Text(dog.name, style = MaterialTheme.typography.h5)
                Text(dog.breed, style = typography.body2)
                Text(dog.location, style = typography.body2)
            }
        }
    }
}

@Preview
@Composable
fun ShowDogPreview() {
    MyTheme {
        ShowDog(
            Dog(
                "Cici", "two", "Adult",
                "Corgi", "China Fuzhou", R.drawable.img_dog_cici
            )
        )
    }
}

@Preview
@Composable
fun ShowDogListPreview() {
    val dogs = listOf(
        Dog(
            "Cici", "Adult", "Female",
            "Corgi", "China Fuzhou", R.drawable.img_dog_cici
        ),
        Dog(
            "Coco", "Childhood", "Male",
            "Teddy", "China Shanghai", R.drawable.img_dog_coco
        ),
        Dog(
            "Wendy", "Adult", "Female",
            "Cocker Spaniel", "China Beijing", R.drawable.img_dog_wendy
        )
    )
    MyTheme {
        DogList(dogs)
    }
}
