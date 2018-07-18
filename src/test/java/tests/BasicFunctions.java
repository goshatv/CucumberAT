package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicFunctions {

    protected WebDriver driver;

    protected void startChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProjects\\CucumberAT\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    public void goToUrl(String url) {
        driver.navigate().to(url);
    }

    protected void stopChromeDriver() {
        driver.quit();
    }
}

