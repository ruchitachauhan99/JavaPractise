package com.practise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {
    public static void main(String[] args) {
        System.out.println("1. Program started");
        WebDriver driver =new ChromeDriver();
        System.out.println("2. ChromeDriver created");

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser

        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        System.out.println( driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).getDomAttribute("name"));
    }
}
