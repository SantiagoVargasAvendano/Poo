
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Proyecto {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }
  
    public boolean adicionarEstudiante(Estudiante estudiante){
        return estudiantes.add(estudiante);
    }
    
    public ArrayList listarEstudiantes(){
        return estudiantes;
    }
}
