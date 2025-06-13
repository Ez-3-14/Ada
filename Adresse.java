public class Adresse {
    private String strasse;
    private String hausnummer;
    private String adresszusatz;
    private int plz;
    private String ort;

    public Adresse() {}

    public Adresse(String strasse, String hausnummer, String adresszusatz, int plz, String ort) {
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.adresszusatz = adresszusatz;
        this.plz = plz;
        this.ort = ort;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    // Weitere Getter und Setter nach demselben Muster...
}
