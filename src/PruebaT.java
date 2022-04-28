/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author julia
 */
import java.util.List;
import java.util.Scanner;


public class PruebaT{

   
   public static void main (String[] args) {
        Lectura historico = new Lectura();
        Cuestionario facil = new Cuestionario();
        facil.agregarPregunta(new Pregunta("Que palabra aparece tradicionalmente en la pantalla al terminar un largometraje?", List.of(
                new Respuesta("Conclusion", false),
                new Respuesta("Final", false),
                new Respuesta("Acabo", false),
                new Respuesta("Fin", true)
        )));
        facil.agregarPregunta(new Pregunta("Que frase se usa para describir a especies animales que podrian desaparecer?", List.of(
                new Respuesta("Bajo riesgo", false),
                new Respuesta("En peligro de extincion", true),
                new Respuesta("Bajo amenaza", false),
                new Respuesta("Peligradas", false)        
        )));

        facil.agregarPregunta(new Pregunta("Que significa la abreviación en ingles \"BFF\"?", List.of(
                new Respuesta("Best Friends Forever", true),
                new Respuesta("Bye for Five", false),
                new Respuesta("Buff Fit Fella", false),
                new Respuesta("Boy Friend Furious", false)
               
        )));
        
         facil.agregarPregunta(new Pregunta("De que pais son nativos los canguros?", List.of(
                new Respuesta("Irlanda", false),
                new Respuesta("Kenia", false),
                new Respuesta("Australia", true),
                new Respuesta("Peru", false)
                
        )));
         
        facil.agregarPregunta(new Pregunta("Que hace una persona que se esta preparando para trabajar duro?", List.of(
                new Respuesta("Dobla las toallas", false),
                new Respuesta("Se arremanga la camisa", true),
                new Respuesta("Baja las cortinas", false),
                new Respuesta("Enrolla sus posters de Motley Crue", false)
                
        ))); 
        
        Cuestionario normal = new Cuestionario();
        normal.agregarPregunta(new Pregunta("Una tarjeta SD es un dispositivo de", List.of(
                new Respuesta("Comunicacion remota", false),
                new Respuesta("Compresion de video", false),
                new Respuesta("Memoria", true),
                new Respuesta("Comunicacion analoga", false)
        )));
        normal.agregarPregunta(new Pregunta("A que se refiere la frase “Pasar a mejor vida”?", List.of(
                new Respuesta("Hacerse rico", false),
                new Respuesta("Mudarse al Caribe", false),
                new Respuesta("Irse a la cárcel", false),
                new Respuesta("Fallecer", true)
        )));

        normal.agregarPregunta(new Pregunta("El actor Daniel Ratcliffe ha encarnado en la gran pantalla a uno de estos personajes:", List.of(
                new Respuesta("Harry Potter", true),
                new Respuesta("Indiana Jones", false),
                new Respuesta("Luke Skywalker", false),
                new Respuesta("Perl y KotlinSuperman", false)
                
        )));
        
        normal.agregarPregunta(new Pregunta("Que le gusta hacer a Justin Bieber en las paredes de las ciudades que visita?", List.of(
                new Respuesta("Pegar avisos", false),
                new Respuesta("Jugar paredon", false),
                new Respuesta("Pintar grafitis", true),
                new Respuesta("Llorar sin consuelo", false)
                
        )));
         
        normal.agregarPregunta(new Pregunta("En la pelicula de Disney; Tambor, el amigo de Bambi, es un:", List.of(
                new Respuesta("Elefante", false),
                new Respuesta("Conejo", true),
                new Respuesta("Gato", false),
                 new Respuesta("Perro", false)
                
        )));
        Cuestionario dificil = new Cuestionario();
        dificil.agregarPregunta(new Pregunta("Un metodo recursivo es como...", List.of(
                new Respuesta("function()=>function(){}", false),
                new Respuesta("()=>()=>{}", false),
                new Respuesta("a(b())", false),
                new Respuesta("a(a())", true)
        )));
        dificil.agregarPregunta(new Pregunta("Una abstraccion es...", List.of(
                new Respuesta("Es una herencia de una clase abstracta", false),
                new Respuesta("Es una implementacion de una interfaz", true),
                new Respuesta("Es una herencia de una clase maestra", false),
                new Respuesta("Es una herencia de multiples comportamientos", false)
        )));

        dificil.agregarPregunta(new Pregunta("Un Modelo Entidad Relacion (MER) nos referimos a...", List.of(
                new Respuesta("Entidades de datos relacionadas", true),
                new Respuesta("Clases relacionadas", false),
                new Respuesta("Objectos relacionados", false),
                new Respuesta("Entidades de clases relacionados", false)
                
        )));
        
         dificil.agregarPregunta(new Pregunta("Que combinaciones de join podemos hacer? para una base de datos relacional?", List.of(
                new Respuesta("join, add joins, merge join", false),
                new Respuesta("join reverse, join combination, inner joint", false),
                new Respuesta("inner, full, left y right", true),
                new Respuesta("Ninguna de las anteriores", false)
                
        )));
         
        dificil.agregarPregunta(new Pregunta("Una función arrow de de javascript, que suma dos numero es... ", List.of(
                new Respuesta("(a,2)=>a+2", false),
                new Respuesta("(a,b)=> a+b", false),
                new Respuesta("()=>a+b", false),
                new Respuesta("(a,b)=>a+b", true)
                
        )));
        Cuestionario Mdificil = new Cuestionario();
        Mdificil.agregarPregunta(new Pregunta("De que murio el compositor Chopin?", List.of(
                new Respuesta("De un ataque al corazon", false),
                new Respuesta("De un cancer estomacal ", false),
                new Respuesta("De insuficiencia renal aguda", false),
                new Respuesta("De tuberculosis", true)
        )));
        Mdificil.agregarPregunta(new Pregunta("Cada componente cromatico de la luz blanca en cuerpos transparentes se mueve a velocidad diferente. El color mas rapido en ese sentido es el…", List.of(
                new Respuesta("purpura", false),
                new Respuesta("rojo", true),
                new Respuesta("naranja", false),
                new Respuesta("amarillo", false)
        )));

        Mdificil.agregarPregunta(new Pregunta("Que santo fundo la Abadia de Montecasino?", List.of(
                new Respuesta("Benedicto", true),
                new Respuesta("Bernardo", false),
                new Respuesta("Buenaventura", false),
                new Respuesta("Bonifacio", false)
                
        )));
        
         Mdificil.agregarPregunta(new Pregunta("Cual de estas peliculas de los 80 se estreno primero?", List.of(
                new Respuesta("Cocodrilo Dundee", false),
                new Respuesta("Arma letal", false),
                new Respuesta("Entre pillos anda el juego", true),
                new Respuesta("Regreso al futuro", false)
                
        )));
         
        Mdificil.agregarPregunta(new Pregunta("El mercader veneciano Marco Polo fue oficial en la corte de…", List.of(
                new Respuesta("Saladino", false),
                new Respuesta("Tameriano el magnifico", false),
                new Respuesta("Ivan el Terrible", false),
                new Respuesta("Kumiai Khan", true)
                
        )));
        Cuestionario MMdificil = new Cuestionario();
        MMdificil.agregarPregunta(new Pregunta("Cuantos mares rodean la peninsula de los Balcanes?", List.of(
                new Respuesta("3", false),
                new Respuesta("5 ", false),
                new Respuesta("4", false),
                new Respuesta("6", true)
        )));
        MMdificil.agregarPregunta(new Pregunta("A que cosa tambien se lo conoce como Dalle?", List.of(
                new Respuesta("Horno", false),
                new Respuesta("Maquina segadora", true),
                new Respuesta("Sombrero", false),
                new Respuesta("Enfermedad", false)
        )));

        MMdificil.agregarPregunta(new Pregunta("Que novela escribio James Fenimore Cooper en una discusión con su esposa?", List.of(
                new Respuesta("Precaucion", true),
                new Respuesta("Los pioneros", false),
                new Respuesta("El ultimo mohicano", false),
                new Respuesta("El cazador de ciervos", false)
                
        )));
        
         MMdificil.agregarPregunta(new Pregunta("Que nombre nunca ha adoptado un papa?", List.of(
                new Respuesta("Valentin", false),
                new Respuesta("Eugenio", false),
                new Respuesta("Jorge", true),
                new Respuesta("Gregorio", false)
                
        )));
         
        MMdificil.agregarPregunta(new Pregunta("Cual de estas leyes es falsa en Chile?", List.of(
                new Respuesta("Prohibido tocar las campanas para incitar al pueblo a sublevarse", false),
                new Respuesta("Prohibido andar en carruaje donde haya una multitud de gente", false),
                new Respuesta("Prohibido poner plantas con maceteros en tus balcones o ventanas", false),
                new Respuesta("Prohibido montar en burros o mulas estando bajo los efectos del alcohol", true)
                
        )));
        
        
        
        int salida=0,salidan=0,salidad=0,salidam=0,salidamm=0,Ganancia=0,DatosGuardados=0,Bucle=0;  
        while(Bucle==0){
        System.out.println("BIENVENIDO AL JUEGO QUIEN QUIERE SER MILLONARIO\n");
        System.out.println("-presiona 1 para ver la tabla de historicos de los jugadores anterios");
        System.out.println("-presiona 2 para iniciar tu partida");
        Scanner dc = new Scanner(System.in);
        String NombreJ;
        String EdadJ;
        int datos = dc.nextInt();
        
        if(datos == 2){
            facil.preguntar();
        if(facil.getFallos()== 0){
            Ganancia= 2550;    
            System.out.println("Total de gancia acumulada "+Ganancia+" dolares");
            System.out.println("  DESEA CONTINUAR? 1.SI 2.NO ?\n");
            salida = dc.nextInt();}
        
        if((facil.getAciertos()== 1) && (salida==1)){
            normal.preguntar();
        if(normal.getFallos()== 0){
            Ganancia=Ganancia*2;
            System.out.println("Total de gancia acumulada "+Ganancia+" dolares");
            System.out.println("  DESEA CONTINUAR? 1.SI 2.NO ?\n");
            salidan = dc.nextInt();}
        
        if((normal.getAciertos()== 1) && (salidan==1)){  
            dificil.preguntar();
        if(dificil.getFallos()== 0){
            Ganancia=Ganancia*3;
            System.out.println("Total de gancia acumulada "+Ganancia+" dolares");
            System.out.println("  DESEA CONTINUAR? 1.SI 2.NO ?\n");
            salidad = dc.nextInt();}
        
        if((dificil.getAciertos()== 1) && (salidad==1)){       
            Mdificil.preguntar();
        if(Mdificil.getFallos()== 0){
            Ganancia=Ganancia*4;
            System.out.println("Total de gancia acumulada "+Ganancia+" dolares");
            System.out.println("  DESEA CONTINUAR? 1.SI 2.NO ?\n");
            salidam = dc.nextInt();}
        
        if((Mdificil.getAciertos()== 1) && (salidam==1)){
            MMdificil.preguntar();
        if(MMdificil.getFallos()== 0){
            Ganancia=Ganancia*5;
            System.out.println("Total de gancia acumulada "+Ganancia+" dolares");
            System.out.println("  DESEA CONTINUAR? 1.SI 2.NO ?\n");
            salidamm = dc.nextInt();}

        if((MMdificil.getAciertos()== 1) && (salidamm==1)){
            System.out.println("FELICIDADES ACABAS DE GANAR EL JUEGO");
            
            System.out.println("TE LLEVAS "+Ganancia+" DOLARES!!!!!");}}}}}
        if(facil.getFallos()== 1|| normal.getFallos()== 1||dificil.getFallos()== 1||Mdificil.getFallos()== 1||MMdificil.getFallos()== 1){
            Ganancia=Ganancia*0;}
            System.out.println("TE LLEVAS "+Ganancia+" DOLARES!!!!!\n\n");}
        else if(datos == 1){
        historico.Lectura();   
        }
        System.out.println(" GRACIAS POR JUGAR QUIEN QUIERE SER MILLONARIO\n");
        System.out.println("-presiona 1 para guardar tus datos y puntuacion");
        System.out.println("-presiona 2 si solo quieres salir del juego");
        DatosGuardados = dc.nextInt();
        if(DatosGuardados == 1){
        System.out.println("-Dime tu nombre seguido de tu edad ejm(julian 23)");
        NombreJ = dc.next();
        EdadJ = dc.next();
        jugador jugadorp = new jugador();
        jugadorp.jugador(NombreJ, EdadJ, Ganancia);
            
        }else if(DatosGuardados== 2){
            System.out.println(" VUELVE PRONTO\n");
            Bucle=1;
        }
        }
   
   
   
   
   }
        
    }
  
