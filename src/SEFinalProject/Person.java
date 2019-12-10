package SEFinalProject;

import java.util.Scanner;

public class Person {

    String firstName = "Job";
    String lastName = "Albarr";
    String username = "Jalbarr";
    String correct= "";
    private int pin = 0000;
    double income = 62030;
    double monthlyIncome = getIncome() / 12;
    double asset = 5450;
    double liability = 4879;
    double networth = asset - liability;

    Scanner sc = new Scanner(System.in);

    //String getString = sc.nextLine();
    //int getInt = sc.nextInt();
    //double getDouble = sc.nextDouble();


    public Person() {

        System.out.print("New or Default person?\n");
        String useDefault = sc.nextLine().toLowerCase();

        if (useDefault.toLowerCase().equals("new")) {
            this.NewPerson();
        }
        else if (useDefault.toLowerCase().equals("default")) {
            this.DefaultPerson();
        } else {
            System.out.print("\n\n\nInvalid. New or Default person?\n\n\n");
            Person person = new Person();
        }

    }

    public void DefaultPerson() {
        this.setFirstName("Job");
        this.setLastName("Albarr");
        this.setUsername(firstName, lastName);
        this.setPin(0000);
        this.setIncome(60000);
        this.monthlyIncome = getIncome() / 12;
        this.setAsset(10000);
        this.setLiability(5000);
        this.networth = getAsset() - getLiability();

        this.getStatus();
        System.out.print("\nIs this correct? Y or N.\n");
        setCorrect(sc.nextLine());

        if (this.getCorrect().toLowerCase().equals("y")) {
            System.out.print("Thank You!\n\n");
        }

        else {
            System.out.print("\n\n\nPlease answer the following questions: \n\n\n");

            this.NewPerson();
        }
    }
    public void NewPerson() {

        System.out.print("What is your first name?\n");
        String scFirstName = sc.nextLine();
        this.setFirstName(scFirstName);

        System.out.print("What is your last name?\n");
        String scLastName = sc.nextLine();
        this.setLastName(scLastName);

        System.out.print("Create a pin:\n");
        int scPin = sc.nextInt();
        this.setPin(scPin);

        System.out.print("What is your Annual Income?\n");
        double scIncome = sc.nextDouble();
        this.setIncome(scIncome);

        System.out.print("How much are your Assets worth?\n");
        double scAsset = sc.nextDouble();
        this.setAsset(scAsset);

        System.out.print("How much are your Liabilities worth?\n");
        double scLiability = sc.nextDouble();
        this.setLiability(scLiability);

        this.setUsername(scFirstName, scLastName.toLowerCase());

        this.getStatus();
        System.out.print("\nIs this correct? Y or N.\n");

        setCorrect(sc.nextLine());

        if (this.correct.toLowerCase().equals("y")) {
            System.out.print("Have a good day!\n\n");
        } if (this.correct.toLowerCase().equals("n")){
            System.out.print("\n\n\nPlease try again.\n\n\n");
        }

    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setPin(int pin) {
        this.pin = pin;
    }

    private int getPin() {
        return pin;
    }

    public void setUsername(String firstName, String lastName) {
        String[] fName = firstName.split("");
        this.username = (fName[0] + lastName.toLowerCase());

    }

    public String getUsername() {
        return this.username;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getIncome() {
        return this.income;
    }

    public void setAsset(double asset) {
        this.asset = asset;
    }

    public double getAsset() {
        return this.asset;
    }

    public void setLiability(double liability) {
        this.liability = liability;
    }

    public double getLiability() {
        return this.liability;
    }

    public void setNetworth() {
        this.networth = getAsset() - getLiability();
    }

    public double getNetworth() {
        this.setNetworth();
        return networth;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public String getCorrect() {
        return correct;
    }

    public void getStatus() {

        System.out.printf("\nName: %s %s\nUsername: %s\nPin: %d\nIncome: $%.2f\nAssets: $%.2f\nLiabilities: $%.2f\nNetworth: $%.2f\n",
                getFirstName(), getLastName(), getUsername(), getPin(), getIncome(),
                getAsset(), getLiability(), getNetworth());

    }
    public static void main(String[] args) {

        Person job = new Person();

    }
}