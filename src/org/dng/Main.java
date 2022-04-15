package org.dng;

import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Fraction fr1 = new Fraction();
        try {
            fr1.inputComplexNumber(sc);
        } catch (Exception e) {
            System.out.println(e);
        }
        Fraction fr2 = new Fraction();
        try {
            fr2.inputComplexNumber(sc);
        } catch (Exception e) {
            System.out.println(e);
        }


        System.out.println("our fraction 1 is: " + fr1.toString());
        System.out.println("our fraction 2 is: " + fr2.toString());
        System.out.println();

        System.out.println("" + fr1.toString() + " + " + fr2.toString());
        fr1.add(fr2);
        System.out.println("rezult is: " + fr1.toString());
        System.out.println();

        System.out.println("" + fr1.toString() + " - " + fr2.toString());
        fr1.sub(fr2);
        System.out.println("rezult is: " + fr1.toString());
        System.out.println();

        System.out.println("" + fr1.toString() + " * " + fr2.toString());
        fr1.mult(fr2);
        System.out.println("rezult is: " + fr1.toString());
        System.out.println();

        System.out.println("" + fr1.toString() + " / " + fr2.toString());
        fr1.division(fr2);
        System.out.println("rezult is: " + fr1.toString());
        System.out.println();

    }
}
