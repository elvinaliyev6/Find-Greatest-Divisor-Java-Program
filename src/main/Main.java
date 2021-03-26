package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = greatestDivisor(a);
        System.out.println(d);
    }

    static int greatestDivisor(int n) {
        if ((n & 1) == 0) {
            return n / 2;
        }
        int i = 3;
        while (i * i <= n) {
            if (n % i == 0) {
                return n / i;
            }
            i = i + 2;
        }
        return 1;
    }

}
