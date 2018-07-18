package tests;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class LoginSteps {
    private WebDriver driver;

    @Given("^Main page is opened$")
    public void mainPageIsOpened() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProjects\\CucumberAT\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.i.ua/");
    }

    @When("^I click Enter button$")
    public void iClickEnterButton() throws Throwable {
        WebElement enterButton = driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul[1]/li[2]/a"));
        enterButton.click();
    }

    @And("^I insert login$")
    public void iInsertLogin() throws Throwable {
        WebElement loginField = driver.findElement(By.xpath("//*[@id=\"FloatLogin\"]/div/div/form/fieldset/p[1]/input"));
        loginField.sendKeys("testhw2@i.ua");
    }

    @And("^I insert password$")
    public void iInsertPassword() throws Throwable {
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"FloatLogin\"]/div/div/form/fieldset/p[2]/input"));
        passwordField.sendKeys("123qwe1");
    }

    @And("^I click Submit button$")
    public void iClickSubmitButton() throws Throwable {
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"FloatLogin\"]/div/div/form/input[6]"));
        loginButton.click();
    }

    @Then("^Name of user is correct$")
    public void nameOfUserIsCorrect() throws Throwable {
        WebElement userName = driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul[1]/li[2]/a/b"));
        userName.getText().equals("test");
    }

    @And("^Browser is closed$")
    public void browserIsClosed() throws Throwable {
        driver.quit();
    }
}
