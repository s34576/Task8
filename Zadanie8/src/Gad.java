public class Gad extends Zwierze {
    public String kolor;
    public Gad(String nazwa, int wiek, String kolor ) {
        super(nazwa, wiek);
        this.kolor = kolor;
    }

    @Override
    public String wydajDzwiek() {
        return "Kumkum";
    }

    @Override
    public String poruszajSie() {
        return "Skacze";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Gady żyją m.in. w wodzie, pustyniach, lasach";
    }

    public void podajKolor(){
        System.out.println("Kolor: "+kolor);
    }
}
