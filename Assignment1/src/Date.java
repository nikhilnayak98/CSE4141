import java.time.LocalDate;
import java.time.Period;

public class Date {

    int day, month, year;

    public Date() {}

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    void printDate() {
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }

    void calculateAge(Date d) {
        LocalDate localDate1 = LocalDate.of(this.year, this.month, this.day);
        LocalDate localDate2 = LocalDate.of(d.year, d.month, d.day);
        Period period = Period.between(localDate1, localDate2);
        System.out.println(period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days");
    }
}
