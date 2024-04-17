import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int parametroUm = input.nextInt();
        int parametroDois = input.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch(ParametrosInvalidosException exception) {
            System.out.println("O segundo parametro deve ser maior que o primeiro.");
        }
        input.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++){
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }

}
