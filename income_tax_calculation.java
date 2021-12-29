package com.company;
import java.util.Scanner;
public class income_tax_calculation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your salary");
        float s = sc.nextFloat();
        if(s>=1000000){
            double a = ((s-1000000)*0.3)+(500000*0.2)+(250000*0.05);
            System.out.println(a);
        }
        else if(s>=500000 && s<1000000){
            double b = ((s-500000)*0.2)+(250000*0.05);
            System.out.println(b);
        }
        else if(s>=350000 && s<500000){
            double c = ((s-350000)*0.05);
            System.out.println(c);
        }
        else{
            System.out.println("you are not eligible for tax");
        }
    }
}
