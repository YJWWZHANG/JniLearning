package com.zqb.jnilearning

/**
 *创建时间:2018/7/27 11:09
 */
object Jni01Hello {

    init {
        System.loadLibrary("jni01_hello-lib")
    }

    external fun getHelloString(): String
}