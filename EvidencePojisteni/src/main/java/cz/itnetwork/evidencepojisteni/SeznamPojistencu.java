/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojisteni;

import java.util.ArrayList;

/**
 * Třída představuje databázi pojištěnců
 * @author Miloš Kišš
 */
public class SeznamPojistencu {
    
    /**
     * Záznamy databázy tzn jednotlivý pojištěnci uložení v seznamu
     */
    private ArrayList<Pojistenec> pojistenci;
    
    /**
     * Vytvoří novou instanci databáze pojištěnců
     */
    public SeznamPojistencu() {
        pojistenci = new ArrayList<>();
    }
    
    /**
     * Přidá pojištěnce do databáze
     * @param jmeno Jméno pojištěnce
     * @param prijmeni Příjmení pojištěnce
     * @param vek Věk pojištěnce
     * @param telefon Telefón pojištěnce
     */
    public void pridejPoistence(String jmeno, String prijmeni, int vek, String telefon) {
        pojistenci.add(new Pojistenec(jmeno, prijmeni, vek, telefon));
    }
    /**
     * Vrací seznam všech pojištěnců
     * @return Všechny pojištěnci
     */
    public ArrayList<Pojistenec> vypisVsechnyPojistence() {
        return pojistenci;
    }
    
    /**
     * Vyhledá v databázy pojištěnce podle jména a příjmení
     * @param jmeno Jméno hledaného pojištěnce
     * @param prijmeni Příjmení hledaného pojištěnce
     * @return Instance pojištěnců s daným jménem a příjmením
     */
    public ArrayList<Pojistenec> vyhledejPojistence(String jmeno, String prijmeni) {
        ArrayList<Pojistenec> nalezene = new ArrayList<>();
        for (Pojistenec pojistenec : pojistenci) {
            if (pojistenec.getJmeno().equals(jmeno) && pojistenec.getPrijmeni().equals(prijmeni)) {
                nalezene.add(pojistenec);
            }
        }
        return nalezene;
    }
}
