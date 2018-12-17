import java.io.*;
import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int factorial = scanner.nextInt();
    int n = 1;
    while ((factorial/=n)>n)
        n++;
    System.out.println(n);
}
}