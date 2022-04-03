package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }

        // Problem 1
        System.out.println("Minimum element in array is " + MinNumInArr(arr));

        // Problem 2
        System.out.println("Average = " + AverageArr(arr));

        // Problem 3
        int num = sc.nextInt();
        System.out.println(IsPrime(num, 2) ? "Number is prime" : "Number is composite");

        // Problem 4
        num = sc.nextInt();
        System.out.println("Factorial " + num + " = " + Factorial(num));

        // Problem 5
        int fibNum = sc.nextInt();
        System.out.println(Fibonacci(fibNum));

        // Problem 6
        num = sc.nextInt();
        int degree = sc.nextInt();
        System.out.println(num + " in degree " + degree + " = " + NumDegree(num, degree));

        // Problem 7
        arrSize = sc.nextInt();
        int[] arr2 = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            arr2[i] = sc.nextInt();
        }
        ReverseArr(arr2, 0, arrSize - 1);
        for (int value : arr2) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Problem 8
        String s = sc.nextLine();
        System.out.println(StrOfNumbers(s, 0) ? "Yes" : "No");

        // Problem 9
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(BinomialCoefficient(k, n));


        // Problem 10
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD = " + gcd(a, b));
    }

    // Problem 1
    public static int MinNumInArr(int[] arr) {
        int min = arr[0];

        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }

        return min;
    }

    // Problem 2
    public static double AverageArr(int[] arr) {
        double average = 0;

        for (int value : arr) {
            average += value;
        }

        return average / arr.length;
    }

    // Problem 3
    public static boolean IsPrime(int num, int count) {
        if (num == 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        if (num % count == 0) {
            return false;
        }

        if (count <= Math.sqrt(num)) {
            return IsPrime(num, count + 1);
        }
        else {
            return true;
        }
    }

    // Problem 4
    public static int Factorial(int num) {
        if (num == 0) {
            return 1;
        }

        return num * Factorial(num - 1);
    }

    // Problem 5
    public static int Fibonacci(int num) {
        if (num == 0) {
            return 0;
        }

        if (num == 1) {
            return 1;
        }

        return Fibonacci(num - 1) + Fibonacci(num - 2);
    }

    // Problem 6
    public static int NumDegree(int num, int degree) {
        if (degree == 0) {
            return 1;
        }

        return num * NumDegree(num, degree - 1);
    }

    // Problem 7
    public static void ReverseArr(int[] arr, int start, int end) {
        int tmp;
        if (start >= end) {
            return;
        }

        tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;

        ReverseArr(arr, start + 1, end - 1);
    }

    // Problem 8
    public static boolean StrOfNumbers(String s, int start) {
        if (start == s.length()) {
            return true;
        }

        if (Character.isDigit(s.charAt(start))) {
            return StrOfNumbers(s, start + 1);
        }

        return false;
    }

    // Problem 9
    public static int BinomialCoefficient(int k, int n) {
        if (k == 0 || k == n) {
            return 1;
        }

        return BinomialCoefficient(k - 1, n - 1) + BinomialCoefficient(k, n - 1);
    }

    // Problem 10
    public static int gcd(int a, int b) {
        int mod = a % b;
        if (mod == 0) return b;

        return gcd(b, mod);
    }
}
