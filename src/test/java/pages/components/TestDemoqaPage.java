package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TestDemoqaPage {
    CalendarComponent calendarComponent = new CalendarComponent();


    private SelenideElement firstNameInput = $("#firstName"),
            firstNameLocator = $("#firstName"),
            lastNameLocator = $("#lastName"),
            userEmailLocator = $("#userEmail"),
            genderLocator = $("#genterWrapper"),
            subjectLocator = $("#subjectsContainer input"),
            hobbiesLocator = $("#hobbiesWrapper"),
            userNumberLocator = $("#userNumber"),
            uploadPickureLocator = $("#uploadPicture"),
            setAddressLocator = $("#currentAddress"),
            stateLocator = $("#state input"),
            cityLocator = $("#city input"),
            submitLocator = $("#submit"),
            calendarInput = $("#dateOfBirthInput");

    public TestDemoqaPage setFirstName(String value){
        firstNameLocator.setValue(value);
        return this;
    }
    public TestDemoqaPage setLastName(String value){
        lastNameLocator.setValue(value);
        return this;
    }
    public TestDemoqaPage setUserEmail(String value){
        userEmailLocator.setValue(value);
        return this;
    }

    public TestDemoqaPage setGender(String value){
        genderLocator.$(byText(value)).doubleClick();
        return this;
    }

    public TestDemoqaPage setSubject(String value){
        subjectLocator.click();
        subjectLocator.setValue(value).pressEnter();
        return this;
    }

    public TestDemoqaPage setHobbies(String value){
        subjectLocator.click();
        hobbiesLocator.$(byText(value)).click();
        return this;
    }

    public TestDemoqaPage setUserNumber(String value){
        userNumberLocator.setValue(value);
        return this;
    }

    public TestDemoqaPage setDateOfBirth(String day, String month, String year) {
        calendarInput.click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

    public TestDemoqaPage uploadPicture(String value) {
        uploadPickureLocator.uploadFromClasspath(value);
        return this;
    }

    public TestDemoqaPage setAddress(String value){
        setAddressLocator.setValue(value);
        return this;
    }

    public TestDemoqaPage setState(String value){
        stateLocator.val(value).pressEnter();
        return this;
    }

    public TestDemoqaPage setCity(String value){
        cityLocator.val(value).pressEnter();
        return this;
    }

    public TestDemoqaPage pressSubmit(){
        submitLocator.click();
        return this;
    }
}





