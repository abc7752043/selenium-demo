package com.huawei.selenium.demo.scripts

import WebDriverFactory
import com.huawei.selenium.demo.core.Task
import com.huawei.selenium.demo.core.TaskResult
import org.openqa.selenium.By
import org.openqa.selenium.chromium.ChromiumDriver
import java.time.Duration


class Script1 : Task {

    override val name: String = "Test1"

    override val driver: ChromiumDriver by WebDriverFactory.getChromiumDriver()

    override suspend fun run(): Result<Unit> {
        driver["https://www.selenium.dev/selenium/web/web-form.html"]

        val title = driver.getTitle()
        println("Web form $title")

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500))

        val textBox = driver.findElement(By.name("my-text"))
        val submitButton = driver.findElement(By.cssSelector("button"))

        textBox.sendKeys("Selenium")
        submitButton.click()

        val message = driver.findElement(By.id("message"))
        val value = message.text
        println("Received! $value")

        driver.quit()
        return TaskResult.success
    }
}