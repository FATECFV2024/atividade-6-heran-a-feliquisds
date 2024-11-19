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
        if (salario < 1412.01) {
            return salario * 0.075;
        }
        else if (salario >= 1412.01 || salario < 2666.69) {
            return salario * 0.09;
        }
        else if (salario >= 2666.69 || salario < 4000.04) {
            return salario * 0.12;
        }
        else if (salario >= 4000.04 || salario < 7786.03) {
            return salario * 0.14;
        }
        else {
            return 7786.03 * 0.14;
        }
    }

    public double calcularIRPF() {
        double salario_descontado = salario - calcularINSS();

        if (salario_descontado < 2259.21) {
            return 0;
        }
        else if (salario_descontado >= 2259.21 || salario_descontado < 2826.66) {
            return (salario_descontado * 0.075) - 158.40;
        }
        else if (salario_descontado >= 2826.66 || salario_descontado < 3751.06) {
            return (salario_descontado * 0.15) - 381.44;
        }
        else if (salario_descontado >= 3751.06 || salario_descontado < 4664.69) {
            return (salario_descontado * 0.225) - 662.77;
        }
        else {
            return (salario_descontado * 0.275) - 896.00;
        }
    }
}