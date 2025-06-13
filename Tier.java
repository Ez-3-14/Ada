public class Tier {
    private String art;
    private String name;
    private boolean satt;
    private float groesse;

    public Tier() {
        super();
        this.art = "";
        this.name = "";
        this.satt = false;
        this.groesse = 0.0f;
    }

    public Tier(String art, String name, float groesse) {
        super();
        this.art = art;
        this.name = name;
        this.satt = false;
        this.groesse = groesse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public boolean getsatt() {
        return satt;
    }

    public float getGroesse() {
        return groesse;
    }

    public void setGroesse(float groesse) {
        this.groesse = groesse;
    }

    public boolean fuettern() {
        if (satt) {
            return false;
        } else {
            System.out.println("Bitte " + art + " namens " + name + " füttern.");
            satt = true;
            return true;
        }
    }
}
