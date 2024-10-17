/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Manel
 */
import java.util.Scanner;
public class JavaClassesTutorial {
    public static void main(String[] args) {
        Pacamon p0 = new Pacamon();
        p0.declarar();
        
        Scanner scan = new Scanner(System.in);
        String name = " ";
        
        System.out.println("HOLA, Bienvenido al mundo de los Pacomones! (nintendo no me demandes)");
        System.out.println("Antes de comenzar tu aventura dime, como te llamas?");
        name = scan.nextLine();
        System.out.println("Encantado de conocerte " + name + " Espero que estes listo para esta corta aventura!");
        
        
        System.out.println("Ahora a llegado el momento al que has estado esperando, ESCOJE TU PACOMON! ");
        
        
        Pacamon p1 = new Pacamon();
        p1.nombre = "Pacachu";
        p1.nivel = 10;
        
        Pacamon p2 = new Pacamon ();
        p2.nombre = "Iva";
        p2.nivel = 20;
        
        Pacamon p3 = new Pacamon("Pedro", 30);
                
        
        System.out.println("SELECIONA 1: " + p1.nombre);
        System.out.println("SELECIONA 2: " + p2.nombre);
        System.out.println("SELECIONA 3: " + p3.nombre);
        
    }
}
