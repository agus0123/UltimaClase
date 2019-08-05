/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimaclase;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Punto Digital
 */
public class Colegio {
   ArrayList<Curso> cursos;

    public Colegio() {
    }
   
    int ObtenerCantidadAlumnos(String nombreCurso){
    int aux=0;
       
        for(Curso i: cursos){
        aux=i.getNombreCurso().equals(nombreCurso)? i.getIncripciones().size():0;
        }
        return aux;
    }
    
    int estudiantesAprobados(String nombreCurso){
        int contador=0;
         for(Curso i: cursos){
             if(i.getNombreCurso().equals(nombreCurso)){
                for(Inscripcion j: i.getIncripciones()){
                   contador= (j.getNota()>=i.getNotaAprobacion())? contador+1: contador+0;
                  }
             }
             
        }
         return contador;
    }
}
