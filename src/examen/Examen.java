package examen;

public class Examen {

    public static void main(String[] args) {
         
        Libro libro1 = new Libro("36 Kilos", "Brozon, Monica B", 2008, false);
        Libro libro2 = new Libro("Donde habitan los Angeles", "Claudia Celis", 1997, false);

        System.out.println("Estado inicial:");
        System.out.println(libro1);
        System.out.println(libro2);

        libro1.prestar();
        libro2.prestar();
        libro1.devolver();

        System.out.println("\nEstado final:");
        System.out.println(libro1);
        System.out.println(libro2);
    }
}

