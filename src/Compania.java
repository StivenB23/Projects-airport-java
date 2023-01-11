public class Compania {
    private String nombre;
    private Vuelo listaVuelos[];
    private int numeroVuelo = 0;

    public Compania(String nombre) {
        this.nombre = nombre;
    }  

    public Compania(String nombre, Vuelo[] listaVuelos) {
        this.nombre = nombre;
        this.listaVuelos = listaVuelos;
        this.numeroVuelo = listaVuelos.length;
    }



    public void insertarVuelo(Vuelo vuelo){
        listaVuelos[numeroVuelo]  = vuelo;
        numeroVuelo++;
    }

    public String getNombre() {
        return nombre;
    }

    public Vuelo[] getListaVuelos() {
        return listaVuelos;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public Vuelo getVuelo(int i){
        return listaVuelos[i];
    }

    public Vuelo getVuelo(String identificador){
        int index = 0;
        boolean encontrado = false;
        Vuelo vuelo = null;
        while((!encontrado) && (index < listaVuelos.length)){
            if(identificador.equals(listaVuelos[index].getIdentificador())){
                vuelo = listaVuelos[index];
                encontrado = true;
            }
            index++;
        }
        return vuelo;
    }

   

    
}
