abstract class Geometry {
    abstract void area();
}
 class Circle extends Geometry{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    void area(){
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Circle area: " + area);
    }
}

class Main{
    public static void main( String[] args){
        Circle circle = new Circle(5);
        circle.area();

    }
}
