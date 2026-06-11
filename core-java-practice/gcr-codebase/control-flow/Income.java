//a kingdom's tax system charges 5% for income < 10k, 15% for 10k-50k, 30% above 50k. Read a citizen's income, print tax bracket and amount, Extend: loop over an array of 10 citizens and tally total tax collected. 

public class Income {
    public static void main(String[] args) {

        int[] income = { 8000, 12000, 25000, 60000, 45000,
                9000, 75000, 30000, 15000, 55000 };

        double totalTax = 0;

        for (int i = 0; i < income.length; i++){

            double tax;

            if (income[i] < 10000) {
                tax = income[i] * 0.05;
                System.out.println("Citizen " + (i + 1) +
                        ": 5% Tax, Amount = " + tax);

            } else if (income[i] <= 50000) {
                tax = income[i] * 0.15;
                System.out.println("Citizen " + (i + 1) +
                        ": 15% Tax, Amount = " + tax);

            } else {
                tax = income[i] * 0.30;
                System.out.println("Citizen " + (i + 1) +
                        ": 30% Tax, Amount = " + tax);
            }

            totalTax += tax;
        }

        System.out.println("\nTotal Tax Collected = " + totalTax);
    }
}
