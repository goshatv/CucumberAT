package tests;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginSteps extends BasicFunctions {

    @Given("^ChromeDriver is started$")
    public void chromedriverIsStarted() throws Throwable {
        startChromeDriver();
    }

    @Given("^Main page is opened$")
    public void mainPageIsOpened() throws Throwable {
        goToUrl("http://www.i.ua/");
    }

    @When("^I click Enter button$")
    public void iClickEnterButton() throws Throwable {
//        locator.enterButton.click();
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
        stopChromeDriver();
    }

    @And("^I insert incorrect login$")
    public void iInsertIncorrectLogin() throws Throwable {
        WebElement loginField = driver.findElement(By.xpath("//*[@id=\"FloatLogin\"]/div/div/form/fieldset/p[1]/input"));
        loginField.sendKeys("12345");
    }

    @Then("^Error message is displayed in new tab$")
    public void errorMessageIsDisplayedInNewTab() throws Throwable {
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"lform_errCtrl\"]/div[1]"));
        errorMessage.getText().equals("Неверный логин или пароль");
    }

    @Given("^Authorization is completed$")
    public void authorizationIsCompleted() throws Throwable {
        startChromeDriver();
        goToUrl("http://www.i.ua/");
        WebElement enterButton = driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul[1]/li[2]/a"));
        enterButton.click();
        WebElement loginField = driver.findElement(By.xpath("//*[@id=\"FloatLogin\"]/div/div/form/fieldset/p[1]/input"));
        loginField.sendKeys("testhw2@i.ua");
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"FloatLogin\"]/div/div/form/fieldset/p[2]/input"));
        passwordField.sendKeys("123qwe1");
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"FloatLogin\"]/div/div/form/input[6]"));
        loginButton.click();
    }

    @When("^I click on Write letter button$")
    public void iClickOnWriteLetterButton() throws Throwable {
        WebElement writeLetterButton = driver.findElement(By.xpath("//*[@id=\"tabcont600\"]/div[2]/div[1]/div[1]/a[3]"));
        writeLetterButton.click();
    }

    @And("^I insert recipient email$")
    public void iInsertRecipientEmail() throws Throwable {
        WebElement recEmail = driver.findElement(By.id("to"));
        recEmail.sendKeys("testhw2@i.ua");
    }

    @And("^I insert topic$")
    public void iInsertTopic() throws Throwable {
        WebElement topicField = driver.findElement(By.name("subject"));
        topicField.sendKeys("random topic :)");
    }

    @And("^I insert letter body")
    public void iInsertLetterBody() throws Throwable {
        WebElement topicField = driver.findElement(By.xpath("//*[@id=\"text\"]"));
        topicField.sendKeys("Hello, World!!!");
    }

    @And("^I click send button$")
    public void iClickSendButton() throws Throwable {
        WebElement sendButton = driver.findElement(By.name("send"));
        sendButton.click();
    }

    @And("^I open myself inbox$")
    public void iOpenMyselfInbox() throws Throwable {
        WebElement inboxFolder = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div/div[2]/div[2]/div[3]/ul/li[1]/a"));
        inboxFolder.click();
    }

    @And("^I open last new email$")
    public void iOpenLastNewEmail() throws Throwable {
        WebElement lastEmail = driver.findElement(By.xpath("//*[@id=\"mesgList\"]/form/div[1]/a/span[2]"));
        lastEmail.click();
    }

    @Then("^Topic of email is correct$")
    public void topicOfEmailIsCorrect() throws Throwable {
        WebElement topicInbox = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/ul/li/div[1]/div/div[2]/h3"));
        topicInbox.getText().contentEquals("random topic :)");
    }

    @And("^Sender email is correct$")
    public void senderEmailIsCorrect() throws Throwable {
        WebElement senderEmail = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/ul/li/div[1]/div/div[2]/div[1]/div[2]/a"));
        senderEmail.getText().contentEquals("testhw2@i.ua");
    }

    @And("^Body of email is correct$")
    public void bodyOfEmailIsCorrect() throws Throwable {
        WebElement bodyEmail = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/ul/li/div[1]/div/div[3]/pre"));
        bodyEmail.getText().contentEquals("Hello, World!!!");
    }
}
