package org.dng;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction()  {}

    public Fraction(int numerator, int denominator) throws Exception {
        if ( denominator == 0){
            throw new Exception("Denominator must be not zero!");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) throws Exception {
        if ( denominator == 0){
            throw new Exception("Denominator must be not zero!");
        }
        this.denominator = denominator;
    }


    @Override
    public String toString() {
        if(numerator > denominator){
            return (""+numerator/denominator+
                    (numerator%denominator == 0 ? "" :
                    "("+numerator%denominator+"\\"+denominator+")"));
        }
        return "" + numerator+"\\"+
                denominator;
    }

    public void inputComplexNumber(Scanner sc) throws Exception {
//        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter numerator");
        if (sc.hasNextInt()) {
            numerator = sc.nextInt();
        } else {
            throw new Exception("Wrong input numerator!");
        }
        System.out.println("Enter denominator");
        if (sc.hasNextInt()) {
            int denom = sc.nextInt();
            if ( denom == 0){
                throw new Exception("Denominator must be not zero!");
            }
            else {
                denominator = denom;
            }

        } else {
            numerator = 0;
            throw new Exception("Wrong input Denominator!");
        }
        sc.nextLine();
    }
//    }


    public void add(Fraction fr) {
        numerator = (numerator*fr.denominator + fr.numerator*denominator);
        denominator = (denominator*fr.denominator);
        for (int i = numerator; i > 1 ; i--) {
            if((numerator%i == 0 )&&(denominator%i == 0)){
                numerator /= i;
                denominator /= i;
                break;
            }
        }
    }

    public void sub(Fraction fr) {
        numerator = (numerator*fr.denominator - fr.numerator*denominator);
        denominator = (denominator*fr.denominator);
        for (int i = numerator; i > 1 ; i--) {
            if((numerator%i == 0 )&&(denominator%i == 0)){
                numerator /= i;
                denominator /= i;
                break;
            }
        }
    }


    public void mult(Fraction fr) {
        numerator = numerator * fr.numerator;
        denominator = denominator * fr.denominator;
        for (int i = numerator; i > 1 ; i--) {
            if((numerator%i == 0 )&&(denominator%i == 0)){
                numerator /= i;
                denominator /= i;
                break;
            }
        }
    }

    public void division(Fraction fr) {
        numerator = numerator * fr.denominator;
        denominator = denominator * fr.numerator;
        for (int i = numerator; i > 1 ; i--) {
            if((numerator%i == 0 )&&(denominator%i == 0)){
                numerator /= i;
                denominator /= i;
                break;
            }
        }
    }
    
}
