import java.util.Scanner;

public class CBBAtividadePratica6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrayInteiros = new int[10];
        int maior = 0;
        for (int i = 0; i < arrayInteiros.length; i++) {
            System.out.println("Informe um numero inteiro");
            int num = input.nextInt();
            arrayInteiros[i] = num;
        }

        System.out.println("Os numeros informados foram:");
        for (int i = 0; i < arrayInteiros.length; i++) {
            System.out.println(arrayInteiros[i]);

        }

        for (int i = 0; i < arrayInteiros.length; i++) {
            if (arrayInteiros[i] > maior) {
                maior = arrayInteiros[i];
            }

        }
        System.out.println("E o maior numero é:" + maior);

        input.close();
    }
}
