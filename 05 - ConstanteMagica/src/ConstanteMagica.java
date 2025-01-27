import java.util.Scanner;


public class ConstanteMagica {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int lado;
        do {
            lado = lector.nextInt();
            if (lado != 0) {
                int inicial = lector.nextInt();
                int cMagica = ((lado*lado + (inicial - 1) + inicial) / 2)*lado;
                System.out.println(cMagica);
            }
        } while (lado != 0);
    }
}