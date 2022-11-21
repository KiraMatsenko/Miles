public class Main {

    public static void main(String[] args) {
        int amount = 400; // стоимость билета
        int rublesPerMile = 20; // количество рублей, за которое начисляется 1 миля

        int miles = amount / rublesPerMile; // количество миль, начисленное за покупку билета

        System.out.println(miles);
    }
}
