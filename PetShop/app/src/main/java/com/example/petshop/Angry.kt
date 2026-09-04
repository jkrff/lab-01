package com.example.petshop

class Angry(date: String): Mood(date) {
    override fun mood(): String {
        return "Angry >:("
    }
}