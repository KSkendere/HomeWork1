public class HomeWork1 {


    public static void main(String[] args) {

        int time = 11;
        int day, month, year;
        day = 15;
        month = 7;
        year = 2021;
        boolean yearIsCorrect = false;
        boolean monthIsCorrect = false;
        boolean dayIsCorrect = false;


        if ((time > 0) && (time <= 12)) {
            System.out.println("Good Morning Sunshine!");
        } else if ((time >= 13) && (time <= 19)) {
            System.out.println("Good Afternoon, Work Hard!");
        } else if ((time <= 20) && (time >= 24)) {
            System.out.println("Good Evening. Get some rest!");
        } else {
            System.out.println("Time should be in range from 1 ti66 24");
        }


        if ((year > 0) && (year <= 2021)) {
            yearIsCorrect =true;
            System.out.println("Year is correct.");
        } else {
            System.out.println("Year is not correct it must be in range from 0 till 2021.");
        }


        if ((month > 0) && (month <= 12)) {
            monthIsCorrect = true;
            System.out.println("Month is correct.");
        } else {
            System.out.println("Month is not correct,it must be in range from 1 till 12.");
        }


        if (((day > 0) && (day <= 30)) && ((month == 4) || (month == 6) || (month == 9) || (month == 11))) {
            dayIsCorrect = true;
            System.out.println("Day is correct.");
        } else if (((day <= 0) || (day > 30)) && ((month == 4) || (month == 6) || (month == 9) || (month == 11))) {
            System.out.println("Day is not correct. It must be in range from 1 till 30, if month is 4,6,9,11.");

        } else if (((day > 0) && (day <= 31)) && ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12))) {
            dayIsCorrect = true;
            System.out.println("Day is correct.");
        } else if (((day <= 0) || (day > 31)) && ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12))) {
            System.out.println("Day is not correct. It must be in range from 1 till 31, if month is 1,3,5,7,8,10,12;");

        } else if (((day > 0) && (day <= 28)) && (month == 2)) {
            dayIsCorrect = true;
            System.out.println("Day is correct.");
        } else if (((day == 29) && (month == 2)) && ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))) {
            dayIsCorrect = true;
            System.out.println("Day is correct.");
        } else if (((day == 29) && (month == 2)) && ((year % 4 == 0) && (year % 100 != 0))) {
            dayIsCorrect = true;
            System.out.println("Day is correct.");

        } else if (((day <= 0) || (day > 29) && (month == 2)) && ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))) {

            System.out.println("Day is not correct. It must be in range from 1 till 29, if month is 2 and it is leap year.");
        } else if (((day <= 0) || (day > 29) && (month == 2)) && ((year % 4 == 0) && (year % 100 != 0))) {

            System.out.println("Day is not correct. It must be in range from 1 till 29, if month is 2 and it is leap year.");

        } else if (((day <= 0) || (day > 28)) && ((month == 2))) {
            System.out.println("Day is not correct. It must be in range from 1 till 28, if month is 2 and it is not leap year");

        } else if ((day > 0) && (day <= 31)) {
            System.out.println("Day is correct.");
        } else {
            System.out.println("Day is not correct,it must be in range from 1 till 31.");
        }

        if (yearIsCorrect && monthIsCorrect  && dayIsCorrect) {
            System.out.println(year + "/" + month + "/" + day);
        }
    }
}



















