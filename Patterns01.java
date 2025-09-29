package com.RCB.Patterns;
import java.util.Scanner;
// All Patterns.
public class Patterns01 {
    public static String sp="  ";
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.print("Enter THe Rows :-" );
        int a= sca.nextInt();
        Patterns01 pa=new Patterns01();
        pa.Pattern01(a);
        pa.Pattern02(a);
        pa.Pattern03(a);
        pa.pattern04(a);
        pa.pattern05(a);
        pa.pattern06(a);
        pa.pattern07(a);
        pa.pattern08(a);
        pa.pattern09(a);
        pa.Pattern10(a);
        sca.close();
    }
    void Pattern01(int a){
        System.out.println("\nPattern 01 :- \n");
        for(int i=1;i<=a;i++){
            for(int j=a;j>=1;j--){
                if(j-i>0){
                    System.out.print(Patterns01.sp);
                }
                else {
                    if((j-i)%2==0)
                        System.out.print(1+" ");
                    else
                        System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
    void Pattern02(int a){
        System.out.println("\nPattern 02 :- \n");
        for(int i=1;i<=a;i++){
            for(int j=a;j>=1;j--){
                if(j-i>0){
                    System.out.print(" ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
    void Pattern03(int a){
        System.out.println("\nPattern 03 :- \n");
        for(int i=1;i<=a;i++){
            for(int j=a;j>=1;j--){
                if(j-i>0){
                    System.out.print(Patterns01.sp);
                }
                else {
                    if((a-j)%2==0)
                        System.out.print(1+" ");
                    else
                        System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
    void pattern04(int a){
        System.out.println("\nPattern 04 :- \n");
        for(int i=1;i<=a;i++){
            for (int j=1;j<a*2;j++){
                if(j<=(a-i)||j>=a+i){
                    System.out.print(Patterns01.sp);
                }
                else{
                    System.out.print(i%2+" ");
                }
            }
            System.out.println();
        }
    }
    void pattern05(int a){
        System.out.println("\nPattern 05 :- \n");
        for(int i=1;i<=a;i++){
            int b=1;
            for (int j=1;j<a*2;j++){
                if(j<=(a-i)||j>=a+i){
                    System.out.print(Patterns01.sp);
                }
                else{
                    System.out.print((b++ %2)+" ");
                }
            }
            System.out.println();
        }
    }
    void pattern06(int a){
        System.out.println("\nPattern 06 :- \n");
        for(int i=1;i<=a;i++){
            int b=1;
            int c=1;
            for (int j=1;j<a*2;j++){
                if(j<=(a-i)||j>=a+i){
                    System.out.print(Patterns01.sp);
                }
                else{
                    System.out.print((((b++ %2)==1)?c++:"*")+" ");
                }
            }
            System.out.println();
        }
    }
    void pattern07(int a){
        System.out.println("\nPattern 07 :- \n");
        for(int i=1;i<=a;i++){
            int b=1;
            for (int j=1;j<a*2;j++){
                if(j<=(a-i)||j>=a+i){
                    System.out.print(Patterns01.sp);
                }
                else{
                    System.out.print( ((a-j)%2==0 ? 1 : 0 ) +" " );
                }
            }
            System.out.println();
        }
    }
    void pattern08(int a){
        System.out.println("\nPattern 08 :- \n");
        for(int i=1;i<=a;i++){
            int b=1;
            for (int j=1;j<a*2;j++){
                if(j<=(a-i)||j>=a+i){
                    System.out.print(Patterns01.sp);
                }
                else{
                    if(j<a)
                        System.out.print(b++ +" ");
                    else
                        System.out.print(b-- +" ");
                }
            }
            System.out.println();
        }
    }
    void pattern09(int a){
        System.out.println("\nPattern 09 :- \n");
        for(int i=1;i<=a;i++){
            int b=a-i+1;
            for (int j=1;j<a*2;j++){
                if(j<=(a-i)||j>=a+i){
                    System.out.print(Patterns01.sp);
                }
                else{
                    if(j<a)
                        System.out.print(b++ +" ");
                    else
                        System.out.print(b-- +" ");
                }
            }
            System.out.println();
        }
    }
    void Pattern10(int a){
        System.out.println("\nPattern 10 :- \n");
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(j>i)
                    System.out.print(Patterns01.sp);
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
