package pages.tests;

import org.junit.jupiter.api.Test;
import pages.components.TestDemoqaPage;
import pages.components.ResultModal;
import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;

import static com.codeborne.selenide.Selenide.*;



    public class TestDemoqa extends TestBase {


        TestDemoqaPage registrationPage = new TestDemoqaPage();
        ResultModal resultModal1 = new ResultModal();


        @Test
        void fillformtest() {
            open("/automation-practice-form");
            registrationPage.openPage()
                    .setFirstName("Alisa")
                    .setLastName("Igorevna")
                    .setUserEmail("alex222@egorov.com")
                    .setUserNumber("754237867831")
                    .setDateOfBirth("30", "September", "1973")
                    .setHobbies("English")
                    .setGender("Female")
                    .uploadPicture("scrin.png")
                    .setAddress("g.Maxachkola ul. rambler d.11. kv.14")
                    .setSubject("English")
                    .setHobbies("Sports")
                    .setState("NCR")
                    .setCity("Delhi")
                    .pressSubmit();
            $(".modal-dialog").should(appear);
            $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
            $(".table-responsive").shouldHave(text("Alisa"), text("Igorevna"),
                    text("alex@egorov.com"), text("English"),
                    text("g.Maxachkola ul. rambler d.11. kv.14"), text("Sports"),
                    text("scrin.png"), text("NCR"), text("Delhi"), text("Female"));
            resultModal1.checkResult1("Student Name", "Alisa Igorevna")
                    .checkResult1("Student Email", "alex@egorov.com")
                    .checkResult1("Gender", "Female")
                    .checkResult1("Mobile", "754237867831")
                    .checkResult1("Date of Birth", "30", "September", "1973")
                    .checkResult1("Subjects", "English")
                    .checkResult1("Hobbies")
                    .checkResult1("Picture", "scrin.png")
                    .checkResult1("Address,g.Maxachkola ul. rambler d.11. kv.14")
                    .checkResult1("State and City", "NCR Delhi");


        }

        @Test
        void NegativefillFormTest() {
            open("/automation-practice-form");
            registrationPage.openPage()
                    .setFirstName("Alisa")
                    .setLastName("Igorevna")
                    .setUserEmail("alex222@egorov.com")
                    .setUserNumber("SSSSSSss");

            $("#submit").pressEnter();

        }
    }


