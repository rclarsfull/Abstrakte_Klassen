public class Maneger extends Mitarbeiter{
    private double gewinnbeteiligung;

    Maneger(){
        super();
    }
    Maneger(String name, int grundgehalt, int kontonummer,double gewinnbeteiligung){
        super(name, grundgehalt, kontonummer);
        this.gewinnbeteiligung=gewinnbeteiligung;
        this.kontonummer=kontonummer;
    }

    @Override
    public double verdienstBerrechnen() {
        return (1+gewinnbeteiligung/100)*super.getGrundgehalt();
    }
}
