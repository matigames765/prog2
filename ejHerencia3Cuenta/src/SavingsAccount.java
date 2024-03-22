public class SavingsAccount extends Account{

    protected boolean activate;

    public SavingsAccount() {
    }

    public SavingsAccount(double balance, double annualRate, boolean activate) {
        super(balance, annualRate);
        this.activate = activate;
    }

    public boolean isActivate() {
        return activate;
    }

    public void setActivate(boolean activate) {
        this.activate = activate;
    }

    public void activateAccount(){
        if (this.balance <= 10000.0){
            activate = false;
        }else{
            activate = true;
        }
    }

    @Override
    public void consign(double amount) {
        if (activate == true){
            this.balance += amount;
            this.numberConsignments++;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (activate = true){
            double newBalance = this.balance - amount;
            if (newBalance >= 0){
                this.balance -= amount;
                numberWithdrawals++;
            }else{
                System.out.println("No hay suficientes fondos para el retiro de dinero");
            }
        }
    }

    @Override
    public void calculateInterest() {
        double monthlyRate = this.annualRate / 12;
        double monthlyInterest = this.balance * monthlyRate;
        this.balance = monthlyInterest;

    }

    @Override
    public void monthlyStatement() {
        if (numberWithdrawals > 4){
            this.monthlyCommission = (numberWithdrawals - 4) * 1000;
        }
        this.balance -= this.monthlyCommission;
        calculateInterest();
        activateAccount();
    }

    @Override
    public void print() {
        System.out.println("Saldo: " + this.balance);
        System.out.println("Comision mensual: " + this.monthlyCommission);
        System.out.println("Numero de transacciones realizadas: " + (numberWithdrawals + numberConsignments));
    }
}
