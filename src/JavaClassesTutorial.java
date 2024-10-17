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
        // Declarando los pacamones
        Pacamon p1 = new Pacamon(1, "Pacachu", 30, 15, 15, 15);
        Pacamon p2 = new Pacamon(2, "Iva", 40, 20, 10, 10);
        Pacamon p3 = new Pacamon(3, "Pedro", 20, 30, 10, 40);
        Pacamon p4 = new Pacamon(4, "Espinetin", 30, 15, 15, 15);
        Pacamon p5 = new Pacamon(5, "Pandachu", 30, 15, 15, 15);
        Pacamon p6 = new Pacamon(6, "Mikachu", 30, 15, 15, 15);
        Pacamon p7 = new Pacamon(7, "PacaGON", 30, 15, 15, 15);
        Pacamon p8 = new Pacamon(8, "Penta", 30, 15, 15, 15);
        Pacamon p9 = new Pacamon(9, "PacXDmon", 30, 15, 15, 15);
        
        Scanner scan = new Scanner(System.in);
        String name = " ";
        
        System.out.println("HOLA, Bienvenido al mundo de los Pacomones! (nintendo no me demandes)");
        System.out.println("Antes de comenzar tu aventura dime, como te llamas?");
        name = scan.nextLine();
        System.out.println("Encantado de conocerte " + name + " Espero que estes listo para esta corta aventura!");
        System.out.println("Ahora a llegado el momento al que has estado esperando, ESCOJE TU PACOMON! ");
        
        
        System.out.println("SELECIONA 1: " + p1.nombre);
        System.out.println("SELECIONA 2: " + p2.nombre);
        System.out.println("SELECIONA 3: " + p3.nombre);
    }
}
