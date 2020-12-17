package uml;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class testListeProduit {

    @Test
    void testGetPrixTTC() {

        TypeProduit luxe = new TypeProduit(20, "mobilier");
        double tvaLuxe = luxe.getTva();
        int prixHTtu = 10;
        TypeProduit pasTva = new TypeProduit(0, "info");
        double pTva = pasTva.getTva();
        int prixHTglo = 20;
        Produit tables = new Produit(1, "table", prixHTtu, tvaLuxe, luxe.getType());
        Produit souris = new Produit(2, "souris", prixHTglo, pTva, luxe.getType());

        ListeProduit listePro = new ListeProduit();
        listePro.ajoueProduit(5, tables);
        listePro.ajoueProduit(10, souris);

        assertEquals(260, listePro.getTtcGlobale());

    }

    @Test
    void testGetHtGlobale() {

        TypeProduit luxe = new TypeProduit(20, "mobilier");
        double tvaLuxe = luxe.getTva();
        int prixHTtu = 10;
        TypeProduit pasTva = new TypeProduit(0, "info");
        double pTva = pasTva.getTva();
        int prixHTglo = 20;
        Produit tables = new Produit(1, "table", prixHTtu, tvaLuxe, luxe.getType());
        Produit souris = new Produit(2, "souris", prixHTglo, pTva, luxe.getType());

        ListeProduit listePro = new ListeProduit();
        listePro.ajoueProduit(5, tables);
        listePro.ajoueProduit(10, souris);

        assertEquals(250, listePro.GetHtGlobale());

    }

}
