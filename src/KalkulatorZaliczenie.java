import java.util.InputMismatchException;
import java.util.Scanner;

public class KalkulatorZaliczenie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Podaj pierwszą liczbę: ");
            double liczba1 = scanner.nextDouble();

            System.out.print("Podaj drugą liczbę: ");
            double liczba2 = scanner.nextDouble();

            System.out.println("Wybierz operację:");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.print("Wybór: ");
            int wybor = scanner.nextInt();

            double wynik = 0;

            switch (wybor) {
                case 1:
                    wynik = liczba1 + liczba2;
                    break;
                case 2:
                    wynik = liczba1 - liczba2;
                    break;
                case 3:
                    wynik = liczba1 * liczba2;
                    break;
                case 4:
                    if (liczba2 != 0) {
                        wynik = liczba1 / liczba2;
                    } else {
                        System.out.println("Błąd: Nie można dzielić przez zero!");
                        return;
                    }
                    break;
                default:
                    System.out.println("Błąd: Nieprawidłowy wybór operacji!");
                    return;
            }

            if (wynik == (int) wynik) {
                System.out.println("Wynik: " + (int) wynik);
            } else {
                System.out.println("Wynik: " + wynik);
            }
        } catch (InputMismatchException e) {
            System.out.println("Błąd: Nieprawidłowe dane wejściowe!");
        }
    }
}
