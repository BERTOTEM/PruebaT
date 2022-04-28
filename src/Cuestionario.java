
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Cuestionario {
    private final List<Pregunta> preguntas;
    public int aciertos;//variable para conteo de aciertos que me sirve para continuar con cada categoria de preguntas (facil,normal,dificil,muy dificil mumy muy dificil)
    public int fallos;//variable para determinar si el jugador se equivoco y  desea retirarse o no 
    
   

    public int getAciertos() {
        return aciertos;
    }
    public int getFallos() {
        return fallos;
    }



    public Cuestionario() {
        this.preguntas = new ArrayList<>();//crea la arrylist con todas las preguntas
    }

    public void agregarPregunta(Pregunta p) {
        this.preguntas.add(p);
    }

    public void preguntar() {
        
        Collections.shuffle(preguntas);//funcion que me permite ordenar al azar la lista que contiene las varibles
        int numero = 1;
        Iterator<Pregunta> it = this.preguntas.iterator(); it.hasNext();//funcion para iterrar la primera pocisiono de la lista
        Pregunta p = it.next();
        boolean acierta = p.preguntar(numero);
        
        if (acierta) {
            System.out.println("Correcto\n");
            this.aciertos++;
            } else {
            System.out.println("Incorrecto, pierdes todo el acumulado"); 
            this.fallos++;
            }
        }
    }

    
