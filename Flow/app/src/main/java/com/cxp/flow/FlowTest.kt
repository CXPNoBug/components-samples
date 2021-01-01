package com.cxp.flow

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

/**
 * <pre>
 *     author : CXP
 *     e-mail : cxpnobug@gmail.com
 *     time   : 2020/12/30
 *     desc   :
 *     version: 1.0
 * </pre>
 */
suspend fun main() {

    //runBlocking 阻塞当前线程，只能在测试时使用
    withContext(Dispatchers.Unconfined) {
        flow {
            println("Thread name1 = ${Thread.currentThread().name}")
            emit(1)
            emit(2)
            emit(3)
            emit(4)
        }.filter {
            println("Thread name2 = ${Thread.currentThread().name}")
            it > 2
        }.map {
            println("Thread name3 = ${Thread.currentThread().name}")
            it * it
        }.flowOn(Dispatchers.IO)
            .collect {
                println("Thread name4 = ${Thread.currentThread().name}")
                println(it)
            }
    }
    println("Thread name5 = ${Thread.currentThread().name}")

}

//等同于  (1..10).asFlow()
fun createFlow(): Flow<Int> = flow {
    for (i in 1..10) {
        emit(i)
    }
}
