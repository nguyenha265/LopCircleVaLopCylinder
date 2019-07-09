
public class Cylinder extends Circle{
    private float heigth;

    public Cylinder() {
    }

    public Cylinder(String color, float radius,float heigth) {
        super(color, radius);
        this.heigth = heigth;
    }

    public float getHeigth() {
        return heigth;
    }

    public void setHeigth(float heigth) {
        this.heigth = heigth;
    }
    public float volume(){
        return super.area() * this.heigth;
    }
}
