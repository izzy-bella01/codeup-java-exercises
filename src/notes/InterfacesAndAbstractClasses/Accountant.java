package notes.InterfacesAndAbstractClasses;

public class Accountant extends Employee{

    public Accountant(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "crunching numbers";
    }

    public String morningMeeting() {
        return "Accountants have morning meetings between 8:15 and 8:45";
    }

    public String lunchTime() {
        return "Accountant takes lunch between 1pm and 2pm";
    }

    public int dailyPay() {
        return 500;
    }

    public String getPaid() {
        return "gets paid from department in full";
    }
}
