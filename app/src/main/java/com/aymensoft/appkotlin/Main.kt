package com.aymensoft.appkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_add.setOnClickListener {
            val inum1:Int=editText.text.toString().toInt()
            val inum2:Int=editText2.text.toString().toInt()
            val sum:Int=inum1+inum2
            resultat.text = sum.toString()
        }
    }
}
