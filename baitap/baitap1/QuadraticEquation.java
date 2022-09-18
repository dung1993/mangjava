package baitap.baitap1;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a");
        double a = sc.nextDouble();
        while (a == 0) {
            System.out.println("Input a not 0");
            a = sc.nextDouble();
        }
        System.out.println("Input b ");
        double b = sc.nextDouble();
        System.out.println("Input c ");
        double c = sc.nextDouble();

        QuadraticEquation QEquation = new QuadraticEquation(a,b,c);
        if (QEquation.getDiscriminant() > 0) {
            System.out.printf("Root1: " + QEquation.getRoot1());
            System.out.println("");
            System.out.printf("Root2: " + QEquation.getRoot2());
            System.out.println("");
        } else if (QEquation.getDiscriminant() == 0) {
            System.out.printf("Root: " + QEquation.getRoot());
            System.out.println("");
        }else {
            System.out.println("The equation has no solution");
        }
    }
    double a, b, c;

    public QuadraticEquation(){
    }

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        return b *b - (4*a*c);
    }

    public double getRoot1(){
            return  (-b + Math.sqrt(getDiscriminant())/(2*a));
    }

    public double getRoot2() {
            return  (-b - Math.sqrt(getDiscriminant())/(2*a));
    }
    public double getRoot(){
        return -b/2*a;
    }
}
