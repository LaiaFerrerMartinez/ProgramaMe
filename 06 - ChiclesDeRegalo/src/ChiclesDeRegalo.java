import java.util.Scanner;

public class ChiclesDeRegalo{


    public static void main(String args[]){

        Scanner lector = new Scanner (System.in);

        while (true){

            int cambio = lector.nextInt();  // Número minimo de chicles para oferta
            int oferta = lector.nextInt();  // Número de chicles por oferta
            int totalInicial = lector.nextInt();  // numero total de chicles

            if ((cambio==0) && (oferta==0) && (totalInicial==0)){
                break;
            }

            boolean error = false;

            if (oferta >= cambio){
                error = true;
            }

            int paraCanjear = totalInicial;
            int comidos = totalInicial;
            //int resto = 0;
            int anterior = 0;

            while (paraCanjear >= cambio){

                anterior = paraCanjear;

                // Canjeo
                int regalo = (paraCanjear / cambio) * oferta;
                paraCanjear = (paraCanjear % cambio);

                comidos = comidos + regalo;
                paraCanjear = paraCanjear + regalo;

                if (paraCanjear >= anterior ){
                    error=true;
                    break;
                }
            }

            if (error){
                System.out.println ("RUINA");
            }else{
                System.out.println (comidos + " " + paraCanjear);
            }
        }
    }
}