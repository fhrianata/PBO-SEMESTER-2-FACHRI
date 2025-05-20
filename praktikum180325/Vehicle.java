/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum180325;

/**
 *
 * @author Ari
 */
public class Vehicle {
    public double load;
    public double maxLoad;
    
    public Vehicle(double maxLoad){
        this.maxLoad = maxLoad;
        
    }
    public double getLoad(){
        return load;
        
    }
    public double getMaxLoad(){
        return maxLoad;
    }
}
