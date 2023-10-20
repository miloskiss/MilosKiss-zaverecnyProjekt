/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojisteni;

/**
 * Třída reprezentuje pojištěnce
 * 
 * @author Miloš Kišš
 */
public class Pojistenec {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefon;
    
    /**
     * Vytvoří novou instanci pojištěnce
     * @param jmeno Jméno pojištěnce
     * @param prijmeni Příjmení pojištěnce
     * @param vek Věk pojištěnce
     * @param telefon Telefón pojištěnce
     */
    public Pojistenec(String jmeno, String prijmeni, int vek, String telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    /**
     * @return jmeno Vrací jméno pojištěnce
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * @param jmeno Nastaví jméno pojištěnce
     */
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    /**
     * @return prijmeni Vrací příjmení pojištěnce
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * @param prijmeni Nastaví příjmení pojištěnce
     */
    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    /**
     * @return vek Vrací věk pojištěnce
     */
    public int getVek() {
        return vek;
    }

    /**
     * @param vek Nastaví věk pojištěnce
     */
    public void setVek(int vek) {
        this.vek = vek;
    }

    /**
     * @return telefon Vrací telefón pojištěnce
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * @param telefon Nastaví telefón pojištěnce
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    
    /**
     * Vrací textovou reprezentaci pojištěnce 
     * @return Textová reprezentace pojištěnce
     */
    @Override
    public String toString() {
       // return String.format("%s\t\t\t%s\t\t\t%d\t\t\t%s", jmeno, prijmeni, vek, telefon);
       return String.format("%-20s%-20s%-20d%-20s\n", jmeno, prijmeni, vek, telefon);
    }
}
