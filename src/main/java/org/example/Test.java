package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.setProperty("chromedriver", "/Users/andfiend/Documents/chromedriver_mac_arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://djinni.co/my/dashboard/");

        WebElement loginEmail = driver.findElement(By.id("email"));
        loginEmail.sendKeys();

        WebElement webelement = driver.findElement(By.xpath("//li[@class = 'nav-item active']"));

        webelement.click();

        WebElement findProf = driver.findElement(By.xpath("//*[contains (text(), 'QA Automation')]"));

        findProf.click();

        List<WebElement> checkSalary = driver.findElements(By.xpath(
                "//div[@class = 'summary-stastistics--item summary-stastistics--item_vacancies']" +
                " //div[@class = 'summary-item']" +
                " [2] " +
                "//div[@class = 'summary-item--value']"));

        if (checkSalary.size() == 1) {
            System.out.println("element present");
        } else {
            System.out.println("cant find");
        }
    }
}
