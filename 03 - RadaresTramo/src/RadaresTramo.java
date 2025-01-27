import java.util.Scanner;


public class RadaresTramo{

    public static void main(String args[]){

        Scanner lector = new Scanner(System.in);

        while(true){

            int distanciaMetros = lector.nextInt();
            int velMax = lector.nextInt();
            int tSegundos = lector.nextInt();

            if ( (distanciaMetros == 0) && (velMax == 0) && (tSegundos == 0)){
                break;
            }

            if ( (distanciaMetros <= 0) || (velMax <= 0) || (tSegundos <= 0)){
                System.out.println ("ERROR");
                continue;
            }

            double distancia = distanciaMetros / 1000.0;
            double t = tSegundos / 3600.0;

            double velMedia = distancia / t ;

            if (velMedia > velMax){

                double velPuntos = (velMax * 0.2) + velMax;

                if (velMedia >= velPuntos){
                    System.out.println ("PUNTOS");
                }else{
                    System.out.println ("MULTA");
                }

            }else{
                System.out.println ("OK");
            }
        }
    }
}