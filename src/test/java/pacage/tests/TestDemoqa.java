package pacage.tests;

import org.junit.jupiter.api.Test;
import pacage.TestDemoqaPageObjects;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


    public class TestDemoqa extends TestBase {


        TestDemoqaPageObjects registrationPage = new TestDemoqaPageObjects();
    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        registrationPage.openPage()
                .setFirstName("Alisa")
                .setLastName("Igorevna")
                .setEmail("alex222@egorov.com")
                .setUserNumber("754237867831")
                .setDateOfBirth("30", "September", "1973");


        $("#subjectsInput").setValue("English").pressEnter();
        $("[for='hobbies-checkbox-1']").click();
        $("#uploadPicture").uploadFromClasspath("scrin.png");
        $("#currentAddress").setValue("g.Maxachkola ul. rambler d.11. kv.14");
        $("[id=react-select-3-input]").setValue("NCR").pressEnter();
        $("[id=react-select-4-input]").setValue("Noida").pressEnter();

        $("#submit").pressEnter();
    }
        @Test
        void NegativefillFormTest(){
            open("/automation-practice-form");
            registrationPage.openPage()
                    .setFirstName("Alisa")
                    .setLastName("Igorevna")
                    .setEmail("alex222@egorov.com")
                    .setUserNumber("SSSSSSss");



            $("#subjectsInput").setValue("English").pressEnter();
            $("[for='hobbies-checkbox-1']").click();
            $("#currentAddress").setValue("g.Maxachkola ul. rambler d.11. kv.14");
            $("[id=react-select-3-input]").setValue("NCR").pressEnter();
            $("[id=react-select-4-input]").setValue("Noida").pressEnter();

            $("#submit").pressEnter();

        }



}


