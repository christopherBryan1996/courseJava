import java.util.Scanner;

class EntradaDatos{

	public static void main(String[] agrs){
		Scanner scanner = new Scanner( System.in);
		System.out.println("Escribe tu nombre: ");
		String name=scanner.nextLine();

		System.out.println("hola, "+name);
	}
}