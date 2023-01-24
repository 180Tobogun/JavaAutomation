package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Login {
    private final WebDriver webDriver;
    public Login (WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private final By inputEmail = By.name("email");
    private final By inputPassword = By.id("password");

    public Login fillEmail(String email) {
        webDriver.findElement(inputEmail).sendKeys(email);
        return this;
    }

    public Login fillPassword(String password) {
        webDriver.findElement(inputPassword).sendKeys(password);
        return this;
    }

    public Dashboard clickEnter() {
        webDriver.findElement(inputPassword).sendKeys(Keys.ENTER);
        return new Dashboard(webDriver);
    }
}
