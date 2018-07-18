package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators extends BasicFunctions {
    WebElement enterButton = driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul[1]/li[2]/a"));
    WebElement loginField = driver.findElement(By.xpath("//*[@id=\"FloatLogin\"]/div/div/form/fieldset/p[1]/input"));
    WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"FloatLogin\"]/div/div/form/fieldset/p[2]/input"));
    WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"FloatLogin\"]/div/div/form/input[6]"));
    WebElement userName = driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul[1]/li[2]/a/b"));
}
