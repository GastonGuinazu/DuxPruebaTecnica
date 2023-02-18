package DuxGuinazuGaston.Controlador;

import DuxGuinazuGaston.Modelo.Jugador;
import DuxGuinazuGaston.Modelo.Partido;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ControladorPartido {

    private String conexion;

    public ControladorPartido() {
        conexion = "jdbc:mysql://localhost:3306/duxPruebaTecnica?user=root&password=gasti123";
    }

    public List<Jugador> obtenerJugadores() {
        List<Jugador> lst = new ArrayList<>();
        String query = "SELECT nombre_jugador, probabilidad FROM jugador ORDER BY id_jugador";

        try (Connection cnn = DriverManager.getConnection(conexion);
                Statement st = cnn.createStatement();
                ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {
                String nombre = rs.getString("nombre_jugador");
                int prob = rs.getInt("probabilidad");               

                lst.add(new Jugador(nombre, prob));
            }
            rs.close();
            st.close();
            cnn.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }
    
    public List<Partido> obtenerPartido() {
        List<Partido> lst = new ArrayList<>();
        String query = "SELECT torneo,sets FROM partido";

        try (Connection cnn = DriverManager.getConnection(conexion);
                Statement st = cnn.createStatement();
                ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {
                String torneo = rs.getString("torneo");
                int sets = rs.getInt("sets");               

                lst.add(new Partido(torneo, sets));
            }
            rs.close();
            st.close();
            cnn.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }
    
    public String obtenerJugador1() {
        String jugador1 = "";
        try ( Connection cnn = DriverManager.getConnection(conexion);
                Statement st = cnn.createStatement();
                ResultSet rs = st.executeQuery("SELECT nombre_jugador FROM jugador ORDER BY id_jugador LIMIT 1")) {

            while (rs.next()) {

                String nombre = rs.getString("nombre_jugador");
                jugador1 = nombre;
            }
            rs.close();
            st.close();
            cnn.close();
            
        } catch (Exception e) {
            e.getMessage();
        }
        return jugador1;
    }
    
    public String obtenerJugador2() {
        String jugador2 = "";
        try ( Connection cnn = DriverManager.getConnection(conexion);
                Statement st = cnn.createStatement();
                ResultSet rs = st.executeQuery("SELECT nombre_jugador FROM jugador ORDER BY id_jugador desc LIMIT 1")) {

            while (rs.next()) {

                String nombre = rs.getString("nombre_jugador");
                jugador2 = nombre;
            }
            rs.close();
            st.close();
            cnn.close();
            
        } catch (Exception e) {
            e.getMessage();
        }
        return jugador2;
    }

    public boolean InscribirJugador(Jugador jugador) {
        boolean ok = true;
        String query = "INSERT INTO jugador (nombre_jugador,probabilidad) VALUES (?,?)";
        try ( Connection cnn = DriverManager.getConnection(conexion);
                PreparedStatement ps = cnn.prepareStatement(query)) {

            ps.setString(1, jugador.getNombre_jugador());
            ps.setDouble(2, jugador.getProbabilidad());

            ok = ps.execute();
            cnn.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ok = false;
        }
        return ok;
    }

    public boolean crearPartido(Partido partido) {
        boolean ok = true;
        String query = "INSERT INTO partido (torneo,sets) VALUES (?,?)";
        try ( Connection cnn = DriverManager.getConnection(conexion);
                PreparedStatement ps = cnn.prepareStatement(query)) {

            ps.setString(1, partido.getTorneo());
            ps.setInt(2, partido.getSets());

            ok = ps.execute();
            cnn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ok = false;
        }
        return ok;
    }

    public boolean borrarJugador() {
        boolean ok = true;
        String query = "DELETE FROM jugador WHERE id_jugador >= 1";
        try ( Connection cnn = DriverManager.getConnection(conexion);
                PreparedStatement ps = cnn.prepareStatement(query);) {
            ok = ps.execute();
            cnn.close();
            
        } catch (Exception e) {
            e.getMessage();
            ok = false;
        }
        return ok;
    }
    
    public boolean borrarPartido() {
        boolean ok = true;
        String query = "DELETE FROM partido WHERE id_partido >= 1";
        try ( Connection cnn = DriverManager.getConnection(conexion);
                PreparedStatement ps = cnn.prepareStatement(query);) {
            ok = ps.execute();
            cnn.close();
        } catch (Exception e) {
            e.getMessage();
            ok = false;
        }
        return ok;
    }

}
