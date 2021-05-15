package helpers;

import com.codeborne.selenide.Configuration;
import config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;

public class WebDriverHelper {
    private static final WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    public static boolean isRemote() {
        return config.isRemote();
    }

    public static void configureDriver(String baseUrl) {
        if (isRemote()) {
            Configuration.remote = config.getURL().toString();
        }
        Configuration.baseUrl = baseUrl;
        Configuration.browser = config.getBrowser().toString();
        Configuration.browserVersion = config.getBrowserVersion();
        Configuration.timeout = 5000;
    }
}
