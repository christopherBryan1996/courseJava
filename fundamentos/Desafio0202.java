class Desafio0202{
	public static void main(String[] args){
		int horasDia = 24;
		int min=60;
		int seg=60;
		int horaAct=12;
		int minAct=49;
		int segundoACT=8;
		double resuntado;

		int horaActseg= horaAct*min*seg;
		int minActseg= minAct*seg;
		resuntado=horaActseg+minAct+seg;
		System.out.println("Hora del dia en segundos: "+ resuntado);

		resuntado=(((horasDia-horaAct)*min)*seg)-minActseg-segundoACT;
		System.out.println("Segundos del dia restante: "+ resuntado);
		resuntado=horaAct/.24;
		System.out.println("Porcentaje del dia: "+ resuntado);
	}
}