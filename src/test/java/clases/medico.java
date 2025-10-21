/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego
 */
public class medico {
    private String nomb;
    private String appa;
    private String apma;
    private int cod;
    private double sueld;

    public medico(String nomb, String appa, String apma, int cod, double sueld) {
        this.nomb = nomb;
        this.appa = appa;
        this.apma = apma;
        this.cod = cod;
        this.sueld = sueld;
    }

    public medico() {
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public String getAppa() {
        return appa;
    }

    public void setAppa(String appa) {
        this.appa = appa;
    }

    public String getApma() {
        return apma;
    }

    public void setApma(String apma) {
        this.apma = apma;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getSueld() {
        return sueld;
    }

    public void setSueld(double sueld) {
        this.sueld = sueld;
    }
    
    
    
}
