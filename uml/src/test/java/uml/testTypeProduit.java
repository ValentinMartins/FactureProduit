package uml;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class testTypeProduit {

    @Test
    void testGetTva() {

        TypeProduit luxe = new TypeProduit(19.8, "mobilier");
        double tvaLuxe = luxe.getTva();

        assertEquals(19.8, tvaLuxe);

    }

    @Test
    void testGetType() {
        TypeProduit luxe = new TypeProduit(19.8, "mobilier");
        String rs = luxe.getType();

        assertEquals("mobilier", rs);

    }

    @Test
    void testSetTva() {
        TypeProduit luxe = new TypeProduit(19.8, "mobilier");
        luxe.setTva(10.3);
        double rs = luxe.getTva();

        assertEquals(10.3, rs);

    }

    @Test
    void testSetType() {
        TypeProduit luxe = new TypeProduit(19.8, "mobilier");
        luxe.setType("chemisier");
        String rs = luxe.getType();

        assertEquals("chemisier", rs);

    }

}
