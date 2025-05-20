/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum220425quiz;

/**
 *
 * @author Ari
 */
public class Silinder extends Lingkaran{
    private double tinggi;

    public Silinder(){
        super();
        this.tinggi = 0;
    }

    public Silinder(double r, double t){
        super(r);
        this.tinggi = t;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public double getTinggi(){
        return tinggi;
    }

    public double getVolume(){
        return super.getLuas() * tinggi;
    }

    @Override
    public String toString(){
        return "jari jari silinder = " + getR() + " dan tinggi = " + tinggi;
    }

    @Override
    public double getLuas(){
        return 2 * 3.14 * getR() * (getR() + tinggi);
    }
}
