import java.util.Scanner;

public class PayrollTest {
    public static void main(String[] args){

        double hours, pay;

        Payroll payroll = new Payroll();

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter hours worked: ");
        hours = keyboard.nextDouble();
        payroll.setHoursWorked(hours);

        System.out.println("Enter pay rate: ");
        pay = keyboard.nextDouble();
        payroll.setPayRate(pay);

        System.out.println("Your gross pay is "+payroll.getGrossPay());
    }
}
