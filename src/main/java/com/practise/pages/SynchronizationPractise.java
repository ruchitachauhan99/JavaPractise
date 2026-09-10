package com.practise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SynchronizationPractise {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));
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

        List<WebElement> cards = w.until(

                ExpectedConditions.visibilityOfAllElementsLocatedBy(

                        By.xpath("//div[@class='card-body']")

                )

        );

        for (WebElement card : cards) {

            System.out.println(card.getText());

        }



    }
}
