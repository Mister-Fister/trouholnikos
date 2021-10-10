package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Zadaj číslo");
        Scanner sc = new Scanner(System.in);
        int vyska = sc.nextInt();
        System.out.println("jeden");
        for (int i = 1; i <= vyska; i++)
        {
            for (int y = 0; y < i; y++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("dva");
        for (int i = 1; i <= vyska; i++)
        {
            for (int y = 0; y <= vyska-i; y++)
            {
                System.out.print("*");
            }
            for (int y = 0; y < i; y++) 
            {
                System.out.print("");
            }
            System.out.println("");
        }
        System.out.println("tri");
        for (int i= 0; i<= vyska - 1; i++)
        {
            for (int y=1; y<=vyska-i; y++)
            {
                System.out.print(" ");
            }
            for (int y=0;y<=i;y++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("styre");
        for (int i= vyska; i>= 1; i--)
        {
            for (int y=vyska; y>i;y--)
            {
                System.out.print(" ");
            }
            for (int y=1;y<=i;y++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
