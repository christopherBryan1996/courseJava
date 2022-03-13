public class Main {
    public static void main(String [] args){
        Account cuenta = new Account(1500);
        System.out.println("Saldo inicial");
        cuenta.printBalance();

        System.out.println("ejemplo de deposito");
        cuenta.deposito(5);
        cuenta.printBalance();

        System.out.println("ejemplo de retiro");
        cuenta.withdraw(500);
        cuenta.printBalance();
    }
}
