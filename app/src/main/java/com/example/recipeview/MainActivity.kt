package com.example.uklviewgroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.recipeview.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayShowTitleEnabled(false)

        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setLogo(R.drawable.ic_baseline_arrow_back_24)
        supportActionBar?.setDisplayUseLogoEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.top_nav_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}