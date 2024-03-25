package com.example.assignment_1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var tv: TextView
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private var studentCount=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.tv)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)


        updateCounter()

        btn1.setOnClickListener{
            studentCount++
            updateCounter()
        }
        btn2.setOnClickListener{
            if(studentCount>0){
                studentCount--
                updateCounter()
            }
        }
        }
    private fun updateCounter() {
        tv.text = "$studentCount"
    }
}
