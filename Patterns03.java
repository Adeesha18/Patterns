package com.RCB.Patterns;
import java.util.Scanner;
// All Patterns.
public class Patterns03 {
    public static String sp="  ";
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.print("Enter THe Rows :-");
        int a = sca.nextInt();
        Patterns03 pa = new Patterns03();
        pa.Pattern01(a);
        pa.Pattern02(a);
        pa.Pattern03(a);
        pa.Pattern04(a);
        pa.Pattern05(a);
        pa.Pattern06(a);
        pa.Pattern07(a);
        sca.close();
    }
    void Pattern01(int a){
        System.out.println("\nPattern 01 :- \n");
        int z=1;
        for(int i=1;i<a*2;i++){
            for (int j=1;j<a*2;j++){
                if(j<=(a-z)||j>=a+z){
                    System.out.print(Patterns01.sp);
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
            if(i<a)
                z++;
            else
                z--;
        }
    }
    void Pattern02(int a){
        System.out.println("\nPattern 02 :- \n");
        int z=1;
        for(int i=1;i<a*2;i++){
            for (int j=1;j<a*2;j++){
                if(j<=(a-z)||j>=a+z){
                    System.out.print(Patterns03.sp);
                }
                else{
                    System.out.print((i%2)+" ");
                }
            }
            System.out.println();
            if(i<a)
                z++;
            else
                z--;
        }
    }
    void Pattern03(int a){
        System.out.println("\nPattern 03 :- \n");
        int z=1;
        for(int i=1;i<a*2;i++){
            for (int j=1;j<a*2;j++){
                if(j<=(a-z)||j>=a+z){
                    System.out.print(Patterns03.sp);
                }
                else{
                    System.out.print(((a%2==0)? (j+1)%2 : j%2)+" " );
                }
            }
            System.out.println();
            if(i<a)
                z++;
            else
                z--;
        }
    }
    void Pattern04(int a){
        System.out.println("\nPattern 04 :- \n");
        int z=1;
        for(int i=1;i<a*2;i++){
            for (int j=1;j<a*2;j++){
                if(j<=(a-z)||j>=a+z){
                    System.out.print(Patterns03.sp);
                }
                else{
                    System.out.print((char)('A'+i-1)+" ");
                }
            }
            System.out.println();
            if(i<a)
                z++;
            else
                z--;
        }
    }
    void Pattern05(int a){
        System.out.println("\nPattern 05 :- \n");
        int z=1;
        for(int i=1;i<a*2;i++){
            int x=1;
            for (int j=1;j<a*2;j++){
                if(j<=(a-z)||j>=a+z){
                    System.out.print(Patterns03.sp);
                }
                else{
                    System.out.print(((j<a)? x++ : x-- )+" ");
                }
            }
            System.out.println();
            if(i<a)
                z++;
            else
                z--;
        }
    }
    void Pattern06(int a){
        System.out.println("\nPattern 06 :- \n");
        int z=1;
        for(int i=1;i<a*2;i++){
            int x=a;
            for (int j=1;j<a*2;j++){
                if(j<=(a-z)||j>=a+z){
                    System.out.print(Patterns03.sp);
                }
                else{
                    System.out.print(x+" ");
                }
                if(j<a)
                    x--;
                else
                    x++;
            }
            System.out.println();
            if(i<a)
                z++;
            else
                z--;
        }
    }
    void Pattern07(int a){
        System.out.println("\nPattern 07 :- \n");
        int z=1;
        for(int i=1;i<a*2;i++){
            int x=1,y=1;
            for (int j=1;j<a*2;j++){
                if(j<=(a-z)||j>=a+z){
                    System.out.print(Patterns03.sp);
                }
                else{
                    System.out.print(((x%2==1)? y++ : "*")+" ");
                    x++;
                }
            }
            System.out.println();
            if(i<a)
                z++;
            else
                z--;
        }
    }
}
