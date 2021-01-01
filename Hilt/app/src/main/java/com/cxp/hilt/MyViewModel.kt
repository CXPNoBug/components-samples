package com.cxp.hilt

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel

/**
 * <pre>
 *     author : CXP
 *     e-mail : cxpnobug@gmail.com
 *     time   : 2021/01/01
 *     desc   :
 *     version: 1.0
 * </pre>
 */

class MyViewModel @ViewModelInject constructor(private val repository: Repository) : ViewModel() {
    fun doWork() {
        repository.doRespoitoryWork()
    }
}