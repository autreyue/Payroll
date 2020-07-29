public class Payroll {

    //fields being used
    private double hoursWorked;
    private double payRate;

    //constructor initializes fields to zero
    public Payroll() { hoursWorked=0.0; payRate=0.0; }

    //mutator accepts arguments and stores in field
    public void setHoursWorked(double hrs) { hoursWorked=hrs; }
    public void setPayRate(double pay) { payRate=pay; }

    //accessor returns the data
    public double getHoursWorked() { return hoursWorked; }
    public double getPayRate() { return payRate; }

    //calculates and returns gross pay
    public double getGrossPay() {
        double grossPay, overtimePay;
        if (hoursWorked > 40)  {
            grossPay = 40*payRate;
            overtimePay = (hoursWorked - 40) * (payRate * 1.5);
            grossPay += overtimePay;
        }
        else
            grossPay=payRate*hoursWorked;
        return grossPay;
    }
}
