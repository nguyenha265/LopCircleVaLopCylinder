

public class Circle {
    private String color;
    private float radius;

    public Circle() {
    }

    public Circle(String color, float radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;

    }

    public void setColor(String color) {
        this.color = color;

    }

    public float getRadius() {
        return radius;

    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float area() {
        final float pi = 3.14f;
        return (this.radius * this.radius) * pi;
    }
}
