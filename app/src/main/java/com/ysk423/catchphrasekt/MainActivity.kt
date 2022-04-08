package com.ysk423.catchphrasekt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //要素の取得
        val et:EditText = findViewById(R.id.et)
        val btnStart:Button = findViewById(R.id.btnStart)

        //画面を渡す、Intent
        btnStart.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            //値を渡す
            intent.putExtra("MY_ITEM",et.text.toString())
            startActivity(intent)

        }
    }
}