import java.math.BigDecimal; // *Importovaný BigDecimal*
public class Main {
    public static void ukol1() {
        System.out.println("Hello world!"); //*Doplněný chybějící středník a uvozovky*
    }
    public static void ukol2() {
        String uzivatel = "Karel"; //*Doplněné uvozovky*
        System.out.println(uzivatel);
    }

    public static void ukol3() {
        int pocetLekci = 10;  //*Vyměněný String za int pro celá čísla*
        System.out.println(pocetLekci);
    }

    public static void ukol4() {
        double cena = 10.0;   //*Opravené desetinné číslo, kde místo tečky byla čárka*
        System.out.println(cena);
    }

    public static void ukol5() {
        double cena = 0; // Nastavíme do proměnné hodnotu 0 // Desetkrát přičteme hodnotu jedna desetina (0,1):
        for (int i = 1; i <= 10; i++) { //*Doplněný = do i < 10 a místo i = 0  je i = 1*
            cena += 0.1;
               // operátor "+=" znamená: přičti ke stávající hodnotě navíc 0.1
        }
        System.out.println(cena);
        // Má vypsat "1.0". Ale vypíše "0.9999" !!!
    }

    public static void ukol6() {
        BigDecimal cena = BigDecimal.valueOf(0);  //*Dopsáno BigDecimal.valueOf()*
        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
    }

    public static void ukol7() {
        int vykonMotoru = 120; //*Smazány uvozovky*
        System.out.println("Výkon Motoru je: "+vykonMotoru+" kW.");
    }

    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: " +velikostKosile+ "."); //*Opravený (, velikostKosile ,) na (+velikostKosile+)*
    }

    public static void ukol9() { //*Doplněn static*
        System.out.println("Metoda *skoro* bez chybičky!");
    }
    public static void main(String[] args) {
        System.out.println("Oprav chyby a spusť všechny metody!");
        System.out.println("Komentáře odstraníš klávesovou "
                +"zkratkou <Ctrl>+</> - použij lomítko "
                +"na numerické klávesnici.");
        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();
    }
}