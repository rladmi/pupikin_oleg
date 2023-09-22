package homework_nr_6;

public class Date {

    private int day;
    private int month;
    private int year;


    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    public int getDay() {
        if (this.day < 1) {
            System.out.println("Wrong Day Format");

        } else if (this.day > 31) {
            System.out.println("Wrong Day Format");
        } else {
            return day;
        }

        return 1;
    }

    public int getMonth() {
        if (this.month < 1) {
            System.out.println("Wrong Month Format");

        } else if (this.month > 12) {
            System.out.println("Wrong Month Format");
        } else {
            return month;
        }

        return 1;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int date) {
        {
            if (this.day < 1) {
                System.out.println("Wrong Day Format");
            } else if (this.day > 31) {
                System.out.println("Wrong Day Format");
            }
            this.day = date;
        }

    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {

        Date today = new Date(
                1,
                9,
                2023);


        today.setDay(50);
        today.setYear(2022);
        today.setMonth(15);

        System.out.println(today.getDay() + "/" + today.getMonth() + "/" + today.getYear());
    }
}
