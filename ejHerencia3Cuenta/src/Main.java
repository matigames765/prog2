import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount sa = new SavingsAccount(11000.0,7000.0,true);

        sa.activateAccount();

        System.out.print("Ingrese el dinero que quiere consignar: ");
        double amount = sc.nextDouble();

        sa.consign(amount);

        System.out.println("Ingrese el dinero que quiere retirar: ");
        amount = sc.nextDouble();

        sa.withdraw(amount);

        sa.calculateInterest();

        sa.monthlyStatement();

        sa.print();




    }
}