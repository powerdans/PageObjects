package pages.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;



public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1600x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";

    }
}