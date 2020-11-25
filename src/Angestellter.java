public class Angestellter extends Mitarbeiter{
    private int ueberstunden;

    Angestellter(){
        super();
    }
    Angestellter(String name, int grundgehalt, int kontonummer,int ueberstunden){
        super(name,grundgehalt,kontonummer);
        this.ueberstunden=ueberstunden;
    }

    @Override
    public double verdienstBerrechnen() {
        return (1+ueberstunden/160)*super.getGrundgehalt();
    }
}
