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