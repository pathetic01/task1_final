package com.pm;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double radius, height, a = 0, v;
        System.out.println("Введите radius");
        radius = read(a);
        System.out.println("Введите height");
        height = read(a);
        v = calc(radius, height);
        answer(v);
    }

    private static double read(double x){
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        return x;
    }

    private static double calc(double r, double h){
        double v = r*r * Math.PI * h; // формула вычисления Объема
        return v;
    }

    private static void answer(double v){
        if (v <= 0) {
            System.out.println("Ошибка!"); 
        }
        else {
            System.out.println("Ответ: " + v);
        }
    }
}
