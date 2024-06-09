import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de elementos en la secuencia de Fibonacci que desea obtener: ");
        int count = scanner.nextInt();
        scanner.close();

        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2); // Imprimiendo 0 y 1 inicialmente

        for (int i = 2; i < count; ++i) { // Bucle empieza desde 2 porque 0 y 1 ya están impresos
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
