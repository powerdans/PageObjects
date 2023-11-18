package pages.tests;

import org.junit.jupiter.api.Test;
import pages.components.TestDemoqaPage;
import pages.components.CheckResult;
import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;

import static com.codeborne.selenide.Selenide.*;



    public class TestDemoqa extends TestBase {


        TestDemoqaPage registrationPage = new TestDemoqaPage();
        CheckResult checkResult1=new CheckResult();


        @Test
        void fillformtest() {
            open("/automation-practice-form");
            registrationPage.openPage()
                    .setFirstName("Alisa")
                    .setLastName("Igorevna")
                    .setEmail("alex222@egorov.com")
                    .setUserNumber("754237867831")
                    .setDateOfBirth("30", "September", "1973")
                    .setHobbies("English")
                    .setGender("Female")
                    .uploadPicture("scrin.png")
                    .setAddress("g.Maxachkola ul. rambler d.11. kv.14")
                    .setSubjects("English").click
                    .setHobbies("Sports").click
                    .setState("NCR").pressEnter()
                    .setCity("Delhi").pressEnter()
                    .pressSubmit();
            $(".modal-dialog").should(appear);
            $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
            $(".table-responsive").shouldHave(text("Alisa"), text("Igorevna"),
                    text("alex@egorov.com"), text("English"),
                    text("g.Maxachkola ul. rambler d.11. kv.14"), text("Sports"),
                    text("scrin.png"),text("NCR"),text("Delhi"),text("Female"));
            registrationPage.checkResult1("Student Name", "Alex Egorov")
                    .checkResult("Student Email", "alex@egorov.com")
                    .checkResult("Gender","Female")
                    .checkResult("Mobile,754237867831")
                    .checkResult("Date of Birth,30 September,1973")
                    .checkResult("Subjects,English")
                    .checkResult("Hobbies")
                    .checkResult("Picture,scrin.png")
                    .checkResult("Address,g.Maxachkola ul. rambler d.11. kv.14")
                    .checkResult("State and City,NCR Delhi");


        }
        // @Test
        // void NegativefillFormTest(){
        //   open("/automation-practice-form");
       // registrationPage.openPage()
        ///      .setFirstName("Alisa")
        //   .setLastName("Igorevna")
        // .setEmail("alex222@egorov.com")
        //setUserNumber("SSSSSSss");

        //   $("#submit").pressEnter();

    }


