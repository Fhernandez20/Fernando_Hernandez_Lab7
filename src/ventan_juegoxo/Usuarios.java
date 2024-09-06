/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventan_juegoxo;

/**
 *
 * @author fdhg0
 */
public class Usuarios {
    private String username;
    private String password;
    private int partidasGanadas;
    private boolean jugando;
    
       
    public Usuarios(String username,String password){
        this.username=username;
        this.password=password;
        this.partidasGanadas=0;
        this.jugando=jugando;
    }
    
    public String getusername(){
        return username;
    }
    public void setusername(String username){
        this.username= username;
    }
    public String getpassword(){
        return password;
    }
    public void setpassword(String password){
        this.password= password;
    }
    public boolean getJugando(){
        return jugando;
    }
    public void setJugando(Boolean jugando){
        this.jugando=jugando;
    }
}
