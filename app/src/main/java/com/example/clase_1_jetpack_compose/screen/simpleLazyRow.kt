package com.example.clase_1_jetpack_compose.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun LazyContent() {
    Box(modifier = Modifier.fillMaxSize()){
        simpleLazy()
        SimpleColum()
    }
}
@Composable
fun simpleLazy(){
    val items = listOf("items1", "items2", "items3", "items4", "items5", "items6", "items7")
    LazyRow(modifier = Modifier.width(400.dp)){
        items(items){ item -> Text(text = item, modifier = Modifier.padding(16.dp)) }
    }
}

@Composable
fun SimpleColum() {
    val elemento = listOf("items1", "items2", "items3", "items4", "items5", "items6", "items7", "items8", "items9", "items10", "items10", "items11", "items12" , "items13", "items14", "items15", "items16", "items17", "items18")
    LazyColumn(modifier = Modifier.width(80.dp)){
        items(elemento){ element -> Text(text = element, modifier = Modifier.padding(16.dp)) }
    }
}





@Preview(
    name = "simpleLazyRow",showSystemUi = true,
    device = Devices.DEFAULT
)

@Composable
fun previewMian() {
    LazyContent()
}
