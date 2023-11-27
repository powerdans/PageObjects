package tests;

import org.junit.jupiter.api.Test;
import pages.TestDemoqaPage;
import pages.components.ResultModal;





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
                        .setUserNumber("7542378678")
                        .setDateOfBirth("1973", "September", "30")
                        .setGender("Female")
                        .uploadPicture("scrin.png")
                        .setAddress("g.Maxachkola ul. rambler d.11. kv.14")
                        .setSubject("English")
                        .setHobbies("Sports")
                        .setState("NCR")
                        .setCity("Delhi")
                        .pressSubmit();
            resultModal1.checkResult1("Student Name", "Alisa Igorevna")
                    .checkResult1("Student Email", "alex222@egorov.com")
                    .checkResult1("Gender", "Female")
                    .checkResult1("Mobile", "7542378678")
                    .checkResult1("Date of Birth","30 September,1973")
                    .checkResult1("Subjects", "English")
                    .checkResult1("Hobbies","Sports")
                    .checkResult1("Picture", "scrin.png")
                    .checkResult1("Address","g.Maxachkola ul. rambler d.11. kv.14")
                    .checkResult1("State and City", "NCR Delhi");

        }
        @Test
        void minmalfillformtest() {
            open("/automation-practice-form");
            registrationPage.openPage()
                    .setFirstName("Alisa")
                    .setLastName("Igorevna")
                    .setUserNumber("7542378678")
                    .setGender("Female");
            $("#submit").pressEnter();
            resultModal1.checkResult1("Student Name", "Alisa Igorevna")
                    .checkResult1("Gender", "Female")
                    .checkResult1("Mobile", "7542378678");

        }

        @Test
        void negativeFormTest() {
            open("/automation-practice-form");
            registrationPage.openPage()
                    .setFirstName("Alisa")
                    .setLastName("Igorevna")
                    .setUserEmail("alex222@egorov.com")
                    .setUserNumber("SSSSSSss");
            $("#submit").pressEnter();
                registrationPage.tableHidden();



        }
    }


