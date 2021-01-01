package com.cxp.appstartup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.cxp.library.AppManageInitializer
import com.cxp.library.AppTest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickLis(view: View) {
        AppTest.lazyInit(this)
    }
}