import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chromium.ChromiumDriver

/**
 *
 * @author 梁景林
 * @date 2024/4/2 18:05
 */
object WebDriverFactory {

    fun getChromiumDriver(): Lazy<ChromiumDriver> {
        return lazy { ChromeDriver() }
    }
}