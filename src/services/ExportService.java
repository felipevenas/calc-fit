package services;

import entities.User;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Predicate;

public class ExportService {

    String path = "C:\\Users\\felip\\OneDrive\\Desktop\\doc.txt";

    public void export(User user, CalculatorService cs) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(user.getNomeCompleto().toUpperCase() + " - " + String.format("%.1f", user.getPeso()) + " KG");
            bw.newLine();
            bw.write("Dosagens diárias recomendadas:");
            bw.newLine();
            bw.newLine();
            bw.write("Creatina: " + " ["+ String.format("%.2f", cs.creatineCalculator(user)) + "] G");
            bw.newLine();
            bw.write("Proteína: " + " [" + String.format("%.2f", cs.proteinCalculator(user)) + "] G");
            bw.newLine();
            bw.write("Água: " + " [" + String.format("%.2f", cs.waterCalculator(user)) + "] L");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
