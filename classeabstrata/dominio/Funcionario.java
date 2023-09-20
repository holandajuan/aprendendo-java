package classeabstrata.dominio;

//classe abstratc
// funciona como um template
// não pode ser instanciada
// é super classe
// tem que ser extendida 
public abstract class Funcionario { 
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome= nome;
        this.salario = salario;
    }
}