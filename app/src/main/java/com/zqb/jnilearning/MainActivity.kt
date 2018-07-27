package com.zqb.jnilearning

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method
        tv_text1.text = Jni01Hello.getHelloString()
        tv_text2.text = Jni02DynamicRegister.cpp_to_string("获取java字符串的指针GetStringUTFChars")
    }

}
