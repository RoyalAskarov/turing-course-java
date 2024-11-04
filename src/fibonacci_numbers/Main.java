package fibonacci_numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci f = new fibonacci();
        System.out.println(f.fib(n));
    }
}
