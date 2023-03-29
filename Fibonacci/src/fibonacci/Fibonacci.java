package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        int n; 
        System.out.println("Ingrese el número a calcular: ");
        n = sc.nextInt(); 
        System.out.println("El Fibonacci del numero ingresado es: " + Fibonacci1.fibonacci(n)); 
    }   
}
