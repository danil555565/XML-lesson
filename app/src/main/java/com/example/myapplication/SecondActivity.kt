package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)



        var textd = intent.getStringExtra("toText3")!!

        val textView: TextView = findViewById(R.id.textView3)

        textView.text = textd

        val buttonPlus: Button = findViewById(R.id.backButton)


        buttonPlus.setOnClickListener {
        val intent = Intent (this@SecondActivity, MainActivity::class.java)
        val textWelcome: TextView = findViewById(R.id.textView2)
        intent.putExtra("welcomeToAndroid", textWelcome.text.toString())
        startActivity(intent)}
    }
}