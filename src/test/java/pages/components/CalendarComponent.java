package pages.components;


import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDate(String day, String month, String year) {
        $(".react-datepicker__month-select").selectOption("September");
        $(".react-datepicker__year-select").selectOption("1973");
        $(".react-datepicker__day--030:not(.react-datepicker__day--outside-month)").click();
    }
}