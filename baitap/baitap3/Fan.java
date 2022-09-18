package baitap.baitap3;

public class Fan {
    public static void main(String[] args) {
        FanOption fanOption=new  FanOption(2,true,4,"red");
        System.out.println(fanOption.toString());
        FanOption fanOption1=new  FanOption();
        System.out.println(fanOption1.toString());
        fanOption1.setColor("red");
        fanOption1.setOn(true);
        fanOption1.setSpeed(fanOption1.getMEDIUM());
        System.out.println(fanOption1.toString());
    }

    public static class FanOption {
        private final int SLOW = 1, MEDIUM = 2, FAST = 3;
        private int speed = 1;
        private boolean on = false;
        private double radius = 5;
        private String color = "blue";

        public int getSLOW() {
            return SLOW;
        }

        public int getMEDIUM() {
            return MEDIUM;
        }

        public int getFAST() {
            return FAST;
        }

        public boolean isOn() {
            return on;
        }

        public double getRadius() {
            return radius;
        }

        public int getSpeed() {
            return speed;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }
        public FanOption(){
            this.color = getColor();
            this.speed = getSpeed();
            this.radius = getRadius();
            this.on = isOn();
        }

        public FanOption(int speed, boolean on, double radius, String color) {
            this.color = color;
            this.speed = speed;
            this.radius = radius;
            this.on = on;
        }

        public String toString() {
            String str= "";
            if (this.isOn()) {
                str += ("Fan is on\n");
                str += ("Speed: " + this.speed + "\n");
            } else {
                str += ("Fan is off"+"\n");
            }
            str += ("Color: " + this.color + "\n");
            str += ("Radius: " + this.radius + "\n");
            return str;
        }
    }
}
