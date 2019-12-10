package SEFinalProject;


import java.util.Scanner;

public class FinancialPlan {

    static Scanner sc = new Scanner(System.in);
    //String getString = sc.nextLine();
    //int getInt = sc.nextInt();
    //double getDouble = sc.nextDouble();

    double emergencyFund;
    double stock;
    double bond;


    public void setEmergencyFund(double emergencyFund) {
        this.emergencyFund = emergencyFund;
    }

    public double getEmergencyFund() {
        return emergencyFund;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public double getStock() {
        return stock;
    }

    public void setBond(double bond) {
        this.bond = bond;
    }

    public double getBond() {
        return bond;
    }

    public static void budgetAnalysis(Person person) {
        Scanner sc = new Scanner(System.in);
        double targetEmgFnd = person.getIncome() / 4;

        System.out.print("How much money do you have in your emergency fund?\n");
        double emergencyFund = sc.nextDouble();
        if (emergencyFund < 5000) {

                System.out.printf("\n\n\nCurrent Emergency Fund: %.2f\nYour Target Emergency Fund based on " +
                                "income ($5,000 or 3 months of expenses): %.2f\nYou could put %.2f more into you emergency fund before continuing.\n"
                        ,emergencyFund, targetEmgFnd, targetEmgFnd - emergencyFund);
        }
        else {
            System.out.printf("\n\n\nCurrent Emergency Fund: %.2f\nYour Wage Based  Emergency Fund ($5,000 or 3 months of expenses):" +
                    " %.2f\nYou have a strong emergency fund.\n\n\nNext Steps:\n"
                    ,emergencyFund, targetEmgFnd, targetEmgFnd - emergencyFund);
            if (person.getNetworth() < 0) {
                System.out.print("\nFocus on paying off debts and managing monthly expenses to increase your networth.\n");
            }
            else if (person.getNetworth() >= 0) {
                System.out.printf("\nReccomended investments:\nStocks (70 percent)  %.2f\nBonds (30 percent): %.2f",
                        (person.getNetworth()*.7), (person.getNetworth()*.3));
            }
        }

    }

    public static void main(String[] args) {

        Person person = new Person();

        budgetAnalysis(person);

    }
}