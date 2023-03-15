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

    //------------------------------------------------------------
    @FindBy(xpath = "//span[text()='Text Box']")
    private WebElement textBox;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    private WebElement currentAddressTx;
    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    private WebElement permanentAddressTx;
    @FindBy(id = "submit")
    private WebElement submit;

    @FindBy(id = "email")
    private WebElement email;
    @FindBy(xpath = "//p[@id='currentAddress'])")
    private WebElement currentAddress;
    @FindBy(xpath = "//p[@id='permanentAddress']")
    private WebElement permanentAddress;

    public UserPage() {
        PageFactory.initElements(driver, this);
    }

    public void selectElements() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", textBox);
    }

    public HomePage enterDataUser(String user, String password) {
        userTx.sendKeys(user);
        passwordTx.sendKeys(password);
        loginBtn.click();
        return new HomePage();
    }
    public boolean validateTituloProducts(String fullName) {
        return tituloProducts.getText().contains(fullName);
    }
/*
    public void ejemplo(){
        textBox
                driver.findElement(By.xpath("xxxxx"));
    }
    public void ejemplo(){
        textBox
        driver.findElement(By.xpath("xxxx"));
    }
    public void ejemplo(){
        textBox
        driver.findElement(By.xpath("xxxx"));
    }
    public void ejemplo(){
        textBox
        driver.findElement(By.xpath("xxxxxx"));
    }
    public void ejemplo(){
        textBox
        driver.findElement(By.xpath("xxxxx"));
    }
    public void ejemplo(){
        textBox
        driver.findElement(By.xpath("xxxxx"));
    }
    public void ejemplo(){
        textBox
        driver.findElement(By.xpath("xxxxxx"));
    }
    public void ejemplo(){
        textBox
    }
    public void ejemplo(){
        textBox
    }
    public void ejemplo(){

    }
    public void ejemplo(){

    }
    public void ejemplo(){

    }
*/




    public boolean validateEmail(String UserEmail) {
        return email.getText().contains(UserEmail);
    }

    public boolean validateCurrentAddress(String cAddress) {
        return currentAddress.getText().contains(cAddress);
    }

    public boolean validatePermAddress(String pAddress) {
        return permanentAddress.getText().contains(pAddress);
    }


}
