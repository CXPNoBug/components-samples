package com.cxp.hilt

import javax.inject.Inject

/**
 * <pre>
 *     author : CXP
 *     e-mail : cxpnobug@gmail.com
 *     time   : 2021/01/01
 *     desc   :
 *     version: 1.0
 * </pre>
 */
class Repository @Inject constructor() {

    fun doRespoitoryWork(){
        println("Do some work in Repository.")
    }
}