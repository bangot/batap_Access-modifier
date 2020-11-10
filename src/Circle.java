public class Circle {
    private double radius=1.0;
    private String color="red";

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';


    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(){

    }
    public double getRadius(){
        return radius;
    }
public  double getArea(){

        return radius*radius*3.14;
}

}
