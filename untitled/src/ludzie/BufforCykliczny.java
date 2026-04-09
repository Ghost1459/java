package ludzie;
import java.util.Arrays;

public class BufforCykliczny {
    private Ulamek[] array = new Ulamek[4];
    private int cnt = 0;


    private void powiększ() {
        int new_size = array.length * 2;
        array = Arrays.copyOf(array, new_size);
    }

    private void zmniejsz() {
        int new_size = array.length / 2;
        if (new_size < 1) new_size = 1;
        array = Arrays.copyOf(array, new_size);
    }

    private void przesuńWLewo(){
        for (int i = 1 ; i < cnt ; ++i){
            array[i - 1] = array[i];
        }
    }

    public void dodaj(Ulamek u){
        if (cnt >= array.length){
            powiększ();
        }
        array[cnt] = u;
        cnt ++;
    }

    public Ulamek pobierz(){
        Ulamek wynik = array[0];
        przesuńWLewo();
        cnt--;
        if(cnt <= array.length / 4){
            zmniejsz();
        }
        return wynik;
    }

    public void wypisz() {
        System.out.println("Ułamki: ");
        for (int i = cnt - 1 ; i >= 0 ; --i){
            System.out.println(array[i].toString());
        }
    }
}
