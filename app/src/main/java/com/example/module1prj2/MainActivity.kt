package com.example.module1prj2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.os.LocaleListCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find buttons and set click listeners to change language
        findViewById<Button>(R.id.btn_en).setOnClickListener {
            changeLanguage("en")
        }

        findViewById<Button>(R.id.btn_es).setOnClickListener {
            changeLanguage("es")
        }

        findViewById<Button>(R.id.btn_fr).setOnClickListener {
            changeLanguage("fr")
        }
    }

    private fun changeLanguage(languageCode: String) {
        // Use AppCompatDelegate to set the app's locale. 
        // This is the modern, recommended way (Android 13+ support included).
        val appLocale: LocaleListCompat = LocaleListCompat.forLanguageTags(languageCode)
        AppCompatDelegate.setApplicationLocales(appLocale)
    }
}
