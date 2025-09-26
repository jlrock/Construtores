import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();

        Funcionario funcionario = new Funcionario("João Silva", "Desenvolvedor", salario);
        FuncionarioRules rules = new FuncionarioRules(funcionario);

        // Validar o salário
        try {
            rules.validarSalario();
            System.out.println("Salário válido: " + funcionario);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
