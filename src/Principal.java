import java.util.Scanner;

public class Principal {
    static Scanner entrada = new Scanner(System.in);
    static int numero = 4;
    static Aeropuerto aeropuertos[] = new Aeropuerto[numero];

    public static void main(String[] args){
    }

    public static void insertarDatosAeropuerto(Aeropuerto aeropuerto[]){
        aeropuerto[0] = new AeropuertoPublico( "El Dorado","Bogotá D.C","Colombia",80000000); 
        // aeropuerto[0].insertarCompañia("Avion Line");git init
    }

}
