package com.example.petshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.petshop.ui.theme.PetShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val cat = Cat("Coco", 6)
        val dog = Dog("Mochi", 6)
        val pets = mutableListOf<Pet>()
        pets.add(cat)
        pets.add(dog)
        val scorpion = Scorpion("Stinger", 32)
        pets.add(scorpion)
        val pettablePets = mutableListOf<Pettable>(cat, dog)

        val happy = Happy("2026-09-04")
        val angry = Angry("2026-05-04")
        val moods = mutableListOf<Mood>()
        moods.add(happy)
        moods.add(angry)
    }
}
