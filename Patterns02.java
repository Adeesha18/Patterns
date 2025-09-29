package com.RCB.Patterns;
import java.util.Scanner;

public class Patterns02 {
    public static String sp="  ";
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.print("Enter THe Rows :-" );
        int a= sca.nextInt();
        Patterns02 pa=new Patterns02();
        pa.Pattern01(a);
        pa.Pattern02(a);
        pa.Pattern03(a);
        pa.Pattern04(a);
        pa.Pattern05(a);
        pa.Pattern06(a);
        pa.Pattern07(a);
        pa.Pattern08(a);
        pa.Pattern09(a);

        sca.close();
    }
    void Pattern01(int a){
        System.out.println("\nPattern 01 :- \n");
        for(int i=1;i<=a;i++){
            for(int j=1;j<a*2;j++){
                if((j-i)<0 || j>(a*2)-i )
                    System.out.print(Patterns02.sp);
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    void Pattern02(int a){
        System.out.println("\nPattern 02 :- \n");
        for(int i=1;i<=a;i++){
            for(int j=1;j<a*2;j++){
                if((j-i)<0 || j>(a*2)-i )
                    System.out.print(Patterns02.sp);
                else {
                    System.out.print(i%2 +" ");
                }
            }
            System.out.println();
        }
    }

    void Pattern03(int a){
        System.out.println("\nPattern 03 :- \n");
        for(int i=1;i<=a;i++){
            int k=1;
            for(int j=1;j<a*2;j++){
                if((j-i)<0 || j>(a*2)-i )
                    System.out.print(Patterns02.sp);
                else {
                    System.out.print( k++ % 2 +" ");
                }
            }
            System.out.println();
        }
    }

    void Pattern04(int a){
        System.out.println("\nPattern 04 :- \n");
        for(int i=1;i<=a;i++){
            for(int j=1;j<a*2;j++){
                if((j-i)<0 || j>(a*2)-i )
                    System.out.print(Patterns02.sp);
                else {
                    System.out.print(j%2 +" ");
                }
            }
            System.out.println();
        }
    }

    void Pattern05(int a){
        System.out.println("\nPattern 05 :- \n");
        for(int i=1;i<=a;i++){
            int k=1;
            for(int j=1;j<a*2;j++){
                if((j-i)<0 || j>(a*2)-i )
                    System.out.print(Patterns02.sp);
                else {
                    if(j<a)
                        System.out.print( k++  +" ");
                    else
                        System.out.print(k-- +" ");
                }
            }
            System.out.println();
        }
    }

    void Pattern06(int a){
        System.out.println("\nPattern 06 :- \n");
        for(int i=1;i<=a;i++){
            int k=1;
            for(int j=1;j<a*2;j++){
                if((j-i)<0 || j>(a*2)-i )
                    System.out.print(Patterns02.sp);
                else {
                    System.out.print(k +" ");
                }
                if(j<a)
                    k++;
                else
                    k--;
            }
            System.out.println();
        }
    }

    void Pattern07(int a){
        System.out.println("\nPattern 07 :- \n");
        for(int i=1;i<=a;i++){
            int k=1;
            int z=1;
            for(int j=1;j<a*2;j++){
                if((j-i)<0 || j>(a*2)-i )
                    System.out.print(Patterns02.sp);
                else {
                    if(k++ % 2 ==1)
                        System.out.print(z++ +" ");
                    else
                        System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    void Pattern08(int a){
        System.out.println("\nPattern 08 :- \n");
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(j<i)
                    System.out.print(Patterns02.sp);
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    void Pattern09(int a){
        System.out.println("\nPattern 09 :- \n");
        for(int i=a;i>=1;i--){
            for(int j=1;j<=a;j++){
                if(j>i)
                    System.out.print(Patterns02.sp);
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

}
