class Primitivas{
	public static void main(String[] args){
		byte b1=10;
		System.out.println("b1: " + b1);

		//-128 a +127
		//down castig int -> byte
		byte b2 = (byte)131; //desbordamiento de memoria
		System.out.println("b2: " + b2);

		int i = 5;
		System.out.println("i: " + i);

		//up casting int -> long
		long l =100;

		float f=0.0f;
		System.out.println("f: " + f);
	}
}