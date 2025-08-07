import java.util.Scanner;

public class ConversionDeTIpos {
    public static void main(String[] args) {

        var input = new Scanner(System.in);

        System.out.println("Digite el primer numero: ");
        Integer numeroUno = Integer.parseInt(input.nextLine());

        System.out.println("Digite el segundo numero: ");
        Float numeroDos = Float.parseFloat(input.nextLine());

        var resultado = numeroUno + numeroDos;

        System.out.println("Su suma es: " + resultado);
    }
}
