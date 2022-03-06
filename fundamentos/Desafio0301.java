import java.util.Scanner;

class Desafio0301{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("escribe tu numero:");
		String number=scanner.nextLine();
		int total=0;

		for(int i=1;i<=number.length();i++){
			total=total+1;
		}
		System.out.println("El total de digitos en tu numero es: "+total);
	}
} 