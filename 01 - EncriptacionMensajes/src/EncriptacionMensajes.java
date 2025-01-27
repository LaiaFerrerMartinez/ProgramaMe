import java.util.Scanner;

public class EncriptacionMensajes{

    public static void main(String args[]){

        Scanner lector = new Scanner(System.in);
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        String vocales = "aeiouAEIOU";
        int codigoP = alfabeto.indexOf("p");
        while(true){
            String linea=lector.nextLine();
            int desplazamiento = codigoP - alfabeto.indexOf(linea.charAt(0));
            if (desplazamiento <0){
                desplazamiento = alfabeto.length() - ((-1)* desplazamiento);
            }

            int numVocales=0;
            String mensaje = "";

            for (int i=1;i<linea.length();i++){

                int codigoCar = alfabeto.indexOf(Character.toLowerCase(linea.charAt(i)));
                char caracterCifrado;
                if (codigoCar<0){
                    caracterCifrado = linea.charAt(i);
                }else{
                    int codigoNuevo = (codigoCar + desplazamiento) % alfabeto.length();
                    caracterCifrado = alfabeto.charAt(codigoNuevo);
                }

                if (Character.isUpperCase(linea.charAt(i))){
                    mensaje += Character.toUpperCase(caracterCifrado);
                }else{
                    mensaje += caracterCifrado;
                }
                for (int j = 0; j < vocales.length(); j++) {
                    if (caracterCifrado == vocales.charAt(j)) {
                        numVocales++;
                    }
                }
            }

            if (mensaje.equals("FIN")==false){
                System.out.println (numVocales);
            }else{
                break;
            }
        }
    }
}