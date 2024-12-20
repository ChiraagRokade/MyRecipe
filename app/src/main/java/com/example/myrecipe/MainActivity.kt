package com.example.myrecipe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.myrecipe.ui.theme.MyRecipeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyRecipeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyRecipeApp( modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }

    @Composable
    private fun MyRecipeApp(modifier: Modifier) {
        Column(
            modifier = modifier
                .fillMaxSize(),
        ) {
            Text(
                "Check"
            )
        }
    }
}

