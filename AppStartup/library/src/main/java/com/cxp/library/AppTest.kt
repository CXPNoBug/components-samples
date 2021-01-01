package com.cxp.library

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.startup.AppInitializer

/**
 * <pre>
 *     author : CXP
 *     e-mail : cxpnobug@gmail.com
 *     time   : 2021/01/01
 *     desc   :
 *     version: 1.0
 * </pre>
 */
object AppTest {

    fun initialize(context: Context) {
        Toast.makeText(context, "初始化App成功", Toast.LENGTH_SHORT).show()
    }
    fun initLazyialize(context: Context) {
        Toast.makeText(context, "Lazy 初始化App成功", Toast.LENGTH_SHORT).show()
    }

    fun lazyInit(context: Context) {
        AppInitializer.getInstance(context)
            .initializeComponent(AppLazyManageInitializer::class.java)
    }

}