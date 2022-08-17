package com.example.lab04

import WidgetsActivity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast
import com.example.laboratorio4.R

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var button4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button4);
        button2 = findViewById(R.id.button5);
        button3 = findViewById(R.id.imageView2);
        button4 = findViewById(R.id.textView7);

        initListeners()
    }

    fun initListeners(){
        button.setOnClickListener{
            Toast.makeText(this, "Diego Jose Valdez Soto", Toast.LENGTH_LONG).show()
        }

        button2.setOnClickListener{
            val intent = Intent(this, WidgetsActivity::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val link = "https://play.google.com/store/apps/details?id=com.whatsapp"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
            startActivity(intent)
        }

        button4.setOnClickListener {
            val location = "https://www.google.com/maps/dir//sushito+la+estacion+google+maps/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x8589a38cd4722e77:0x6b33de1e662389ca?sa=X&ved=2ahUKEwjr6q-Kjs35AhUYTjABHdC5B8IQ9Rd6BAhpEAU"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(location))
            startActivity(intent)
        }
    }

}