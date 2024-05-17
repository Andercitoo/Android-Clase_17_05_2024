package com.example.clase_1_jetpack_compose.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clase_1_jetpack_compose.R

@Composable
fun Main () {
    Box(modifier = Modifier.fillMaxSize()){
        Contentenido()
    }
}
@Composable
fun Contentenido() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround
    )   {
        Fila(
            img = R.drawable.ic_messi,
            descript = "####"
        );
        Text(
            text = "Messi el mejor que el de abajo",
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            fontSize = 30.sp,
            textAlign = TextAlign.Center
        )
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Campeón del mundo", fontSize = 17.sp, modifier = Modifier.fillMaxWidth(),textAlign = TextAlign.Center)
        }
        Fila(
            img = R.drawable.ic_cr7,
            descript  = "###"

        )
    }
}
@Composable
fun Fila(
    img: Int,
    descript: String,
    modifier: Modifier = Modifier.fillMaxWidth()
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = img),
            contentDescription = descript,
            modifier = Modifier
                .width(400.dp)
                .height(300.dp)
        )

    }
}

@Preview(
    name = "Pagina",showSystemUi = true,
    device = Devices.DEFAULT
)
@Composable
fun PreviewMain() {
    Main()
}