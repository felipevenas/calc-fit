package application;

import entities.User;
import services.CalculatorService;
import services.ExportService;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        CalculatorService calculatorService = new CalculatorService();

        try {

            System.out.print("Digite seu nome: ");
            String nomeCompleto = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Peso: ");
            double peso = scanner.nextDouble();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();

            User usuario = new User(nomeCompleto, idade, peso, altura);

            System.out.println();

            System.out.println("Dosagens diárias recomendadas:");
            System.out.println("Creatina: " + "[" +
                    String.format("%.2f", calculatorService.creatineCalculator(usuario)) + "] G");
            System.out.println("Proteína: " + "[" +
                    String.format("%.2f", calculatorService.proteinCalculator(usuario)) + "] G");
            System.out.println("Água: " + "[" +
                    String.format("%.2f", calculatorService.waterCalculator(usuario)) + "] L");

            System.out.println();

            System.out.println("Deseja exportar?");
            System.out.println("[1] Sim | [0] Não");
            System.out.print("- ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                ExportService exportService = new ExportService();
                exportService.export(usuario, calculatorService);
                System.out.println("Arquivo exportado com sucesso!");
            }

            System.out.println();

            System.out.println("Encerrando...");

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}