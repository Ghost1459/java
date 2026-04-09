package ludzie;

public class Agent extends Osoba {
    private String drugie_nazwisko;

    public Agent(String imie, String nazwisko, String drugie_nazwisko) {
        super(imie, nazwisko);
        this.drugie_nazwisko = drugie_nazwisko;
    }
    public String drugie_nazwisko() { return drugie_nazwisko; }
    public String przedstaw_sie() { return drugie_nazwisko() + ", " + super.przedstaw_sie(); }
}