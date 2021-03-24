package com.musfickJamil.customsnackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.musfickjamil.snackify.Snackify

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.successBtn).setOnClickListener {
            Snackify.success(findViewById(android.R.id.content), "Success message !", Snackify.LENGTH_LONG).show()
        }
        findViewById<Button>(R.id.infoBtn).setOnClickListener {
            Snackify.info(findViewById(android.R.id.content), "Info message !", Snackify.LENGTH_LONG).show()
        }
        findViewById<Button>(R.id.warningBtn).setOnClickListener {
            Snackify.warning(findViewById(android.R.id.content), "Warning message !", Snackify.LENGTH_LONG).show()
        }
        findViewById<Button>(R.id.errorBtn).setOnClickListener {
            Snackify.error(findViewById(android.R.id.content), "Error message !", Snackify.LENGTH_SHORT).show()
        }
    }
}