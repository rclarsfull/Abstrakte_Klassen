public class Abrechnung {

    public static void main(String[]args){

        Mitarbeiter mitarbeiterlist[]=new Mitarbeiter[] {
                new Maneger("Manfred",2000,957462848,60),
                new Angestellter("Andi",3000,457453458,300),
                new Arbeiter("Schufti",1500,3235663,15,40)};


        mitarbeiterlist[0].setName("Manni");

        for (Mitarbeiter m:mitarbeiterlist ) {
            m.grundgehalt=2000;
        }


        for (Mitarbeiter m: mitarbeiterlist) {
            System.out.println(m.getName()+": "+m.verdienstBerrechnen());
        }

    }

}
