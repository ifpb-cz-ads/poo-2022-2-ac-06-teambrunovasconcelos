import java.util.Scanner;;

public class CTQuestao3 {
    public static void main(String[] args) {
        int[] notasAlunos = new int[10];
        int soma = 0;
        int acimaMedia = 0;
        int abaixoMedia = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.println("Informe a nota do " + (i + 1) + "º aluno:");
            int nota = input.nextInt();
            notasAlunos[i] = nota;

        }

        for (int i = 0; i < notasAlunos.length; i++) {
            soma += notasAlunos[i];
        }

        int media = soma / notasAlunos.length;
        System.out.println("A média da turma é: " + media);

        for (int i = 0; i < notasAlunos.length; i++) {
            if (notasAlunos[i] >= media) {
                acimaMedia++;
            } else {
                abaixoMedia++;
            }

        }
        System.out.println(
                "A turma teve " + acimaMedia + " notas acima da média e " + abaixoMedia + " notas abaixo da média");
        input.close();

    }

}
