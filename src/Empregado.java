public class Empregado {
    protected String nome;
    protected String endereco;
    protected double salario;
    
    
    
    public Empregado(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }



    public double calcularINSS() {
        return 0.11 * salario;
    }

    public double calcularIRPF() {
        if (salario < 1800) {
            return 0.1 * salario;
        }
        else {
            return 0.27 * salario;
        }
    }
}