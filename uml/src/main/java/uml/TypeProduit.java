package uml;

// fait par valentin martins
public class TypeProduit {
    private double tva = 0.2;
    private String typeProd = "";

    public TypeProduit(double tva, String typeProd) {
        this.tva = tva;
        this.typeProd = typeProd;
    }

    public double getTva() {
        return tva;
    }

    public String getType() {
        return typeProd;
    }

    public void setType(String newType) {
        this.typeProd = newType;
    }

    public void setTva(double newTva) {
        this.tva = newTva;
    }
}
// fait par valentin martins