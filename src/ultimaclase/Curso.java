/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimaclase;

import java.util.ArrayList;

/**
 *
 * @author Punto Digital
 */
class Curso {
    private String nombreCurso;
    private int cupo;
    private double notaAprobacion;
    private ArrayList<Inscripcion> incripciones;

    public Curso(String nombreCurso, int cupo, double notaAprobacion, ArrayList<Inscripcion> incripciones) {
        this.nombreCurso = nombreCurso;
        this.cupo = cupo;
        this.notaAprobacion = notaAprobacion;
        this.incripciones = incripciones;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public double getNotaAprobacion() {
        return notaAprobacion;
    }

    public void setNotaAprobacion(double notaAprobacion) {
        this.notaAprobacion = notaAprobacion;
    }

    public ArrayList<Inscripcion> getIncripciones() {
        return incripciones;
    }

    public void setIncripciones(ArrayList<Inscripcion> incripciones) {
        this.incripciones = incripciones;
    }
    
    
}
