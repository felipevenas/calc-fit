package services;

import entities.User;

public class ProteinCalculator implements GeneralCalculator {

    private User user;

    @Override
    public double calculo(double valorMocado) {
        valorMocado = 1.5;
        return valorMocado * user.getPeso();
    }
}
