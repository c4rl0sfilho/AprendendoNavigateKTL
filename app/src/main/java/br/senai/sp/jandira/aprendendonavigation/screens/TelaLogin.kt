package br.senai.sp.jandira.aprendendonavigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.aprendendonavigation.ui.theme.AprendendoNavigationTheme

@Composable
fun TelaLogin(controleDeNavegacao: NavHostController) {

    var usuarioState = remember {
        mutableStateOf("")
    }
    var senhaState = remember{
        mutableStateOf("")
    }

    var isErrorState = remember {
        mutableStateOf(false)
    }
    var mensagemErroState = remember {
        mutableStateOf("")
    }



    AprendendoNavigationTheme {
        Surface(
            modifier = Modifier
                .fillMaxSize(),
            color = Color(0xff03a4f9)
        ) {
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = "Login",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(32.dp))
                OutlinedTextField(
                    value = usuarioState.value,
                    onValueChange = {
                        usuarioState.value = it
                    },
                    isError = isErrorState.value
                )
                Spacer(modifier = Modifier.height(32.dp))
                OutlinedTextField(
                    value = senhaState.value,
                    onValueChange = {
                        senhaState.value = it
                    },
                    isError = isErrorState.value
                )
                Text(text = mensagemErroState.value, color = Color.Red)
                Spacer(modifier = Modifier.height(32.dp))

                Button(onClick = {
                    if (usuarioState.value == "aluno" && senhaState.value == "1234"){
                        controleDeNavegacao.navigate("home")
                    }else{
                        isErrorState.value == true
                        mensagemErroState.value = "Usuario ou senha invalidos"
                    }
                }) {
                    Text(text = "Entrar")
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun TelaLoginPreview() {
    AprendendoNavigationTheme {
        Surface(
            modifier = Modifier
                .fillMaxSize()
        ) {
           // TelaLogin(controleDeNavegacao)
        }
    }}