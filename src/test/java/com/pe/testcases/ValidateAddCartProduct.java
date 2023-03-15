package com.pe.testcases;

import com.pe.qa.base.TestBase;
import com.pe.qa.pages.ProductPage;
import com.pe.qa.pages.UserPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateAddCartProduct extends TestBase {
    UserPage userPage;

    ProductPage productPage;

    public ValidateAddCartProduct() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();

        userPage = new UserPage();
        productPage = new ProductPage();
    }

    @Test
    public void validateAddCartProducts() {

        productPage = userPage.enterDataUser(prop.getProperty("user"), prop.getProperty("password"));
        boolean flagTituloProduct = userPage.validateTituloProducts(prop.getProperty("tituloProduct"));
        Assert.assertTrue(flagTituloProduct);

        productPage.escogerPrimerProducto();
        boolean flagTextButonFirstProduct = productPage.validateAddFirstProduct(prop.getProperty("textoBotonRemover"));
        Assert.assertTrue(flagTextButonFirstProduct);

        productPage.escogerIconoCart();
        boolean flagTextModalCart = productPage.validateModalCart(prop.getProperty("tituloModal"));
        Assert.assertTrue(flagTextModalCart);

        productPage.escogerOpcionCheckout();
        boolean flagTitleFormCart = productPage.validateTitleFormCheckout(prop.getProperty("tituloFormCheckout"));
        Assert.assertTrue(flagTitleFormCart);

        productPage.llenarFormulario("Esperanza", "Aquino", "519");
        boolean flagTitleFormulario = productPage.validateTitleFormFinishCheckout(prop.getProperty("tituloFormAfterCheckout"));
        Assert.assertTrue(flagTitleFormulario);

        productPage.finalizarForm();
        boolean flagMensajeFinish = productPage.validateFinish(prop.getProperty("mensajeFinish"));
        Assert.assertTrue(flagMensajeFinish);

        productPage.volverProduct();
        flagTituloProduct = userPage.validateTituloProducts(prop.getProperty("tituloProduct"));
        Assert.assertTrue(flagTituloProduct);


    }


    @AfterMethod
    public void close() {
        driver.quit();
    }


}
