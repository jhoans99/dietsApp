package com.example.dietsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dietsapp.features.Home.HomeScreen
import com.example.dietsapp.features.details.DetailsScreen
import com.example.dietsapp.ui.theme.DietsAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DietsAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "home") {
                        composable("home") {
                            HomeScreen(navController)
                        }
                        composable("detailsDiets/{id}") { backStackEntry ->
                            val id = backStackEntry.arguments?.getString("id")
                            DetailsScreen(navController, id)
                        }
                    }
                }
            }
        }
    }
}
