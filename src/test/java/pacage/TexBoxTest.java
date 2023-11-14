package pacage;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TexBoxTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000; // default 4000
    }

    @Test
    void fillFormTest() {
        open("/text-box");
        $("#userName").setValue("Alisa");
        $("#userEmail").setValue("alex@egorov.com");
        $("#currentAddress").setValue("Sg.Maxachkola ul. rambler d.11. kv.14");
        $("#permanentAddress").setValue("Another street 2");
        $("#submit").click();

        $("#output #name").shouldHave(text("Alisa"));
        $("#output #email").shouldHave(text("alex@egorov.com"));
        $("#output #currentAddress").shouldHave(text("Sg.Maxachkola ul. rambler d.11. kv.14"));
        $("#output #permanentAddress").shouldHave(text("Another street 2"));
    }
}