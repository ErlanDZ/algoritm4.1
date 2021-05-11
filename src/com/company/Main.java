package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Начальный диапазон: ");
        Scanner n = new Scanner(System.in);
        int n1 = n.nextInt();
        System.out.println("Введите конечный  диапазон: ");
        Scanner m = new Scanner(System.in);
        int m1 = m.nextInt();
        int n2, i;
        for (n2 = n1; n2 < m1; n2++){
            int m2 =0;
            for (i = 1; i < n2; i++){
                if (n2 % i == 0){
                    m2 +=i;
                    if (m2 == n2){
                        System.out.print(n2 +" ");//  сложность  алгоритма  O(m1 *n2)
                    }
                }
            }
        }


    }
}
