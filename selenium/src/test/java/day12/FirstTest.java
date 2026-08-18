package com.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); // opens Chrome
        driver.get("https://www.google.com");  // navigates to URL
        System.out.println(driver.getTitle()); // prints page title
        driver.quit(); // closes browser and ends session
    }
}

