package uml;

import java.time.LocalDate;
import java.util.HashMap;

// fait par valentin martins
public class Facture {

    private int identifiant;
    private LocalDate date;
    private double montantHT = 0;
    private HashMap<Produit, Integer> produits;
    private double montantTTC = 0;
    private Client client;

    public Facture(int identifiant, LocalDate date, double montantHT, double montantTTC,
            HashMap<Produit, Integer> produit, Client client) {
        this.identifiant = identifiant;
        this.date = date;
        this.produits = produit;
        this.client = client;
        this.montantHT = montantHT;
        this.montantTTC = montantTTC;
        this.client = client;

    }

    // fait par valentin martins
    public void ajouterProduit(Produit prod, int qte) {

        this.produits.put(prod, qte);

    }

    public void retirerProduit(Produit prod) {

        this.produits.remove(prod);

    }

    public void getFacture() {

        for (

        HashMap.Entry<Produit, Integer> pro : produits.entrySet()) {

            System.out.println("produit " + pro.getKey().getLibelle() + " qte:" + pro.getValue() + " pour un prix :"
                    + pro.getKey().getPrixHT() + " et un prix Totale TTC :"
                    + pro.getKey().getPrixTTC() * pro.getValue());

        }

        System.out.println("bonjour " + client.getMail() + " Vous avez acheter pour un montant HT de :" + montantHT
                + " et pour un cout TTC de:" + montantTTC + " a la date du " + date);
    }
}
