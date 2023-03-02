public class Main {

    public static void main(String[] args) {

        Guitar guitar = new Guitar("Gibson", "Les Paul", 1967);

        System.out.println("Brand: " + guitar.getBrand());
        System.out.println("Model of guitar: " + guitar.getModel());
        System.out.println("Product year: " + guitar.getYear());



    }
}
