package services;

import entities.User;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExportService {

    String path = "C:\\Users\\felip\\OneDrive\\Desktop\\doc.txt";

    public void export(User user, CalculatorService cs) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write("============================================================");
            bw.newLine();
            bw.write("============================================================");
            bw.newLine();
            bw.write("Usuário: " + user.getNomeCompleto() + " - " + user.getPeso());
            bw.newLine();
            bw.newLine();
            bw.write("Proteína diária: " + cs.proteinCalculator(user) + "g");
            bw.newLine();
            bw.write("Creatina diária: " + cs.creatineCalculator(user) + "g");
            bw.newLine();
            bw.write("Água diária: " + cs.waterCalculator(user) + "L");
            bw.newLine();
            bw.write("============================================================");
            bw.newLine();
            bw.write("============================================================");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
