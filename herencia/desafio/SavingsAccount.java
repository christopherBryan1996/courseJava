public class SavingsAccount extends Account {
    private double interest;

    public SavingsAccount(double interest){
        this.interest=interest;
    }
    @Override
    public void deposit(double amount){
        double valorAgregar=amount*interest;
        this.deposit(valorAgregar+amount);
    } 
    
    public void tString(){
        System.out.println("SavingsAccount");
    }
}
