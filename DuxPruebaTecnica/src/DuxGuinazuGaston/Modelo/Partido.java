
package DuxGuinazuGaston.Modelo;

public class Partido {
    
    private int id_partido;
    private String torneo;
    private int sets;

    public Partido(int id_partido, String torneo, int sets) {
        this.id_partido = id_partido;
        this.torneo = torneo;
        this.sets = sets;
    }

    public Partido(String torneo, int sets) {
        this.torneo = torneo;
        this.sets = sets;
    }
     

    public int getId_partido() {
        return id_partido;
    }

    public void setId_partido(int id_partido) {
        this.id_partido = id_partido;
    }

    public String getTorneo() {
        return torneo;
    }

    public void setTorneo(String torneo) {
        this.torneo = torneo;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }    
 
    

    @Override
    public String toString() {
        return "torneo " + torneo;
    }
    
    
    
}
