import java.util.Scanner;


public class UltimoDigitoFactorial{


    public static void main(String args[]){

        Scanner lector = new Scanner(System.in);
        int casos = lector.nextInt();

        for (int i=0; i<casos; i++){

            int num = lector.nextInt();
            int factorial =1;
            if (num <5){
                for (int j = 1; j<= num; j++){
                    factorial *= j;
                }
                System.out.println (factorial % 10);
            }else{
                System.out.println (0);
            }
        }
    }
}