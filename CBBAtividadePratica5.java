public class CBBAtividadePratica5 {
    public static void main(String[] args) {
        String[] diasSemana = { "segunda", "terça", "quarta", "quinta", "sexta", "sabado", "domingo" };
        int i = 0;
        while (diasSemana.length > i) {

            System.out.println(diasSemana[i]);
            i++;
        }

        int k = 0;

        do {
            System.out.println(diasSemana[k]);
            k++;

        } while (diasSemana.length > k);

        for (int j = 0; j < diasSemana.length; j++) {
            System.out.println(diasSemana[j]);
        }

    }
}
