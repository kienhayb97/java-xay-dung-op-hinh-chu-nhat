package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter A");
        double a=scanner.nextDouble();
        System.out.println("Enter B");
        double b=scanner.nextDouble();
        System.out.println("Enter C");
        double c=scanner.nextDouble();
        QuadraticEquation quadraticEquation=new QuadraticEquation();
        quadraticEquation.setA(a);
        quadraticEquation.setB(b);
        quadraticEquation.setC(c);

        if (quadraticEquation.getDiscriminant()<0){
            System.out.println("phuong trinh vo nhiem");
        }else {
            System.out.println("phuong tring co 2 nhiem X1: "+quadraticEquation.getRoot1()+"\n"+"X2: "+quadraticEquation.getRoot2());
        }
    }
}
