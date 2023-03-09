package com.pe.qa.pages;

import com.pe.qa.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class UserPage extends TestBase {

    @FindBy(xpath = "//span[text()='Text Box']")
    private WebElement textBox;
    @FindAll({@FindBy(css = "#userName"), @FindBy(how = How.ID, using = "userName")})
    private WebElement fullNameTx;
    @FindBy(id = "userEmail")
    private WebElement emailTx;
    @FindBy(xpath = "//textarea[@id='currentAddress']")
    private WebElement currentAddressTx;
    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    private WebElement permanentAddressTx;
    @FindBy(id = "submit")
    private WebElement submit;
    @FindBy(id = "name")
    private WebElement name;
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

    public HomePage enterDataUser(String fullName, String email, String currentAddres, String permanAddress) {
        fullNameTx.sendKeys(fullName);
        emailTx.sendKeys(email);
        currentAddressTx.sendKeys(currentAddres);
        permanentAddressTx.sendKeys(permanAddress);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", submit);
        return new HomePage();
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


    public boolean validateFullName(String fullName) {
        return name.getText().contains(fullName);
    }

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
