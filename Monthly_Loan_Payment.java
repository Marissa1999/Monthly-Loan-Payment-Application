//Programmer: Marissa Gonçalves
//Date: August 29, 2017
//Purpose: This program should be able to calculate the monthly payment from a typed loan amount.

import java.util.Scanner;

public class Monthly_Loan_Payment

{
	public static void main (String[] args)

    {
	    Scanner keyboard = new Scanner(System.in);

        //enter a loan amount in order to determine the monthly payment;
	    System.out.print ("Enter loan amount: ");
	    double loan_amount = keyboard.nextDouble();

        //enter the number of years to determine the loan term in months;
	    System.out.print ("Enter term in years: ");
	    int years = keyboard.nextInt();
	    int loan_term_in_months = years * 12;

        //enter the annual interest rate to determine the monthly interst rate;
	    System.out.print ("Enter annual interest rate (%): ");
	    double interest_rate = keyboard.nextDouble();
	    double monthly_interest_rate = interest_rate / 1200;

        //calculate the monthly payment, based on the loan amount, monthly interest rate and loan term in months;
        double monthly_payment = (monthly_interest_rate * loan_amount)/ (1.0 - Math.pow ((1 + monthly_interest_rate), -loan_term_in_months));

        System.out.println ();

        //write a conclusion which indicates the final monthly payment, based on calculated results;
	    System.out.println ("Your Monthly payment: $" + monthly_payment);

	    System.out.println ();
	 }

 }