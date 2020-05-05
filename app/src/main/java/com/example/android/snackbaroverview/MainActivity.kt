package com.example.android.snackbaroverview

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        // The Basics
        Snackbar.make(activity_main, "Dummy Snack", Snackbar.LENGTH_SHORT).show()
        */

        // With Action
        Snackbar.make(activity_main, "You are dummy action", Snackbar.LENGTH_INDEFINITE)
                .setAction("Season") {
                    text.text = "Summer is over"
                }
                .setTextColor(Color.LTGRAY)
                .setActionTextColor(Color.WHITE)
                .setBackgroundTint(Color.DKGRAY)
                .show()
    }
}
