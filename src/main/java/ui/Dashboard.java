package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {
    private final WebDriver webDriver;
    public Dashboard (WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private final By menuSalary = By.xpath("//div[1]/nav/div/div[2]/ul[1]/li[3]/a");

    public Salary clickMenuSalary() {
        webDriver.findElement(menuSalary).click();
        return new Salary(webDriver);
    }

}
