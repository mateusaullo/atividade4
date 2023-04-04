import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double nota1,nota2,nota3,nota4,resultado;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Coloque a primeira nota: ");
        nota1 = teclado.nextDouble();
        System.out.print("Coloque a segunda nota: ");
        nota2 = teclado.nextDouble();
        System.out.print("Coloque a terceira nota: ");
        nota3 = teclado.nextDouble();
        System.out.print("Coloque a quarta nota: ");
        nota4 = teclado.nextDouble();

        teclado.close(); 

        resultado = (nota1+nota2+nota3+nota4) /4;

        System.out.printf("\nSua média final foi: %.1f ",resultado);
    }
}
