public class CurrentAccount extends Account{

    protected double overdraft = 0;

    public CurrentAccount() {
    }

    public CurrentAccount(double balance, double annualRate, double overdraft) {
        super(balance, annualRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        this.balance -= amount;
        numberWithdrawals++;
        if (this.balance < 0){
            overdraft += -this.balance;
        }
    }

    @Override
    public void consign(double amount) {
        this.consign(amount);
        if (overdraft > 0){
            overdraft -= amount;
        }
    }

    @Override
    public void monthlyStatement() {
        this.monthlyStatement();
    }

    @Override
    public void print() {
        System.out.println("Saldo: " + this.balance);
        System.out.println("Comision mensual: " + this.monthlyCommission);
        System.out.println("Cantidad de transacciones realizadas: " + (numberWithdrawals + numberConsignments));
        System.out.println("Sobregiro: " + overdraft);

    }
}
