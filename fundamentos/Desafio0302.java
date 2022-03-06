import java.util.Scanner;

class Desafio0302{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("escribe tu primer numero:");
		int number1=scanner.nextInt();
		System.out.println("escribe tu segundo numero:");
		int number2=scanner.nextInt();
		System.out.println("escribe tu tercer numero:");
		int number3=scanner.nextInt();

		if(number1> number2 && number1> number3)
			System.out.println("el numero mayor es 1, con la cantidad: "+String.valueOf(number1) );
		if(number2> number1 && number2> number3)
			System.out.println("el numero mayor es 2, con la cantidad:  "+String.valueOf(number2) );
		if(number3> number2 && number3> number1)
			System.out.println("el numero mayor es 3, con la cantidad:  "+String.valueOf(number1) );
	}
}