public abstract class Mitarbeiter {
    private String name;
    protected int grundgehalt;
    protected int kontonummer;

    public Mitarbeiter() {
    }

    public Mitarbeiter(String name, int grundgehalt, int kontonummer) {
        this.name = name;
        this.grundgehalt = grundgehalt;
        this.kontonummer = kontonummer;
    }

    public  abstract double verdienstBerrechnen();

    // Eigenschaft von Abstrakten Klassen: Aus abstrackten klassern lässt sich kein objekt erstellen, die Sgnaturren müssen geleich bleibn



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrundgehalt() {
        return grundgehalt;
    }

    public void setGrundgehalt(int grundgehalt) {
        this.grundgehalt = grundgehalt;
    }
}
