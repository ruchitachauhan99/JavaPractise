package com.practise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.plaf.TableHeaderUI;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SynchronizationPractise {

    public static void main(String[] args) throws InterruptedException {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(8));
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.cssSelector("#username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("#password")).sendKeys("Learning@830$3mK2");
        driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#okayBtn")));
        driver.findElement(By.cssSelector("#okayBtn")).click();
       // w.until(ExpectedConditions.alertIsPresent());

      //  driver.switchTo().alert().accept();

        WebElement drop = driver.findElement(By.cssSelector("select.form-control"));
     //   drop.click();
        Select dropdown = new Select(drop);
        dropdown.selectByVisibleText("Teacher");
        driver.findElement(By.cssSelector("#terms")).click();
        driver.findElement(By.id("signInBtn")).click();

//        List<WebElement> addButtons = w.until(
//                ExpectedConditions.visibilityOfAllElementsLocatedBy(
//                        By.cssSelector("button.btn-info")
//                )
//        );
//
//        for (WebElement button : addButtons) {
//            button.click();
//            Thread.sleep(1000);
//        }

        List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

        for(int i =0;i<products.size();i++)

        {
            System.out.println(products.get(i));
            products.get(i).click();

        }

        Thread.sleep(4000);
        driver.findElement(By.partialLinkText("Checkout")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
        Thread.sleep(2000);



    }
}
