/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.evidencepojisteni;

import java.util.Scanner;

/**
 * Třída main obsahuje hlavní cyklus programu a obsluhuje volby pro další běh programu
 * @author Miloš Kišš
 */
    public class EvidencePojisteni {

        public static void main(String[] args) {
       
            Scanner sc = new Scanner(System.in, "Windows-1250");
            SpravaPojistencu spravaPojistencu = new SpravaPojistencu();
            String volba = "";
            spravaPojistencu.vypisUvod();
            spravaPojistencu.vypisMenu();
            
            while (!volba.equals("4")) {
                volba = sc.nextLine();
                switch (volba) {
                    case "1":
                        spravaPojistencu.pridejZaznam();
                        break;
                    case "2":
                        spravaPojistencu.vypisZaznamy();
                        break;
                    case "3":
                        spravaPojistencu.vyhledejZaznamy();
                        break;
                    case "4":
                        // vyskočí z cyklu a ukončí program
                        break;
                    default:
                        System.out.println("Neplatná volba. Pokračujte libovolnou klávesou ... ");
                        spravaPojistencu.vypisMenu();
                }
            }
        }
    }
