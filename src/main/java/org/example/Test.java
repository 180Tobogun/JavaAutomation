package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import ui.Login;


public class Test {
    public static void main(String[] args) {
        System.setProperty("chromedriver", "/Users/andfiend/Documents/chromedriver_mac_arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://djinni.co/my/dashboard/");

        String salary = new Login(driver)
                .fillEmail("test")
                .fillPassword("test")
                .clickEnter()
                .clickMenuSalary()
                .clickTag("QA Automation")
                .getSalaryText();

        Assert.assertEquals(salary, "$3000 - $4500", "nopePidar");

        driver.close();
    }
}
