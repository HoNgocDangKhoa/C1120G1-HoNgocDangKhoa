package bai4_class_object.bai_tap;

public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on) {
            return "Fan{" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    " fan is on" +
                    '}';
        } else {
            return "Fan{" +
                    "radius=" + radius +
                    ", color='" + color + '\'' +
                    " fan is off" +
                    '}';
        }


    }

    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setSpeed(fan.getFast());
        fan.setOn(true);
        System.out.println(fan.toString());
        Fan fan1=new Fan();
        fan1.setSpeed(fan.getMedium());
        fan.setOn(false);
        System.out.println(fan.toString());
    }


}
