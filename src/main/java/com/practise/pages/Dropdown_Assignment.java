package com.practise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdown_Assignment {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Ruchita");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@name='email'])")).sendKeys("chauhanruchita27@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("Ruchita@123");
        Thread.sleep(2000);
        driver.findElement(By.id("exampleCheck1")).click();
        Thread.sleep(2000);
        WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select drop = new Select(dropdown);
       drop.selectByVisibleText("Female");
        Assert.assertFalse( driver.findElement(By.id("inlineRadio3")).isEnabled());
        driver.findElement(By.id("inlineRadio1")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("bday")).sendKeys("27/04/1999");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
        Thread.sleep(2000);
        System.out.println( driver.findElement(By.xpath("//div[contains(@class,'alert-success')]")).getText());
     //  Assert.assertEquals(driver.findElement(By.xpath("//div[contains(@class,'alert-success')]")).getText(),"Success! The Form has been submitted successfully!.");

        driver.close();

    }
}
