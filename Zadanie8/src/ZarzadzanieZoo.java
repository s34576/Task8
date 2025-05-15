public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Ssak Slon = new Ssak("Słoń", 2,2.5);
        Ptak Pingwin = new Ptak("Pingwin", 5,2);
        Gad Zaba= new Gad("Zaba", 3, "czerwony");

        System.out.println(Slon.wydajDzwiek());
        System.out.println(Pingwin.wydajDzwiek());
        System.out.println(Zaba.wydajDzwiek());
        System.out.println(" ");
        System.out.println(Slon.poruszajSie());
        System.out.println(Pingwin.poruszajSie());
        System.out.println(Zaba.poruszajSie());
        System.out.println(" ");
        Slon.podajWaga();
        Pingwin.podajWzrost();
        Zaba.podajKolor();
        System.out.println(" ");
        System.out.println(Slon.srodowiskoNaturalne());
        System.out.println(Pingwin.srodowiskoNaturalne());
        System.out.println(Zaba.srodowiskoNaturalne());


        }
    }
