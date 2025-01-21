package services;

import entities.User;

public class CalculatorService {

     public double proteinCalculator(User user) {
        return 2 * user.getPeso();
    }

    public double creatineCalculator(User user) {
        return 0.04 * user.getPeso();
    }

    public double waterCalculator(User user) {
        return 35.0 * user.getPeso() / 1000;
    }

}

