public class Main {
    public static void main(String[] s) {
        Jook jook = new Jook();
        jook.nimi = "vesi";
        jook.liitriHind = 0.99;
        jook.eriKaal = 0.5;

        JoogiPudel pudel = new JoogiPudel();
        pudel.maht = 0.5;
        pudel.tyyp = "plast";
        pudel.taara = 0.1;
        pudel.onTyhi = false;

        jook.omaHind = jook.liitriHind * pudel.maht;

        System.out.println("Jook on " + jook.nimi + ". Mille liitri hind on " + jook.liitriHind + "eurot ning kaalub " + jook.eriKaal + "kg");
        System.out.println("Pudeli maht on " + pudel.maht + "l, " + pudel.tyyp + " pudel. Taara hind on " + pudel.taara + " eurot");
        System.out.println("Pudeli hind on " + jook.omaHind);

        if (pudel.onTyhi == false){
            System.out.println("Pudelis on " + jook.nimi);
            // jook.eriKaal / 9.81 = pudel.mass
        } else {
            System.out.println("pudel on tyhi");
        }
    }
}

class Jook{
    public double eriKaal;
    public double liitriHind;
    public String nimi;
    public double omaHind;
}

class JoogiPudel{
    public double maht;
    public String tyyp;
    public double mass;
    public double taara;
    public boolean onTyhi;
}

class Joogivaat{
    public double ruumala;
    public double kogusLiitrites;
}

class PudeliteKast{
    public String tyyp;
    public double hind;
    public double mass;
    public int kohtadeArv;
}