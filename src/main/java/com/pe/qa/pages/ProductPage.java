package com.pe.qa.pages;

import com.pe.qa.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends TestBase {

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addCartFirstProduct;
    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement removeCartFirstProduct;

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a/span")
    private WebElement iconCart;

    @FindBy(xpath = "//a[@id='item_4_title_link']/div")
    private WebElement titleModalCart;

    @FindBy(id = "checkout")
    private WebElement checkoutBtn;

    @FindBy(xpath = "//div[@id='header_container']/div[2]/span")
    private WebElement titleFormCheckout;

    @FindBy(id = "first-name")
    private WebElement formFirstNameTx;
    @FindBy(id = "last-name")
    private WebElement formLastNameTx;
    @FindBy(id = "postal-code")
    private WebElement formPostalCodeTx;
    @FindBy(id = "continue")
    private WebElement formContinueBtn;

    @FindBy(xpath = "//a[@id='item_4_title_link']/div")
    private WebElement titleFormFinish;

    @FindBy(id = "finish")
    private WebElement finishBtn;


    @FindBy(xpath = "//div[@id='checkout_complete_container']/h2")
    private WebElement titleFinish;

    @FindBy(id = "back-to-products")
    private WebElement backProdcutsBtn;



    //------------------------------------------------------------

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }



    public ProductPage escogerPrimerProducto() {
        addCartFirstProduct.click();
        return new ProductPage();
    }
    public boolean validateAddFirstProduct(String fullName) {
        String texto = removeCartFirstProduct.getText();
        return removeCartFirstProduct.getText().contains(fullName);
    }
    public void escogerIconoCart() {
        iconCart.click();
    }
    public boolean validateModalCart(String fullName) {
        return titleModalCart.getText().contains(fullName);
    }
    public void escogerOpcionCheckout() {
        checkoutBtn.click();
    }
    public boolean validateTitleFormCheckout(String fullName) {
        return titleFormCheckout.getText().contains(fullName);
    }

    public void llenarFormulario(String firstName,String lastName,String postalCode) {
        formFirstNameTx.sendKeys(firstName);
        formLastNameTx.sendKeys(lastName);
        formPostalCodeTx.sendKeys(postalCode);
        formContinueBtn.click();
    }

    public boolean validateTitleFormFinishCheckout(String fullName) {
        return titleFormFinish.getText().contains(fullName);
    }

    public void finalizarForm() {
        finishBtn.click();
    }

    public boolean validateFinish(String fullName) {
        return titleFinish.getText().contains(fullName);
    }
    public void volverProduct() {
        backProdcutsBtn.click();
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





}
