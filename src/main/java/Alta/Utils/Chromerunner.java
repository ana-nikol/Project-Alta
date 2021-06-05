package Alta.Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class Chromerunner {
    @BeforeTest(description = "Configure browser before tests")
    public void setup() {
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
        Configuration.startMaximized = true;
        Selenide.open("https://alta.ge/");
    }

    @AfterTest
    public static void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();

    }
}
