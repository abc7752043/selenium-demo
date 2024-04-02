package com.huawei.selenium.demo

import com.huawei.selenium.demo.scripts.Script1
import kotlinx.coroutines.runBlocking


fun main() = runBlocking {
    Script1().run()
    println("程序结束！！！")
}
