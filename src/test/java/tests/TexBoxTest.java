package tests;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TexBoxTest {



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