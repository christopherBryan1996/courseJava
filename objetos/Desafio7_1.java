 public class Desafio7_1{

 	private int age;


 	public int getAge(){
 		return age;
 	}

 	public void setAge(int newAge){
 		if(newAge<=0){
 			System.out.println("error: Es menor que cero");
 		}else{
 			age=newAge;
 		}
 	}

 	public void increaseAge(){
 		age+=1;
 	}
 	public void amlOld(){
 		if(age<13){
 			System.out.println("joven");
 		}
 		if(age>=13 && age<18){
 			System.out.println("adolescente");
 		}
 		if(age>=18){
 			System.out.println("adulto");
 		}
 	}


}