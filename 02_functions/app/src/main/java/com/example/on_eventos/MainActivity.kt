package com.example.on_eventos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity(){
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
			setContent{
					MensajeApp()
				
			}
	}
}



fun generarMensaje() : String{
	return "Hola desde una función en Kotlin"
	
}

@Composable
fun MensajeApp(){
	var mensaje by remember { mutableStateOf("") }
	
	Column(
		modifier = Modifier.fillMaxSize().padding(16.dp),
		verticalArrangement = Arrangement.Center,
		horizontalAlignment = Alignment.CenterHorizontally
	){
		
		Text(text = if (mensaje.isEmpty()) "Presiona el botón" else mensaje,
		fontSize=24.sp
		)
		Spacer(modifier = Modifier.height(20.dp))
		
		Button(onClick = {
			mensaje = generarMensaje()
		}) {
			Text("Mostrar mensaje")
		}
	}

}