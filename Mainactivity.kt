package com.example.lab04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button4);

        initListener();
    }
    fun initListener(){
        button.setOnClickListener{
            Toast.makeText(this, "Diego Jose Valdez Soto", Toast.LENGTH_LONG).show()
        }
    }
}
