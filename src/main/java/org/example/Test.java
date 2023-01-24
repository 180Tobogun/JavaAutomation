package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import ui.Login;


public class Test {

    public static String pathDriver = "/Users/andfiend/Documents/chromedriver_mac_arm64/chromedriver";
    public static void main(String[] args) {
        System.setProperty("chromedriver", pathDriver);

        WebDriver driver = new ChromeDriver();

        driver.get("https://djinni.co/my/dashboard/");

        String salary = new Login(driver)
                .fillEmail("mail@gmail.com")
                .fillPassword("pass")
                .clickEnter()
                .clickMenuSalary()
                .clickTag("QA Automation")
                .getSalaryText();

        Assert.assertEquals(salary, "$3000 - $5000", "nopePidar");

        driver.close();
    }
}
