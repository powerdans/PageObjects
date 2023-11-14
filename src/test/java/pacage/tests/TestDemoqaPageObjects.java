package pacage.tests;

import com.codeborne.selenide.SelenideElement;
import pacage.companents.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TestDemoqaPageObjects {
    CalendarComponent calendarComponent = new CalendarComponent();


    private SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            calendarInput = $("#dateOfBirthInput");



    public TestDemoqaPageObjects openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public TestDemoqaPageObjects setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public TestDemoqaPageObjects setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public TestDemoqaPageObjects setEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public TestDemoqaPageObjects setGender(String value) {
        genderWrapper.$(byText(value)).click();

        return this;
    }

    public TestDemoqaPageObjects setUserNumber(String value) {
        userNumberInput.setValue(value);

        return this;
    }

    public TestDemoqaPageObjects setDateOfBirth(String day, String month, String year) {
        calendarInput.click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

    public TestDemoqaPageObjects checkResult(String key, String value) {
        $(".table-responsive").$(byText(key)).parent()
                .shouldHave(text(value));

        return this;
    }
}






