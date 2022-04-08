package com.ysk423.catchphrasekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*


class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        //Viewの取得
        val tvResult:TextView = findViewById(R.id.tvResult)
        val btnReplay: Button = findViewById(R.id.btnReplay)

        //値を受け取る
        val myItem = intent.getStringExtra("MY_ITEM")

        //配列を用意
        val msgData = arrayOf(
            "女子高生が選ぶ $myItem ランキング",
            "100円ショップにあるものだけで $myItem をつくる",
        )

        //乱数を作る
        val num = Random().nextInt(msgData.count())

        //配列の表示
        tvResult.text = msgData[num]

        //replayボタン
        btnReplay.setOnClickListener {
            finish()
        }

    }
}