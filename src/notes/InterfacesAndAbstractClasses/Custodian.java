package notes.InterfacesAndAbstractClasses;

public class Custodian extends Employee{

    public Custodian(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "maintaining building";
    }

    public String morningMeeting() {
        return "Custodians have a direct report to the head of the maintenance department and schedule meetings when necessary";
    }

    public String lunchTime() {
        return "Custodians have lunch between 12pm and 1pm in the cafeteria";
    }

    public int dailyPay() {
        return 150;
    }

    public String getPaid() {
        return "direct deposit into account";
    }

}
