package com.example.clase_1_jetpack_compose.screen

import androidx.compose.foundation.ExperimentalFoundationApi
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
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clase_1_jetpack_compose.R
import com.example.clase_1_jetpack_compose.Textos





@Composable
fun cajon1 () {
    Box(modifier = Modifier.fillMaxSize()){
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                horizonal_prueba()
            }
        }
    }
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun  horizonal_prueba(){
    val pagerState= rememberPagerState(initialPage = 0) {
        3
    }
    Box(modifier =Modifier.fillMaxSize()){
        HorizontalPager(state = pagerState,modifier= Modifier.fillMaxSize()) {
                page -> when (page){
            0->cajon2(page)
            1->cajon3(page)
            2->cajon4(page)
        }

        }
    }
}
@Composable
fun cajon2(contenido: Int) {
    var user by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Box(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,) {
            Fila(img = R.drawable.ic_imagenlogin, descript = "###")
            TextField(value = user,
                onValueChange = {
                user = it
            },
                label = {
                    Text(text = "User")
                },
                placeholder = {
                    Text(text = "Anderson Rodriguez")
                }
            )
            OutlinedTextField(value =password ,
                onValueChange ={
                password = it
            },
                label = {
                    Text(text = "Password")
                },
                placeholder = {
                    Text(text = "***************")

                },
            )

            Button(
                onClick = {},
                modifier = Modifier.width(150.dp), colors = ButtonDefaults.buttonColors(
                    Color.Yellow
                )
            )

            {
                Text(text = "Login", color = Color.Black, fontSize = 18.sp);
            }
        }
    }
}



@Composable
fun cajon3(contenido:Int) {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceAround) {
        Fila(img = R.drawable.ic_icono, descript = "###")
        Text(
            text = "Please use the link below to verify your email and start your journey",
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
        )

        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth(), colors = ButtonDefaults.buttonColors(
                Color.Yellow
            )
        )

        {
            Text(text = "Verify Email", color = Color.Black, fontSize = 18.sp);
        }
    }
}

@Composable
fun cajon4(contenido: Int) {
    Box(modifier = Modifier.fillMaxWidth(2f )) {
        conexion()
        conexion2()
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {
            Fila(img = R.drawable.ic_imagenlogin, descript = "###")
        }
    }
}

    @Composable
    fun conexion() {
        var users by remember {
            mutableStateOf("")
        }

        var passwords by remember {
            mutableStateOf("")
        }
        Box(modifier = Modifier.fillMaxSize(1f )) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextField(value = users,
                    onValueChange = {
                        users = it
                    },
                    label = {
                        Text(text = "User")
                    },
                    placeholder = {
                        Text(text = "Anderson Rodriguez")
                    }
                )
                OutlinedTextField(
                    value = passwords,
                    onValueChange = {
                        passwords = it
                    },
                    label = {
                        Text(text = "Password")
                    },
                    placeholder = {
                        Text(text = "***************")
                    },
                )
            }
        }
    }


@Composable
    fun conexion2 () {
    Box(modifier = Modifier.fillMaxWidth(2f)){
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Button(
                onClick = {},
                modifier = Modifier.width(150.dp), colors = ButtonDefaults.buttonColors(
                    Color.Yellow
                )
            )
            {
                Text(text = "Login", color = Color.Black, fontSize = 18.sp);
            }
        }
    }
}




@Preview(
    name = "simpleHorizontal",showSystemUi = true,
    device = Devices.DEFAULT
)

@Composable
fun previewM() {
    cajon1()
}
