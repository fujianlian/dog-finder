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
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Dog
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun DogDetail(
    dog: Dog,
    adopt: (Dog) -> Unit = {}
) {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(15.dp)
            .clickable(enabled = false, onClick = {})
    ) {
        val imageModifier = Modifier.fillMaxWidth()
        Image(
            painter = painterResource(dog.img),
            modifier = imageModifier,
            contentDescription = "this is ${dog.name}",
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text("Name: " + dog.name, style = MaterialTheme.typography.h4)
        Spacer(modifier = Modifier.height(10.dp))
        Text("Age: " + dog.age, style = typography.body1)
        Spacer(modifier = Modifier.height(5.dp))
        Text("Breed: " + dog.breed, style = typography.body1)
        Spacer(modifier = Modifier.height(5.dp))
        Text("Location: " + dog.location, style = typography.body1)
        Spacer(modifier = Modifier.height(15.dp))
        Button({
            adopt(dog)
        }) {
            Text("Adopt", modifier = Modifier.padding(5.dp))
        }
    }
}

@Preview
@Composable
fun ShowDogDetailPreview() {
    val dog = Dog(
        "Cici", "Adult", "Female",
        "Corgi", "China Fuzhou", R.drawable.img_dog_cici
    )
    MyTheme {
        DogDetail(dog)
    }
}
