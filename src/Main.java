/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Universidad unal = new Universidad("unal");
        int i=0;
        do{
            System.out.println("1. Adicionar estudiante ");
            System.out.println("2. Adicionar proyecto ");
            System.out.println("3. Adicionar estudiante a proyecto ");
            System.out.println("4. Listar estudiantes ");
            System.out.println("5. Listar proyectos ");
            System.out.println("6. Buscar estudiante ");
            i = lectura.nextInt();
            }while(i<0 && i>6);
            switch(i){
                case 1:
                    System.out.println("Ingrese el nombre del estudiante: ");
                    String nombre = lectura.next();
                    System.out.println("Ingrese el codigo del estudiante: ");
                    int codigo = lectura.nextInt();
                    Estudiante estudiante = new Estudiante(codigo, nombre);
                    unal.adicionarEstudiante(estudiante);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del proyecto: ");
                    String nombreProy = lectura.next();
                    unal.adicionarProyecto(nombreProy);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del estudiante: ");
                    String nombre1 = lectura.next();
                    System.out.println("Ingrese el codigo del estudiante: ");
                    int codigo1 = lectura.nextInt();
                    Estudiante estudiante1 = new Estudiante(codigo1, nombre1);
                    System.out.println("Ingrese # del proyecto: ");
                    int pos = lectura.nextInt();
                    unal.adicionarEstudiantepProyecto(pos, estudiante1);
                    break;
                case 4:
                    
                    
                    break;
                case 5:
                
                
                    break;
            }
        
    
    }
}
