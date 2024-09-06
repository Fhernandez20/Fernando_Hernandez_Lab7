/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventan_juegoxo;

/**
 *
 * @author fdhg0
 */
public class jugadores {
    private Usuarios[] jugador;
    
    public jugadores(int tamaño){
        jugador= new Usuarios[tamaño];
    }
    Usuarios buscar(String jugadores) {
        for (Usuarios use : jugador) {
            if (use != null && use.getusername().equals(jugadores)) {
                return use;
            }
        }
        return null;
    }
    public boolean agregarJugadores(String jugadores,String password) {
        if (buscar(jugadores) == null) {
            for (int contador = 0; contador < jugador.length; contador++) {
                if (jugador[contador] == null) {
                    jugador[contador] = new Usuarios(jugadores, password);
                    return true;
                }
            }
        }
        return false;
    }
    public boolean Login(String usuario, String password) {
        Usuarios jugador = buscar(usuario);
        if (jugador != null) {
            if (jugador.getpassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
    public String getJugadoresSesion() {
        for (Usuarios contador : jugador) {
            if (contador != null && contador.getJugando()) {
                return contador.getusername();
            }
        }
        return null;
    }
    
}
