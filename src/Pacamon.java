/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manel
 */
public class Pacamon {
    int dex;
    String nombre;
    int nivel;
    int ps;
    int ataque;
    int defensa;
    int vel;
    
    Pacamon(){
        nivel = 1;
        nombre = "Missigno";
        ps = 1;
        ataque = 1;
        defensa = 1;
    }
    
    Pacamon(int dex, String nombre, int ps, int ataque, int defensa, int vel){
        this.dex = dex;
        this.nombre = nombre;
        this.ps = ps;
        this.ataque = ataque;
        this. defensa = defensa;
        this.vel;
    }
    
    //metodos
    void declarar(){
        System.out.println(nombre + " ataco");
    }
}
