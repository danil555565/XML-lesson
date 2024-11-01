package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val image: ImageView = findViewById(R.id.imageView)
        val textx: TextView = findViewById(R.id.textView)

        image.setOnClickListener {
            textx.setText("Привет мир")
        }

        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)

            intent.putExtra("toText3", textx.text.toString())

            startActivity(intent)


        }
    }
    override fun onResume() {
        super.onResume()
        var textView: TextView = findViewById(R.id.textView)
        val textFromSecondActivity = intent.getStringExtra("welcomeToAndroid")

        textView.text = textFromSecondActivity
    }
}