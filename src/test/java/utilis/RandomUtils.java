package utilis;


import pages.TestDemoqaPage;
import org.junit.jupiter.api.Test;
import pages.components.ResultModal;
import tests.TestBase;
import tests.TestFaker;


public class RandomUtils extends TestBase {
    TestDemoqaPage registrationPage = new TestDemoqaPage();
    ResultModal resultModal1 = new ResultModal();
    TestFaker data=new TestFaker();
    @Test
    void checkFormRegistration() {
        registrationPage.openPage()
                .setFirstName(data.firstName)
                .setLastName(data.lastName)
                .setUserEmail(data.userEmail)
                .setGender(data.gender)
                .setUserNumber(data.userNumber)
                .setDateOfBirth(data.year, data.month, data.day)
                .setSubject(data.subject)
                .setHobbies(data.hobbies)
                .uploadPicture(data.pictureName)
                .setAddress(data.address)
                .setState(data.state)
                .setCity(data.city)
                .pressSubmit();
        resultModal1.checkResult1("Student Name", data.firstName + " " + data.lastName)
                .checkResult1("Student Email", data.userEmail)
                .checkResult1("Gender", data.gender)
                .checkResult1("Mobile", data.userNumber)
                .checkResult1("Date of Birth", data.year)
                .checkResult1("Date of Birth", data.month)
                .checkResult1("Date of Birth", data.day)
                .checkResult1("Subjects", data.subject)
                .checkResult1("Hobbies", data.hobbies)
                .checkResult1("Picture", data.pictureName)
                .checkResult1("Address", data.address)
                .checkResult1("State and City", data.city)
                .checkResult1("State and City", data.state);
    }

}






