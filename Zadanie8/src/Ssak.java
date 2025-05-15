public class Ssak extends Zwierze {
    public double waga;
    public Ssak(String nazwa, int wiek,double waga) {

        super(nazwa, wiek);
        this.waga=waga;
    }

    @Override
    public String wydajDzwiek() {
        return "Turuuu";
    }

    @Override
    public String poruszajSie() {
        return "TUPTUPTUPTUPTUPT";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Ssaki zazwyczaj żyją na lądzie";
    }

    public void podajWaga() {
        System.out.println("Waga: " + waga);
    }

}
