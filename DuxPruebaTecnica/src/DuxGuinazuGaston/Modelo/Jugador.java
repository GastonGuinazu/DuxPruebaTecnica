
package DuxGuinazuGaston.Modelo;


public class Jugador {
    
    private int id_jugador;
    private String nombre_jugador;
    private int probabilidad;

    public Jugador(int id_jugador, String nombre_jugador, int probabilidad) {
        this.id_jugador = id_jugador;
        this.nombre_jugador = nombre_jugador;
        this.probabilidad = probabilidad;
    }

    public Jugador(String nombre_jugador, int probabilidad) {
        this.nombre_jugador = nombre_jugador;
        this.probabilidad = probabilidad;
    }    

    public Jugador(String nombre_jugador) {
        this.nombre_jugador = nombre_jugador;
    }  
    

    public int getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(int id_jugador) {
        this.id_jugador = id_jugador;
    }

    public String getNombre_jugador() {
        return nombre_jugador;
    }

    public void setNombre_jugador(String nombre_jugador) {
        this.nombre_jugador = nombre_jugador;
    }

    public int getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(int probabilidad) {
        this.probabilidad = probabilidad;
    }   
    
    @Override
    public String toString() {
        return  nombre_jugador;
    }
    
    
}
