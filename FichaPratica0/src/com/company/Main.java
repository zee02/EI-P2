package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Olá mundo!");

        int x = 5;
        double soma = 0;
        boolean flag = false;

        if (x % 2 == 0) {
            flag = true;
        } else {
            flag = false;
        }

        switch(x % 2) {
            case 0:
                flag = true;
                break;
            case 1:
                flag = false;
                break;
        }

        flag = (x % 2 == 0) ? true : false;

        for (int i = 1; i<=x;i++) {
            if(i==3){
                continue;
            }else {
                soma += i;
            }
        }

        soma = 0;
        int i = 1;
        while(i <= x){
            soma += i;
            i++;
        }

        soma = 0;
        i = 1;
        if (i <= x){
            do {
                soma+=i;
                i++;
            }while (i <= x);
        }


    }
}
