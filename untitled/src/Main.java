import ludzie.*;

public class Main {
    public static void main(String[] args) {
        BufforCykliczny bufor = new BufforCykliczny();

        // Ulamki
        Ulamek u1 = new Ulamek(1, 2);
        Ulamek u2 = new Ulamek(2, 3);
        Ulamek u3 = new Ulamek(4, 8);

        System.out.print("4/8: "); u3.wypisz();

        Ulamek iloczyn = u1.multiply(u2);
        System.out.print("u1 * u2 = "); iloczyn.wypisz();

        Ulamek iloraz = u1.divide(u2);
        System.out.print("u1 / u2 = "); iloraz.wypisz();


        for (int i = 0; i < 60; i++) {
            int licznik = i * i + 7;
            int mianownik = i * 3 + 11;
            bufor.dodaj(new Ulamek(licznik, mianownik));
        }

        bufor.wypisz();

        for (int i = 0; i < 50; i++) {
            bufor.pobierz();
        }

        bufor.dodaj(new Ulamek(999, 1));
        bufor.dodaj(new Ulamek(1000, 7));

        bufor.wypisz();
    }
}