package com.pe.qa.pages;

import com.pe.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends TestBase {

    @FindBy(xpath = "//div[@class='category-cards']")
    public WebElement category;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public HomePage selectOptions(String option) {
        List<WebElement> elements = category.findElements(By.tagName("h5"));
        for (WebElement element : elements) {
            if (element.getText().equals(option)) {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].click();", element);
                break;
            }
        }
        return new HomePage();
    }


}
