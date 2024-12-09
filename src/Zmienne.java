public class Zmienne {
    public static void main(String[] args) {

        int liczba;
        liczba = 13;
        double liczba2 = 17.7;

        System.out.println("Moja zmienna: " + liczba + ", " + liczba2);

        int hours = 8;
        int days = 5;
        int weeks = 52;

        //komentarz
        int godzinyPracyWRoku = hours * days * weeks;

        System.out.println("Wynik " + godzinyPracyWRoku);
        //zły przykład!!!
        //System.out.println("Wynik: " +(2 +3));

        String napis = "Dzisiaj \tjest \"ładna\" pogoda";
        napis += ".";

        System.out.println("Mój napis: " + napis);
        System.out.print("Mój napis: " + napis + "\n");
        System.out.print("Mój napis: " + napis);

        char znak = '#';
        boolean sun = false; //true

    }
}
