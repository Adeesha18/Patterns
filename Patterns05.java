package com.RCB.Patterns;
import java.util.Scanner;
// All Patterns.
public class Patterns05 {
    public static String sp="  ";
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.print("Enter THe Rows :-");
        int a = sca.nextInt();
        Patterns05 pa = new Patterns05();
        pa.Pattern01(a);
        pa.Pattern02(a);
        pa.Pattern03(a);
        sca.close();
    }
    void Pattern01(int a){
        System.out.println("\nPattern 01 :- \n");
        int z=1;
        int x=0;
        for(int i=1;i<a*2;i++){
            for (int j=1;j<a*2;j++){
                if(j<=(a-z)||j>=a+z){
                    System.out.print(Patterns01.sp);
                }
                else{
                    if(j==(a-x) || j==(a+x))
                        System.out.print("* ");
                    else
                        System.out.print(Patterns05.sp);
                }
            }
            System.out.println();
            if(i<a) {
                z++;
                x++;
            }
            else {
                z--;
                x--;
            }
        }
    }
    void Pattern02(int a) {
        System.out.println("\nPattern 02 :- \n");
        for(int i=1;i<a*2;i++){
            for (int j=1;j<a*2;j++){
                if(j==1 || i==1 || j==(a*2-1) || i==(a*2-1) || i==a ||j==a)
                    System.out.print("* ");
                else
                    System.out.print(Patterns05.sp);
            }
            System.out.println();
        }

    }
    void Pattern03(int a) {
        System.out.println("\nPattern 03 :- \n");
        for(int i=1;i<a*2;i++){
            for (int j=1;j<a*2;j++){
                if(j==1 || i==1 || j==(a*2-1) || i==(a*2-1) || i==j || j==(a*2-i))
                    System.out.print("* ");
                else
                    System.out.print(Patterns05.sp);
            }
            System.out.println();
        }
    }
}
