package notes.InterfacesAndAbstractClasses;

public class Company {
    public static void main(String[] args) {

        Employee numberBot = new Accountant("accountantBot", "Accounting");
        Employee cleanerBot = new Custodian("cleanerBot", "Maintenance");

        System.out.println("What is your name and department?:  " + cleanerBot.getName() + " | " + cleanerBot.getDepartment());
        System.out.println("cleanerBot.work() = " + cleanerBot.work());
        System.out.println("cleanerBot.morningMeeting() = " + cleanerBot.morningMeeting());
        System.out.println("cleanerBot.lunchTime() = " + cleanerBot.lunchTime());
        System.out.println("cleanerBot.dailyPay() = $" + cleanerBot.dailyPay());
        System.out.println("cleanerBot.getPaid() = " + cleanerBot.getPaid());

        System.out.println();
        System.out.println("----------------------");
        System.out.println();

        System.out.println("what is your name and department?:  " + numberBot.getName() + " | " + numberBot.getDepartment());
        System.out.println("numberBot.work() = " + numberBot.work());
        System.out.println("numberBot.morningMeeting() = " + numberBot.morningMeeting());
        System.out.println("numberBot.lunchTime() = " + numberBot.lunchTime());
        System.out.println("numberBot.dailyPay() = $" + numberBot.dailyPay());
        System.out.println("numberBot.getPaid() = " + numberBot.getPaid());

    }
}
