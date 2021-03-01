package com.example.androiddevchallenge.ui

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.MainViewModel
import com.example.androiddevchallenge.ui.theme.MyTheme
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(viewModel: MainViewModel) {

    val scope = rememberCoroutineScope()
    val snackBarHostState = SnackbarHostState()

    Scaffold(
        topBar =
        {
            TopAppBar(
                title = {
                    Text("Dog Finder")
                }
            )
        },
        snackbarHost = {
            SnackbarHost(snackBarHostState)
        },
        content = {
            DogList(viewModel.dogs.value) { dog ->
                viewModel.changeChooseDog(dog)
            }
            if (viewModel.chooseDog != null) {
                DogDetail(dog = viewModel.chooseDog!!) { dog ->
                    scope.launch {
                        snackBarHostState.showSnackbar("You adopted ${dog.name}")
                    }
                }
            }
        }
    )
}

@Preview
@Composable
fun ShowHomeScreen() {
    MyTheme {
        HomeScreen(MainViewModel())
    }
}