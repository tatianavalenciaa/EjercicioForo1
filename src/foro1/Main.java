package foro1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    
    /*
        Esta variable "alumnos" de tipo Map<String, Alumno>, es la que 
        ocuparemos para ir almacenando todos los Alumnos.
        La llave: es el carnet del alumno (tipo String)
        El valor: es el objeto alumno (tipo Alumno) 
        
    */
    private static Map<String, Alumno> alumnos = new HashMap<>();
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        
        do {
            
            mostrarMenu();
            
            System.out.print("\nIngrese una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    ingresarAlumno();
                    break;
                case 2:
                    buscarAlumno();
                    break;
                case 3:
                    eliminarAlumno();
                    break;
                case 4:
                    mostrarAlumnos();
                    break;
                case 5:
                    System.out.println("\n*** Programa Terminado ***\n");
                    break;
                default:
                    System.out.println("Opcion Incorrecta! Intente de nuevo!");
            }
            
                  
                 
        } while (opcion != 5);
        
    }
    
    private static void mostrarMenu() {
        
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("SISTEMA GESTION DE ALUMNOS");
        System.out.println("---------------------------");
        System.out.println("");

        System.out.println("MENU:\n");
        System.out.println("(1) Ingresar Alumno");
        System.out.println("(2) Buscar Alumno");
        System.out.println("(3) Eliminar Alumno");
        System.out.println("(4) Mostrar Alumnos");
        System.out.println("(5) Salir");
    
    }

    private static void ingresarAlumno() {
        
        Scanner scanner = new Scanner(System.in);
        Alumno alumno = new Alumno();
        
        System.out.println("\n---------------------------");
        System.out.println("\n*** Ingresando Alumno ***\n");
        
        System.out.print("Carnet: ");
        alumno.setCarnet(scanner.nextLine());
        System.out.print("Nombres: ");
        alumno.setNombres(scanner.nextLine());
        System.out.print("Apellidos: ");
        alumno.setApellidos(scanner.nextLine());
        
        alumnos.put(alumno.getCarnet(), alumno);
        
        System.out.println("\n*** Alumno Ingresado Exitosamente ***\n");
    
    }

    private static void buscarAlumno() {
        
        Scanner scanner = new Scanner(System.in);
        boolean encontrado = false;
        
        if (alumnos.isEmpty()) {
            System.out.println("\n*** NO hay ningun alumno ingresado ***\n");
            return;
        }
        
        System.out.println("\n---------------------------");
        System.out.println("\n*** Buscando Alumno ***\n"); 
        
        System.out.print("Carnet: ");
        String carnet = scanner.nextLine();
        
        for (Map.Entry<String, Alumno> alumno : alumnos.entrySet()) {
            if(carnet.equals(alumno.getValue().getCarnet())) {
                System.out.println("");
                System.out.println("Carnet: " + alumno.getValue().getCarnet());
                System.out.println("Nombres: " + alumno.getValue().getNombres());
                System.out.println("Apellidos: " + alumno.getValue().getApellidos());
                System.out.println("");
                System.out.println("\n*** Alumno encontrado ***\n");
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("\n*** Alumno NO encontrado ***\n");
        }
        
    }

    private static void eliminarAlumno() {
    
        Scanner scanner = new Scanner(System.in);        
        
        if (alumnos.isEmpty()) {
            System.out.println("\n*** NO hay ningun alumno ingresado ***\n");
            return;
        }
        
        System.out.println("\n---------------------------");
        System.out.println("\n*** Eliminando Alumno ***\n"); 
        
        System.out.print("Carnet: ");
        String carnet = scanner.nextLine();
        
        alumnos.remove(carnet);
        System.out.println("\n*** Alumno eliminado ***\n");
        
    }

    private static void mostrarAlumnos() {
     
        System.out.println("\n---------------------------");
        System.out.println("\n*** Mostrando Alumnos ***\n");
        
        System.out.println("Cantidad de Alumnos: " + alumnos.size());
        
        int i = 1;
        for (Map.Entry<String, Alumno> alumno : alumnos.entrySet()) {
            System.out.println("");
            System.out.println("Alumno #" + (i++) + "\n");
            System.out.println("Carnet: " + alumno.getValue().getCarnet());
            System.out.println("Nombres: " + alumno.getValue().getNombres());
            System.out.println("Apellidos: " + alumno.getValue().getApellidos());
            System.out.println("");       
        }
        
        System.out.println("\n*** Alumnos Mostrados Exitosamente ***\n");
    }
    
}
