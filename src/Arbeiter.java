public class Arbeiter extends Mitarbeiter{
    private double stundenlohn;
    private int arbeitsstunden;

    public Arbeiter() {
        super();
    }

    Arbeiter(String name, int grundgehalt, int kontonummer, double stundenlohn, int arbeitsstunden){
        super(name,grundgehalt,kontonummer);
        this.arbeitsstunden=arbeitsstunden;
        this.stundenlohn=stundenlohn;
    }

    @Override
    public double verdienstBerrechnen() {
        return stundenlohn*arbeitsstunden;
    }
}
