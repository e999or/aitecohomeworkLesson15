package com.github.Lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;


public class SimpleTest {
    private static final Logger LOG = LoggerFactory.getLogger(SimpleTest.class);

    @BeforeClass
    public void beforeTestClass() {
        LOG.info("Before class ComplexTest");
    }

    @AfterClass
    public void afterxTestClass() {
        LOG.info("After class ComplexTest");
    }

    @BeforeMethod
    public void beforeTestMethod() {
        LOG.info("Before ComplexTest method");
    }

    @AfterMethod
    public void afterTestMethod() {
        LOG.info("After Test method");
    }

    @Test
    public void simpleTest() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromеdriver.exe");
        LOG.info("Simple test");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://yandex.ru/");
        WebElement input = webDriver.findElement(By.id("text"));
        input.sendKeys("Руддщ цщкдв");
        WebElement button = webDriver.findElement(By.className("button suggest2-form__button button_theme_websearch button_size_ws-head i-bem button_js_inited"));
    }




}



