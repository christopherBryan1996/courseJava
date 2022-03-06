class Desafio7_1main {

	public static void main(String[] args) {
		Desafio7_1 persona = new Desafio7_1();
		int intentos = 5;
		System.out.println(persona.getAge());
		persona.setAge(-2);
		persona.setAge(18);
		persona.amlOld();
		System.out.println(persona.getAge());
		for(int i=0;i<=intentos;i++){
			persona.increaseAge();
		}
		System.out.println(persona.getAge());

		persona.amlOld();
	}
}