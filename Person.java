public class Person {
    private String name;
    private String vorname;
    private java.util.Date gebDatum;
    private String anrede;
    private Adresse adressePrivat;
    private Adresse adresseGeschaeft;

    public void setAdresse(Adresse adresse) {
        this.adressePrivat = adresse;
    }

    public Adresse getAdresse() {
        return adressePrivat;
    }

    // Weitere Methoden nach Bedarf...
}
