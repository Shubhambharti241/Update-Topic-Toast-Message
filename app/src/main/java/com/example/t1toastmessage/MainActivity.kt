package com.example.t1toastmessage

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonDownload = findViewById<Button>(R.id.btnDownload)
        val buttonUpload = findViewById<Button>(R.id.btnUpload)
        val buttonSet = findViewById<Button>(R.id.btnSet)
        val buttonGet = findViewById<Button>(R.id.btnGet)

        buttonDownload.setOnClickListener {
            Toast.makeText(this,"Downloading Start",Toast.LENGTH_SHORT).show()
        }

        buttonUpload.setOnClickListener {
            Toast.makeText(this , " Uploading Start",Toast.LENGTH_SHORT).show()
        }

        buttonSet.setOnClickListener {
            Toast.makeText(this,"Set Your Data Information",Toast.LENGTH_SHORT).show()
        }

        buttonGet.setOnClickListener {
            Toast.makeText(this,"Get Your Data Information" , Toast.LENGTH_SHORT).show()
        }
        
    }
}