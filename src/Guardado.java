
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julian mazo
 */
class Guardado {
   
    public  void Guardado( String name,String age,int record,String filepath){//metodo para invocar y escribir dentro de un archivo CSV "Comma Separated Values"
    try{
        FileWriter f = new FileWriter(filepath,true);
        BufferedWriter b = new BufferedWriter(f);
        PrintWriter p = new PrintWriter(b);
        
        p.println("Dinero Ganado,"+record+"  Dolares  ,Nombre "+name+",  Edad "+age);
        p.flush();
        p.close();
        System.out.print("guardado ");
    }
    catch(Exception E){
    System.out.print(" no  guardado ");
    
    }
    }

    
}
