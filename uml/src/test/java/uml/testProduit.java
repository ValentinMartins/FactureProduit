package uml;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class testProduit {

    @Test
    void testGetPrixTTC() {
        TypeProduit luxe = new TypeProduit(20, "mobilier");
        double tvaLuxe = luxe.getTva();
        int prixHTtu = 10;
        Produit tables = new Produit(20, "table", prixHTtu, tvaLuxe, luxe.getType());

        assertEquals(12, tables.getPrixTTC());

    }

    @Test
    void testGetPrixHT() {
        TypeProduit luxe = new TypeProduit(20, "mobilier");
        double tvaLuxe = luxe.getTva();
        int prixHTtu = 10;
        Produit tables = new Produit(20, "table", prixHTtu, tvaLuxe, luxe.getType());

        assertEquals(10, tables.getPrixHT());

    }

    @Test
    void testSetPrixHtEtMajPrixTTC() {
        TypeProduit luxe = new TypeProduit(20, "mobilier");
        double tvaLuxe = luxe.getTva();
        int prixHTtu = 10;
        Produit tables = new Produit(20, "table", prixHTtu, tvaLuxe, luxe.getType());
        tables.setPrixHT(20);

        assertEquals(24, tables.getPrixTTC());

    }

}
