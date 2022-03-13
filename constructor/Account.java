public class Account{
	// declaramos variables
	private double balance;
	private String[] lastoperations= new String[3];

	//Constructor
	public Account(){
		this(1000);
	}

	public Account(double amount){
		if(amount>=1000){
			balance = balance+amount;
			lastoperations[0]="Deposito "+ balance;
		}else{
			System.out.println("El monto debe ser igual o mayor a 1000 pesos ");
		}
	}
	
	//metodos 
	public void deposito(double amount){
		if (amount<=0){
			System.out.println("El monto a depositar debe ser mayor a 0 pesos");
		}else{
			balance= balance+amount;
			saveLastOperation("Deposito "+ amount);
		}
	}

	public void printBalance(){
		System.out.println("Balance: "+balance);
		for(int i=0;i<lastoperations.length;i++){
			System.out.println(lastoperations[i]);

		}
	}

	public void withdraw(double amount){
		if(balance < amount){
			System.out.println("Saldo insuficiente");
		}else{
			balance= balance-amount;
			saveLastOperation("Retiro "+amount);
		}
	}

	private void saveLastOperation(String op){
		lastoperations[2]=lastoperations[1];
		lastoperations[1]=lastoperations[0];
		lastoperations[0]=op;
	}

}