package com.example.androiddevchallenge.ui

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
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
