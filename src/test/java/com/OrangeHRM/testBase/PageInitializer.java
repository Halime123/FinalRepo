package com.OrangeHRM.testBase;
import com.OrangeHRM.pages.*;
public class PageInitializer extends BaseClass {
    public static LoginPage loginPage;

    public static void initializePageObjects() {
        loginPage = new LoginPage();
    }
}