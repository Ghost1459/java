package ludzie;

public class Student extends Osoba {
    private String nr_indeksu;

    public Student(String imie, String nazwisko, String nr_indeksu) {
        super(imie, nazwisko);
        this.nr_indeksu = nr_indeksu;
    }
    public String nr_indeksu() { return nr_indeksu; }
    public String przedstaw_sie() { return super.przedstaw_sie() + " " + nr_indeksu; }
}