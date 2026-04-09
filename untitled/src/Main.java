import ludzie.*;

public class Main {
    public static void main(String[] args) {
        BufforCykliczny bufor = new BufforCykliczny();

        Osoba[] dane = {
            new Osoba("Jan", "Kowalski"),
            new Student("Anna", "Polak", "345801"),
            new Agent("James", "Bond", "Bond"),
            new Osoba("Marek", "Aureliusz"),
            new Student("Kasia", "Kasia", "329462")
        };

        for (Osoba nowa_osoba : dane) {
            bufor.dodaj(nowa_osoba);
        }
        for (Osoba nowa_osoba : dane) {
            bufor.dodaj(nowa_osoba);
        }
        for (Osoba nowa_osoba : dane) {
            bufor.dodaj(nowa_osoba);
        }
        System.out.println("Pobieranie:");
        for (int i = 0 ; i < 13 ; ++i){
            Osoba pobranyCzłowiek = bufor.pobierz();
            System.out.println(pobranyCzłowiek.przedstaw_sie());
        }
        for (Osoba nowa_osoba : dane) {
            bufor.dodaj(nowa_osoba);
        }

        bufor.wypisz();

        // Ulamki
        Ulamek u1 = new Ulamek(1, 2);
        Ulamek u2 = new Ulamek(2, 3);
        Ulamek u3 = new Ulamek(4, 8);

        System.out.print("4/8: "); u3.wypisz();

        Ulamek iloczyn = u1.multiply(u2);
        System.out.print("u1 * u2 = "); iloczyn.wypisz();

        Ulamek iloraz = u1.divide(u2);
        System.out.print("u1 / u2 = "); iloraz.wypisz();
    }
}