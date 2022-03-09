package ru.omsu.imit;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class UITesting extends BaseTest {
    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void pageTest() {
        PageObject pageObject = PageFactory.initElements(driver, PageObject.class);
        pageObject.open();

        assertTrue(pageObject.isShowAnswerButtonExist());
        assertTrue(pageObject.isLinkForAnswerExist());
        assertTrue(pageObject.isHideAnswerButtonExist());
    }


}
