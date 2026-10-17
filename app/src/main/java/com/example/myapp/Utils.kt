package com.example.myapp

object Utils {
    fun getCurrentDate(): String {
        return java.text.SimpleDateFormat("dd.MM.yyyy HH:mm", java.util.Locale.getDefault()).format(java.util.Date())
    }

    fun formatName(first: String, last: String): String = "$first $last".trim()
}
