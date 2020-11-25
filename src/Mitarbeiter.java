public class Mitarbeiter {
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

    public double verdienstBerrechnen(){
        return 2000;
    }


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
