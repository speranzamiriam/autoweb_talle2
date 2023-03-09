package com.pe.testcases;

import com.pe.qa.base.TestBase;
import com.pe.qa.pages.HomePage;
import com.pe.qa.pages.UserPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateUser extends TestBase {
    UserPage userPage;
    HomePage homePage;

    public ValidateUser() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        homePage = new HomePage();
        userPage = new UserPage();
    }

    @Test
    public void validateUser() {
        homePage.selectOptions("Elements");
        userPage.selectElements();
        homePage = userPage.enterDataUser(prop.getProperty("username"), prop.getProperty("email"), "Jiron Salaverry", "Jiron Salaverry");
        boolean flagFullName = userPage.validateFullName(prop.getProperty("username"));
        Assert.assertTrue(flagFullName);
        boolean flagEmail = userPage.validateEmail(prop.getProperty("email"));
        Assert.assertTrue(flagEmail);
        boolean flagCurrentAddress = userPage.validateFullName("Jiron Salaverry");
        Assert.assertTrue(flagCurrentAddress);
        boolean flagPermanetAddress = userPage.validateFullName("Jiron Salaverry");
        Assert.assertTrue(flagPermanetAddress);
    }


    @AfterMethod
    public void close() {
        driver.quit();
    }


}
