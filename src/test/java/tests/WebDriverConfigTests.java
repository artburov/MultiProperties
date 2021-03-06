package tests;

import config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class WebDriverConfigTests {
    @Test
    public void ConfigTest() {
        System.setProperty("webdriver.url", "https://user1:1234@selenoid.autotests.cloud/wd/hub/");
        WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

        assertThat(config.getURL().toString()).isEqualTo("https://user1:1234@selenoid.autotests.cloud/wd/hub/");
    }
}
