package com.zqb.jnilearning

/**
 *创建时间:2018/7/27 14:49
 */
object Jni02DynamicRegister {

    init {
        System.loadLibrary("jni02_dynamic_register-lib")
    }

    external fun cpp_get_string(): String
    external fun cpp_to_string(s: String): String
}