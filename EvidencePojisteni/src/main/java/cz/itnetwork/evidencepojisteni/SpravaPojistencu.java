/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojisteni;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Třída pro správu pojištěnců a komunikaci s konzolou
 * @author Miloš Kišš
 */
public class SpravaPojistencu {
    
    private SeznamPojistencu seznamPojistencu;
    private Scanner sc = new Scanner(System.in, "Windows-1250");
    
    /**
     * Konstruktor inicializuje instanci správy pojištěnců
     */
    public SpravaPojistencu() {
        seznamPojistencu = new SeznamPojistencu();
    }
    
    /**
     * pomocná metoda k zadávání a validaci věku pojištěnce
     * @return Vrací věk pojištěnce
     */
    private int zadajVek() {
        System.out.println("Zadejte věk:");
        while (true) {
            try {
                int vek = Integer.parseInt(sc.nextLine());
                return vek;
            } catch (Exception e) {
                System.out.println("Špatně zadaný věk. Zadejte prosím celé číslo:");
            }
        }
    }
    
    /**
     * pomocná metoda k zadávání a validaci jména pojištěnce
     * @return Vrací jméno pojištěnce
     */
    private String zadejJmeno() {
        String jmeno = "";
        while (jmeno.isEmpty()) {
            System.out.println("Zadejte jméno pojištěnce:");
            jmeno = sc.nextLine().trim();
        }
        return jmeno;
    }
    
    /**
     * pomocná metoda k zadávání a validaci příjmení pojištěnce
     * @return Vrací příjmení pojištěnce
     */
    private String zadejPrijmeni() {
        String prijmeni = "";
        while (prijmeni.isEmpty()) {
        System.out.println("Zadejte příjmení pojištěnce:");
        prijmeni = sc.nextLine().trim();
        }
        return prijmeni;
    }
        
   
    /**
     * Vypíše úvodní obrazovku do konzole
     */
    public void vypisUvod() {
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("        EVIDENCE POJIŠTĚNÝCH");
        System.out.println("--------------------------------------");
        System.out.println();
        System.out.println("Vyberte si akci:");
    }
    
    /**
     * Vypíše jednotlivé volby při každé iteraci hlavním cyklem
     */
    public void vypisMenu() {
        System.out.println("1 - Přidat nového pojištěnce");
        System.out.println("2 - Vypsat všechny pojištěnce");
        System.out.println("3 - Vyhledat pojištěnce");
        System.out.println("4 - Konec");
        System.out.println();
    }
    
    /**
     * Řekne si o nové jméno, příjmmení, věk a telefón a uloží nového pojištěnce 
     */
    public void pridejZaznam() {
    
        String jmeno = zadejJmeno();
        String prijmeni = zadejPrijmeni();
        int vek = zadajVek();
        System.out.println("Zadejte telefónní číslo:");
        String telefon = sc.nextLine();
        
        seznamPojistencu.pridejPoistence(jmeno, prijmeni, vek, telefon);
        System.out.println();
        System.out.println("Data byla uložena. Pokračujte libovolnou klávesou ...");
    }
    
    /**
     * Vypíše všechny existující pojištěnce do konzole
     */
    public void vypisZaznamy() {
        ArrayList<Pojistenec> pojistenci = seznamPojistencu.vypisVsechnyPojistence();
        System.out.println();
        for (Pojistenec pojistenec : pojistenci) {
            System.out.println(pojistenec);
        }
        System.out.println();
        System.out.println("Pokračujte libovolnou klávesou ...");
    }
    
    /**
     * Vyhledá podle zadaného jména a příjmení pojištěnce a vypíše je do konzole
     */
    public void vyhledejZaznamy() {
        String jmeno = zadejJmeno();
        String prijmeni = zadejPrijmeni();
        System.out.println();
        ArrayList<Pojistenec> pojistenci = seznamPojistencu.vyhledejPojistence(jmeno, prijmeni);
        if (!pojistenci.isEmpty()) {
            for (Pojistenec pojistenec : pojistenci) {
                System.out.println(pojistenec);
            }      
        } else {
            System.out.println("Nebyly nalezeny žádný pojištěnci s tímto jménem a příjmením! ");
        }
        System.out.println();
        System.out.println("Pokračujte libovolnou klávesou ...");
    }
}
