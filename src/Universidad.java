
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
public class Universidad {
    private String nombre;
    private HashMap<Integer,Estudiante> estudiantes;
    private ArrayList<Proyecto> proyectos;
    
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new HashMap<>();
        this.proyectos = new ArrayList<>();        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public boolean adicionarEstudiante(Estudiante estudiante){
        return estudiantes.put(estudiante.getCodigo(), estudiante) != null;
    }
    
    public boolean adicionarProyecto(String nombre){
        return proyectos.add(new Proyecto(nombre));
    }
    
    public boolean adicionarEstudiantepProyecto(int pos, Estudiante estudiante){
        return proyectos.get(pos).adicionarEstudiante(estudiante);
    }
 
    public ArrayList<Proyecto> listarProyectos(){
        return proyectos;
    }
    
    public HashMap<Integer,Estudiante> listarestudiantes(){
        return estudiantes;
    }
    
    public Estudiante buscarEstudiante(int codigo){
        return this.estudiantes.get(codigo);
    }
}
