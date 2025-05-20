/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum220425quiz;

/**
 *
 * @author Ari
 */
public class Kerucut extends Lingkaran{
    private double tinggi;

    public Kerucut(){
        super();
        this.tinggi = 0;
    }

    public Kerucut(double r, double t){
        super(r);
        this.tinggi = t;}

    
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public double getTinggi(){
        return tinggi;
    }

    public double getSisiMiring(){
        return Math.sqrt(getR() * getR() + tinggi * tinggi);
    }

    public double getVolume(){
        return (1.0 / 3) * super.getLuas() * tinggi;
    }

    @Override
    public String toString(){
        return "jari jari kerucut = " + getR() + " dan tinggi = " + tinggi;
    }

    @Override
    public double getLuas(){
        double s = getSisiMiring();
        return 3.14 * getR() * (getR() + s);
    }
}
