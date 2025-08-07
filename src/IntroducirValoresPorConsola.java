import java.util.Scanner;

public class IntroducirValoresPorConsola {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String tituloLibro;
        String autorLibro;

        System.out.print("Digite el Titulo del Libro: ");
        tituloLibro = input.nextLine();

        System.out.print("Digite el Autor del Libro: ");
        autorLibro = input.nextLine();

        System.out.println("Titulo del Libro: " + tituloLibro);
        System.out.println("Autor del Libro: " + autorLibro);

    }
}

