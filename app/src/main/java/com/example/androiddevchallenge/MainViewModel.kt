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
package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.data.Dog

class MainViewModel : ViewModel() {

    val dogs = mutableStateOf(
        listOf(
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
            ),
            Dog(
                "Bell", "Adult", "Male",
                "Alaskan Malamute", "China Beijing", R.drawable.img_dog_bell
            ),
            Dog(
                "Lucy", "Adult", "Male",
                "Bichon Frise", "China Beijing", R.drawable.img_dog_lucy
            ),
            Dog(
                "Tony", "Adult", "Male",
                "Basset Hound", "China Beijing", R.drawable.img_dog_tony
            ),
            Dog(
                "Louis", "Adult", "Male",
                "Alaskan Malamute", "China Beijing", R.drawable.img_dog_louis
            ),
            Dog(
                "Will", "Adult", "Male",
                "Bichon Frise", "China Beijing", R.drawable.img_dog_will
            ),
            Dog(
                "Timi", "Adult", "Male",
                "Basset Hound", "China Beijing", R.drawable.img_dog_timi
            ),
            Dog(
                "Gagi", "Adult", "Male",
                "Chihuahua", "China Beijing", R.drawable.img_dog_ji
            )
        )
    )

    var chooseDog: Dog? by mutableStateOf(null)

    fun changeChooseDog(dog: Dog?) {
        chooseDog = dog
    }
}
