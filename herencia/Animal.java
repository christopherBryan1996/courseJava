class Animal{
    void makeNoise(){
        System.out.println("Grrr!");
    }
}

class Cat extends Animal{
}

class Main{
    public static void main(String[] args){
        Animal animal = new Animal();
        animal.makeNoise();

        Cat cat = new Cat();
        cat.makeNoise();
    }
}