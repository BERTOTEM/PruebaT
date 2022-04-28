/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author julian
 */
public class jugador {
     public String  nombre;
     public String  edad;
     public int maxrecord;


    public void jugador(String nombre, String edad,int  maxrecord) {//metodo que guarda los datos del jugador y invoca a guardado qeu se encarga de escribirlos en el CSV
        this.nombre = nombre;
        this.edad = edad;
        this.maxrecord = maxrecord;
        String filepath="historico.CSV";
        Guardado g=new Guardado();
        g.Guardado(nombre,edad,maxrecord,filepath);
        
    }
    
    
}
