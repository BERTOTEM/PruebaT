
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julian mazo
 */
public class Lectura {

    public void Lectura (){//metodo para leeer un archivo CSV  vienen del inglés "Comma Separated Values"(archivos separados por comas)    
        try{
         BufferedReader reader= new BufferedReader(new FileReader("historico.CSV"));
         String line= null;
         while((line = reader.readLine())!= null){
                String[] parts=line.split(",");
                int totalParts = parts.length;
                for(int i =0;i<totalParts;i++){
                  System.out.print(parts[i]+" ");
                  
                }
                System.out.print("\n");
                
         }
        }catch(IOException e){
        e.printStackTrace();
        }
    
}



   
}

    
    
