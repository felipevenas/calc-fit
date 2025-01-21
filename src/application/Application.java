package application;

import entities.User;
import services.CalculatorService;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        User user = null;

        try {

            boolean continuar = true;

            while (continuar) {

                System.out.println("=========>>> CalcFit <<<=========");
                System.out.println("[1] Cadastrar dados");
                System.out.println("[0] Encerrar");
                System.out.print("-> ");
                int opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer...

                System.out.println();

                switch (opcao) {
                    case 1: {
                        System.out.print("Nome completo: ");
                        String nomeCompleto = scanner.nextLine();
                        System.out.print("Idade: ");
                        int idade = scanner.nextInt();
                        System.out.print("Altura: ");
                        double altura = scanner.nextDouble();
                        System.out.print("Peso: ");
                        double peso = scanner.nextDouble();

                        user = new User(nomeCompleto, idade, peso, altura);
                        System.out.println("Usuário cadastrado com sucesso!");

                        continuar = false;
                        break;
                    }
                    case 0: {
                        System.out.println("Encerrando...");
                        continuar = false;
                        break;
                    }
                }

                System.out.println();

            }

            continuar = true;

            while (continuar) {
                System.out.println("=========>>> O que vamos fazer? <<<=========");
                System.out.println("[1] Qtd. de Creatina");
                System.out.println("[2] Qtd. de Proteína");
                System.out.println("[3] Qtd. de Água");
                System.out.println("[0] Encerrar");
                System.out.print("-> ");
                int opcao = scanner.nextInt();
                scanner.nextLine();

                System.out.println();

                CalculatorService cs = new CalculatorService();
                double creatine = cs.creatineCalculator(user);
                double protein = cs.proteinCalculator(user);
                double water = cs.waterCalculator(user);

                switch (opcao) {
                    case 1: {
                        System.out.println("Sua quantidade de creatina diária: " + String.format("%.2f", creatine) + "g");
                        
                        System.out.println();
                        break;
                    }
                    case 2: {
                        System.out.println("Sua quantidade de proteína diária: " + String.format("%.2f", protein) + "g");

                        System.out.println();
                        break;
                    }
                    case 3: {
                        System.out.println("Sua quantidade de água diária: " + String.format("%.0f", water) + "L");

                        System.out.println();
                        break;
                    }
                    case 0: {
                        System.out.println("Encerrando...");

                        continuar = false;
                        break;
                    }
                }

            }

        }
        catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }

    }
}