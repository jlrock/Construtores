public class FuncionarioRules {
    private final Funcionario funcionario;

    public FuncionarioRules(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void validarSalario() {
        if (funcionario.getSalario() <= 0) {
            throw new IllegalArgumentException("O salario NAO pode ser menor ou igual a zero!");
        }
    }
}
