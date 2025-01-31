package entities;

public class User {

    private String nomeCompleto;
    private Integer idade;
    private Double peso;
    private Double altura;

    public User() {
    }

    public User(String nomeCompleto, Integer idade, Double peso, Double altura) {
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String toString() {
        return "DADOS DO USUÁRIO: " +
                nomeCompleto.toUpperCase() + " - " +
                    idade + " - " +
                        String.format("%.2f", peso) + "KG - " +
                            String.format("%.2f", altura) + "M.";
    }

}
