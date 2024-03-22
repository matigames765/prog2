public abstract class Account {
    protected double balance;
    protected int numberConsignments = 0;
    protected int numberWithdrawals = 0;
    protected double annualRate;
    protected double monthlyCommission = 0;

    public Account() {
    }

    public Account(double balance, double annualRate) {
        this.balance = balance;
        this.annualRate = annualRate;
    }

    public void consign(double amount){
        balance += amount;
        numberConsignments++;
    }

    public void withdraw(double amount){
        double newBalance = balance - amount;
        if(newBalance >= 0){
            balance -= amount;
            numberWithdrawals++;
        }else{
            System.out.println("La cantidad a retirar excede el saldo actual.");
        }
    }

    public void calculateInterest(){
        double monthlyRate = annualRate / 12;
        double monthlyInterest = balance * monthlyRate;
        balance += monthlyInterest;
    }

    public void monthlyStatement(){
        balance -= monthlyCommission;
        calculateInterest();
    }

    public void print(){
        System.out.println("Saldo: " + balance);
        System.out.println("Numero de consignaciones: " + numberConsignments);
        System.out.println("Numero de retiros: " + numberWithdrawals);
        System.out.println("Tasa anual: " + annualRate);
        System.out.println("Comision mensual: " + monthlyCommission);
    }

}
