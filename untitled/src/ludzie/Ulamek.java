package ludzie;

public class Ulamek {
    private int licznik;
    private int mianownik;

    public Ulamek(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;

        if (mianownik == 0) {
            throw new IllegalArgumentException("Dzielenie przez zero");
        }

        if (mianownik < 0) {
            licznik = -licznik;
            mianownik = -mianownik;
        }

        int nwd = nwd(Math.abs(licznik), mianownik);
        this.licznik = licznik / nwd;
        this.mianownik = mianownik / nwd;
    }

    private static int nwd(int a, int b) {
        int c;
        while(b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public Ulamek add(Ulamek other) {
        int nowy_licznik = this.licznik * other.mianownik + this.mianownik * other.licznik;
        int nowy_mianownik = this.mianownik * other.mianownik;
        return new Ulamek(nowy_licznik, nowy_mianownik);
    }

    public Ulamek add(int a) {
        int nowyLicznik = this.licznik + (a * this.mianownik);
        return new Ulamek(nowyLicznik, this.mianownik);
    }

    public Ulamek subtract(Ulamek other) {
        int nowy_licznik = this.licznik * other.mianownik - this.mianownik * other.licznik;
        int nowy_mianownik = this.mianownik * other.mianownik;
        return new Ulamek(nowy_licznik, nowy_mianownik);
    }

    public Ulamek multiply(Ulamek other) {
        return new Ulamek(this.licznik * other.licznik, this.mianownik * other.mianownik);
    }

    public Ulamek divide(Ulamek other) {
        if (other.licznik == 0) {
            throw new ArithmeticException("Dzielenie przez zero");
        }
        return new Ulamek(this.licznik * other.mianownik, this.mianownik * other.licznik);
    }

    @Override
    public String toString() {
        if (mianownik == 1) {
            return "" + licznik;
        } else if (licznik == 0) {
            return "0";
        } else {
            return licznik + "/" + mianownik;
        }
    }

    public void wypisz() {
        System.out.println(this.toString());
    }
}