public class Vuelo {
    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int numMaxPasajeros;
    private int numActualPasajeros;
    private Pasajero listaPasajeros[];
    
    

    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numMaxPasajeros,
            int numActualPasajeros, Pasajero[] listaPasajeros) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
        this.numActualPasajeros = 0;
        this.listaPasajeros = new Pasajero[numMaxPasajeros];
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }

    public int getNumActualPasajeros() {
        return numActualPasajeros;
    }

    public void insertarPasajero(Pasajero pasajero){
        listaPasajeros[numActualPasajeros] = pasajero;
        numActualPasajeros++;
    }

    public Pasajero getPasajero(int i){
        return listaPasajeros[i];
    }

    public Pasajero getPasajeroPasaporte(String pasaporte){
        int index = 0;
        boolean encontrado = false;
        Pasajero pasajero = null;
        while((!encontrado) && (index < listaPasajeros.length)){
            if(pasaporte.equals(listaPasajeros[index].getPasaporte())){
                pasajero = listaPasajeros[index];
                encontrado = true;
            }
            index++;
        }
        return pasajero;
    }

}
