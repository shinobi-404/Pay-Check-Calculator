
import java.util.Scanner;
public class PayCheckCalc{

    public static void main(String[] args){

        
        System.out.println("Enter the Employees full name: "); //prints to user asking for name 
        String name = (new Scanner(System.in)).nextLine(); // Gets input for name and stores it in name 

        System.out.println("Enter the Employees number: "); // asks user to enter employee number 
        String employeeNumber = (new Scanner(System.in)).nextLine(); // stores userinput in employee# variable

        System.out.println("Enter the pay rate per hour: "); // asks user for their pay rate 
        Double payRate = (new Scanner(System.in)).nextDouble(); // stores user input in payRate variable

        System.out.println("Enter the regular hours worked: "); // asks user input for # of hrs worked
        Double hoursWorked = (new Scanner(System.in)).nextDouble(); // stores user input in hours worked 

        System.out.println("\n"); // new line for astheic and formattign purposes 
        System.out.println("Thank you!");
        System.out.println("\n");
        System.out.println("Here is your paycheck!\n\n\n");

        System.out.println("------------------------------------------ \n");

        System.out.println("Employees name:\t\t" + name);
        System.out.println("Employees number:\t"+employeeNumber);
        System.out.println("Hourly rate of pay:\t$"+payRate);
        System.out.println("Hours worked:\t\t"+hoursWorked+"\n");
        
        double grossPay = hoursWorked*payRate; // calculates gross pay 
        System.out.println("Total Gross Pay:\t$"+String.format("%.2f",grossPay)+"\n"); // prints gross pay 
        System.out.printf("Total Gross Pay:\t$%.2f\n",grossPay);//test 

        double tax = 0.06*grossPay; // calculates taxes

        System.out.println("Deductions");
        System.out.println("Tax(6%)\t\t\t$" + String.format("%.2f",tax)+"\n"); // prints taxes

        double netPay = grossPay - tax; // calculates net pay
        System.out.println("Net Pay:\t\t$"+String.format("%.2f",netPay)); // prints net pay 
        
        System.out.println("------------------------------------------ \n\n");
        System.out.println("Bye!\n");



        
    }
}