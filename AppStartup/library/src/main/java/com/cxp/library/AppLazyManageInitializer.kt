package com.cxp.library

import android.content.Context
import android.os.Bundle
import androidx.startup.Initializer

/**
 * <pre>
 *     author : CXP
 *     e-mail : cxpnobug@gmail.com
 *     time   : 2021/01/01
 *     desc   :
 *     version: 1.0
 * </pre>
 */
class AppLazyManageInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        AppTest.initLazyialize(context)
    }

    /**
     * 初始化其他依赖类，优先初始化其他的，再初始化当前的AppInitializer
     */
    override fun dependencies(): List<Class<out Initializer<*>>> {
//        return listOf(OtherInitializer::class.java)
        return emptyList()
    }
}