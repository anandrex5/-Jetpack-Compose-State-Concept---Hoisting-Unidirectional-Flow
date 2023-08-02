package com.company0ne.jetpack_composestateconcept

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
           // Recomposable()
            NotificationScreen()
        }
    }
}
@Composable
fun Recomposable(){
    val state = remember { mutableStateOf(0.0) }
    Log.d("tagged","Logged during Initial Compositon")
    Button(onClick = {
        state.value = Math.random()
    }) {
        Log.d("tagged","Logged during both  Compositon and Recompostion")
        Text(text = state.value.toString())
    }
}