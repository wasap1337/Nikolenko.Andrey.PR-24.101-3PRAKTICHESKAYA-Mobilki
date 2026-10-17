package com.example.myapp

object Utils {
    fun getCurrentDate(): String {
        return java.text.SimpleDateFormat("dd.MM.yyyy", java.util.Locale.getDefault()).format(java.util.Date())
    }
}
