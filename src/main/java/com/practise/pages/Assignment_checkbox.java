package com.practise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Assignment_checkbox {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        // Count of Checkbox
      List<WebElement> list= driver.findElements(By.cssSelector("input[type='checkbox']"));
        System.out.println(list.size());


        driver.findElement(By.id("checkBoxOption1")).click();//Checked

        Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());//TRUE
        driver.findElement(By.id("checkBoxOption1")).click();//Unchecked
        Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());//Unclicked
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());//FALSE



    }
}
