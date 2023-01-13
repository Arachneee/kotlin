package com.example.arachne

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener(object : View.OnClickListener {
        }

        //1.kotlin interface가 아닌 자바 인터페이스 여야 한다.
        //2. 하나의 메소드만 있어야한다.
        button2.setOnClickListener{

        }
    }
}