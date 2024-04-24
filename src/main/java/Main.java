import br.fiap.turmaw.domain.model.Funcionario;
import br.fiap.turmaw.domain.model.FuncionarioIntegral;
import br.fiap.turmaw.domain.model.FuncionarioPorHora;
import br.fiap.turmaw.domain.model.Gerente;

public class Main {
    public static void main(String[] args) {

        //Funcionario funcionario = new Funcionario("Alberto", 28);
        //funcionario.calcularSalario();

        FuncionarioIntegral integral = new FuncionarioIntegral("Marli", 32, 15000);
        integral.calcularSalario();

        FuncionarioPorHora porHora = new FuncionarioPorHora("Heitor", 20, 50f, 176);
        porHora.calcularSalario();

        Gerente gerente = new Gerente("Clara Anna", 28,30000,5000);
        gerente.calcularSalario();




    }
}
