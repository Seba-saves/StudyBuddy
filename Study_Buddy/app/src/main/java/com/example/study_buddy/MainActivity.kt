package com.example.study_buddy

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {
    private var isMainLayout = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switchLayoutButton = findViewById<Button>(R.id.button_switch_layout)
        switchLayoutButton.setOnClickListener {
            switchLayout()
        }
    }

    private fun switchLayout() {
        isMainLayout = !isMainLayout
        val newLayout = if (isMainLayout) R.layout.activity_main else R.layout.home
        setContentView(newLayout)
    }
}
