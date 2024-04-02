package com.huawei.selenium.demo.core

import org.openqa.selenium.chromium.ChromiumDriver

/**
 * 脚本的抽象上下文
 * @author 梁景林
 * @date 2024/4/2 18:05
 */
interface Task {

    val name: String

    val driver: ChromiumDriver

    //脚本具体的执行逻辑
    suspend fun run(): Result<Unit>

}