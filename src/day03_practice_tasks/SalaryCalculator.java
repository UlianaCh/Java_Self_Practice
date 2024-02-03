package day03_practice_tasks;

public class SalaryCalculator {
    public static void main(String[] args) {
        double hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 6;
        double federalTaxRate = 26;
        double salaryBeforeTax = hourlyRate * weeklyHours * 52; // Gross Pay
        double stateTax = salaryBeforeTax * (stateTaxRate / 100); // State Tax
        double federalTax =salaryBeforeTax * (federalTaxRate/100); // Federal Tax
        double totalTax = stateTax + federalTax; // Total Tax
        double salaryAfterTax = salaryBeforeTax-totalTax; // Net Income

        System.out.println("Gross pay is: $"+salaryBeforeTax);
        System.out.println("Federal tax is: $"+federalTax);
        System.out.println("State tax is: $"+stateTax);
        System.out.println("Total tax is: $"+ totalTax);
        System.out.println("Net income is: $"+salaryAfterTax);
        System.out.println("----------------------------------");
        // other way to print the same
        System.out.println("Gross Pay is: $"+salaryBeforeTax+"\n"+"Federal Tax is: $"+federalTax+
                "\n"+"State Tax is: $"+stateTax+"\n"+"Total Tax is: $"+totalTax+"\n"+"Net Income is: $"+salaryAfterTax);



    }
}
/*
4. Create a class named SalaryCalculator. Given the following variables:
				hourlyRate (double)
				weeklyHours (int)
				stateTaxRate (double)
				federalTaxRate (double)

	Use the given information above to calculate the following:
				salaryBeforeTax
				stateTax
				federalTax
				totalTax
				salaryAfterTax

	Display each of the above in the following format:

					Example:
						hourlyRate = $50
						weeklyHours = 45
						stateTaxRate = 6  (given as a percentage)
						federalTaxRate = 26 (given as a percentage)

					Output:
						Gross pay is: $117000.0
						Federal tax is: $30420.0
						State tax is: $7020.0
						Total tax is: $37440.0
						Net income is: $79560.0
 */