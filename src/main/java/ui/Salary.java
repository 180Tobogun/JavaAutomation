package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Salary {
    private WebDriver webDriver;

    public Salary(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private final By textSalary = By.xpath("//div[@class = 'summary-stastistics--item summary-stastistics--item_vacancies']" +
            " //div[@class = 'summary-item']" +
            " [2] " +
            "//div[@class = 'summary-item--value']");

    public Salary clickTag(String tag) {
        By tag1 = By.xpath("//*[contains (text(), '" + tag + "')]");
        webDriver.findElement(tag1).click();
        return this;
    }

    public String getSalaryText() {
        return webDriver.findElement(textSalary).getText();
    }
}
