
public class Main {


    public static void main(String[] args) {
        Circle circle = new Circle("red", 5);
        System.out.println("area : " + circle.area());

        Cylinder cylinder = new Cylinder("blue",20,30);
        System.out.println("volume : " + cylinder.volume());
    }
}

