package com.practise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class AmazonLinks_NewFrames {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =  new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Thread.sleep(1000);
     WebElement searchbox=   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
      searchbox.sendKeys("tshirts", Keys.ENTER);
        Thread.sleep(1000);

        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);

        driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
        Set<String> allwindows = driver.getWindowHandles();
        System.out.println(allwindows);

        // STEP 4: Find the new tab and switch to it

        for (String window : allwindows) {

            if (!window.equals(parentWindow)) {

                driver.switchTo().window(window);

                break;

            }

        }

        // STEP 5: We are now outside the loop

        System.out.println(

                "Current Window: " + driver.getWindowHandle()

        );

        Thread.sleep(2000);

        // STEP 6: Interact with the product page

        driver.findElement(By.id("add-to-cart-button")).click();

    }

}