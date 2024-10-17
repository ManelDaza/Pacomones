/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manel
 */
public class Pacamon {
    int nivel;
    String nombre;
    
    
    Pacamon(){
        nivel = 1;
        
    }
    
    Pacamon(String pNombre, int pNivel){
        nivel = pNivel;
        nombre = pNombre;        
    }
    
    //metodos
    void declarar(){
        System.out.println(nombre + " ataco");
    }
}
