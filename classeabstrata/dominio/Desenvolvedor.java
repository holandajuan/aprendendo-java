package classeabstrata.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "Nome: '" + nome + '\'' +
                ", Saláriooo: " + salario +
        "}";
    }
}
