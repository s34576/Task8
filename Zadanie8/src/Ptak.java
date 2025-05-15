public class Ptak extends Zwierze{
    public double wzrost;
    public Ptak(String nazwa, int wiek, double wzrost) {
        super(nazwa, wiek);
        this.wzrost = wzrost;
    }

    @Override
    public String wydajDzwiek() {
        return "Krakra";
    }

    @Override
    public String poruszajSie() {
        return "Lata";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Ptaki zazwyczaj żyją różnych strefach klimatycznych i warunkach środowiskowych. Ptaki zasiedlają wszystkie typy ekosystemów na Ziemi i zamieszkują wszystkie kontynenty.";
    }

    public void podajWzrost()
    {
        System.out.println("Wzrost: "+wzrost);
    }
}
