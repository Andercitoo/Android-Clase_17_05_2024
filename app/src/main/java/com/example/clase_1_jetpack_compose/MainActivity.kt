package com.example.clase_1_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.clase_1_jetpack_compose.ui.theme.Clase_1_jetpack_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Clase_1_jetpack_composeTheme {
                // A surface container using the 'background' color from the theme
                /*
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
                 */
            }
        }
    }
}

@Composable
fun Caja(){
    Box(modifier = Modifier
        .fillMaxSize()){
        Component1()


    }
}

@Composable
fun Component1() {
    Text(text = "Hola desde Android")
}

@Composable
fun Files(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .background(Color.Green),
        horizontalArrangement = Arrangement.SpaceEvenly) {
        Component1()
    }
}

@Composable
fun Columnas(){
    Column(modifier = Modifier
        .fillMaxHeight()
        .background(Color.Magenta),
        verticalArrangement =  Arrangement.Center) {
    Component1()
    }
}


//arround
//Aqui le estamos diciendo que nos muestre una previsualizacion como si fuera un celular y que ademas tome la apariencia de un NEXUS_10
@Preview(showSystemUi = true, device = Devices.DEFAULT)
@Composable
private fun Main() {
        Columnas()
}