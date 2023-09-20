package classeabstrata.test;
import classeabstrata.dominio.Desenvolvedor;
import classeabstrata.dominio.Funcionario;
import classeabstrata.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args){
        Gerente gerente = new Gerente("carlos", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Juaan", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}