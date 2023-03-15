package com.pe.qa.pages;

import com.pe.qa.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class UserPage extends TestBase {

    @FindBy(id = "user-name")
    private WebElement userTx;
    @FindBy(id = "password")
    private WebElement passwordTx;

    @FindBy(id = "login-button")
    private WebElement loginBtn;

    @FindBy(xpath = "//div[@id='header_container']/div[2]/span")
    private WebElement tituloProducts;


    public UserPage() {
        PageFactory.initElements(driver, this);
    }



    public ProductPage enterDataUser(String user, String password) {
        userTx.sendKeys(user);
        passwordTx.sendKeys(password);
        loginBtn.click();
        return new ProductPage();
    }
    public boolean validateTituloProducts(String fullName) {
        return tituloProducts.getText().contains(fullName);
    }



}
