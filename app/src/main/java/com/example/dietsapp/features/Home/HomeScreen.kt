package com.example.dietsapp.features.Home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import com.example.dietsapp.data.model.response.ResultData

@Composable
fun HomeScreen(
    homeViewModel: HomeViewModel = hiltViewModel()
) {
    val uiState = homeViewModel.uiState.collectAsState()
    
      Scaffold(
          modifier = Modifier
              .fillMaxSize()
              .padding(10.dp)
      ) {
          Column(
              modifier = Modifier.padding(it)
          ) {
              Text(text = "Prueba de recetas")
              LazyColumn {
                  items(uiState.value.listRecipes) {
                      RecipesItem(item = it)
                  }
              }
          }
      }
}

@Composable
fun RecipesItem(item: ResultData) {
    Column(
        modifier = Modifier.fillMaxWidth().padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = item.title,
            fontSize = 15.sp,
            fontStyle = FontStyle.Normal
        )
        AsyncImage(
            model = item.image,
            contentDescription = null
        )
    }
}