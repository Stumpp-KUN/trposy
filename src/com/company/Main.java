package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int amountOfNum=0;
        System.out.println("Vvedite kol-vo 4isel");
        Scanner tg=new Scanner(System.in);
        amountOfNum=tg.nextInt();
        int[] numbers=new int[amountOfNum];
        System.out.println("Nachinaite vvodit'");

        for(int i=0;i<amountOfNum;i++){
            numbers[i]=tg.nextInt();
        }

        int[] sumofNums=new int[numbers.length];

        for(int i=0;i<numbers.length;i++){
            sumofNums[i]=conver(numbers[i]);
        }

        int min=sumofNums[0];
        int count=0;
        for(int i=0;i< sumofNums.length;i++){
            if(sumofNums[i]<min){
                min=sumofNums[i];
                count=i;
            }
        }
        System.out.println(numbers[count]);
    }

    public static int conver(int x){
        int[] sum=new int[x];
        int k=0;
        int result=0;
        boolean[] foundDigits=new boolean[x];

        for(int i=0;i< foundDigits.length;i++)
            foundDigits[i]=false;

        while(x>0){
            sum[k]=x%10;
            x=x/10;
            if(foundDigits[sum[k]]==false){
                result++;
                foundDigits[sum[k]]=true;
            }
            k++;
        }

        return result;
    }

}