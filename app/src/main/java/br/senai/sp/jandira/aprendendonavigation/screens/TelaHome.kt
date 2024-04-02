package br.senai.sp.jandira.aprendendonavigation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
fun TelaHome(controleDeNavegacao: NavHostController) {
    AprendendoNavigationTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xffa7ccf4)
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(32.dp))
                Text(text = "Bem-vindo!!", fontSize = 32.sp, color = Color.Blue, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(32.dp))
                Button(onClick = {
                    controleDeNavegacao.navigate("Login")
                }) {
                    Text(text = "Voltar para login")
                }
            }
        }
    }
}

@Preview
@Composable
fun TelaHomePreview() {
    AprendendoNavigationTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xffa7ccf4)
        ) {
            //TelaHome(controleDeNavegacao)
        }
    }
}