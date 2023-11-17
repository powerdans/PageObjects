package pages.tests;

import org.junit.jupiter.api.Test;
import pages.components.TestDemoqaPage;

import static com.codeborne.selenide.Selenide.*;


    public class TestDemoqa extends TestBase {


        TestDemoqaPage registrationPage = new TestDemoqaPage();
    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        registrationPage.openPage()
                .setFirstName("Alisa")
                .setLastName("Igorevna")
                .setEmail("alex222@egorov.com")
                .setUserNumber("754237867831")
                .setDateOfBirth("30", "September", "1973")
                .setHobbies("English")
                .uploadPicture("scrin.png")
                .setAddress("g.Maxachkola ul. rambler d.11. kv.14")
                .setSubjects.click
                .setHobbies.click
                .setState.pressEnter()
                .setCity.pressEnter()
                .pressSubmit();

    }
        // @Test
       // void NegativefillFormTest(){
         //   open("/automation-practice-form");
           /// registrationPage.openPage()
              ///      .setFirstName("Alisa")
                 //   .setLastName("Igorevna")
                   // .setEmail("alex222@egorov.com")
                    //setUserNumber("SSSSSSss");

         //   $("#submit").pressEnter();

        }



}


