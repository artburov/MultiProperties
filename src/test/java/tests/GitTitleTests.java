package tests;

import com.codeborne.selenide.Selenide;
import config.TestDataConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static helpers.WebDriverHelper.configureDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GitTitleTests {

    static TestDataConfig testDataConfig = ConfigFactory.create(TestDataConfig.class, System.getProperties());

    @BeforeAll
    static void runWebResource() {
        //Using webdriver.url or baseURL, depends on isRemote property
        configureDriver(testDataConfig.baseUrl());
    }

    @Test
    public void testWebDriver() {
        open("");
        assertEquals("GitHub: Where the world builds software · GitHub", Selenide.title());
    }
}