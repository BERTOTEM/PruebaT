import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julia
 */
class Pregunta {
    private final String pregunta;
    private final List<Respuesta> respuestas;
    private static final String letras = "abcd";//opciones validas para cada pregunta

    public Pregunta(String pregunta, List<Respuesta> respuestas) {
        this.pregunta = pregunta;
        this.respuestas = respuestas;
    }
    

    /*public Pregunta(String pregunta) {
        this.pregunta = pregunta;
        this.respuestas = new ArrayList<>();
    }*/

    

    public void agregarRespuesta(Respuesta r) {
        this.respuestas.add(r);
    }

    public boolean respuestaCorrecta(String respuesta) {//metodo que invoca a respuesta el cual en confunto determina la opcion correcta
        int indice = letras.indexOf(respuesta);
        if (indice == -1) {
            return false;
        }
        return this.respuestas.get(indice).esCorrecta;
    }

    public boolean preguntar(int numero) {//metodo para imprimir todas las preguntas y sus posibles respuestas tambien invoca a respuestaCorrecta la cual determina si es  opcion correcta de la pregunta
        System.out.println("- "+ this.pregunta);
        int indice = 0;
        for (Respuesta r : this.respuestas) {
            System.out.printf("%c) %s\n", letras.charAt(indice), r.respuesta);
            indice++;
        }
        
        Scanner sc = new Scanner(System.in);
        String respuesta;
        System.out.println("Elige: ");
        respuesta = sc.nextLine(); 
                                                    
       
        
        return this.respuestaCorrecta(respuesta);
    }
}

