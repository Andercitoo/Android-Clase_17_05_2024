package com.example.clase_1_jetpack_compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import org.w3c.dom.Text

//Aqui creamos un "Componente" para realizar un apartado de texto en donde vamos a poner el texto que queramos que se muestre
@Composable
fun Textos() {
    Text(text = "CAJA 1 " )
}

//Aqui creamoa una funcion en la cual vamos a crear todos los componentes que puede tener nuestra vista
@Composable
fun previwprincipal() {
    //Aqui creamos una CAJA padre en la cual le vamos a pasar los parametros que va tener
    //La palabra reservada (modifier) sirve para
    Box(modifier = Modifier.fillMaxSize()) {
        //Llamamos la palabra reservada Column para hacer referencia a las columnas que vamos a implementar
        Column(
            modifier = Modifier.fillMaxSize(),
            //Hacemos que esta columna quede en horientacion vertical y le pasamos el SpaceBetween para que los elementos se alineen de forma separada pero equitativa
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Textos()
                Textos()
            }
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Textos()
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Textos()
                Textos()
            }
        }
    }
}


//Aqui creamos una vista previa para que los elementos que vamos creando se vayan previsualizando y se muestren en pantalla sin necesidad de ejecutar el proyecto
@Preview(showSystemUi = true, device = Devices.DEFAULT)
@Composable
//Aqui llamamos a una funcion para que se ejecuten nuestras funciones creadas anteriormente
private fun Data() {
    previwprincipal()
}