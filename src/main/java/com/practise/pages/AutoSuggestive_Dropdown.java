package com.practise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.devtools.v148.dom.model.ShapeOutsideInfo;

import java.util.List;

public class AutoSuggestive_Dropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("Ind");
        Thread.sleep(3000);
        List<WebElement> Options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        System.out.println(Options);
      for( WebElement option : Options){
          System.out.println(option.getText());
          if(option.getText().equalsIgnoreCase("India")){
              option.click();
              System.out.println("Clicked");
              Thread.sleep(1000);
              break;
          }


      }
        driver.quit();

    }
}
