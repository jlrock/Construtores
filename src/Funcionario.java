public class Funcionario{
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario){
        if(salario <= 0){
            throw new IllegalArgumentException("O salario NAO pode ser menor ou igual a zero!");
        }
        this.cargo= cargo;
        this.nome= nome;
        this.salario= salario;
    }

    public Funcionario(String nome, String cargo){
        this.nome= nome;
        this.cargo= cargo;
        this.salario = 1509.00;
    }
    public String getNome(){
        return nome;
    }
    public String getCargo(){
        return cargo;
    }
    public double getSalario(){
        return salario;
    }
    public void setCargo(String cargo){
        this.cargo= cargo;
    }
    public void setSalario(double salario){
        if(salario>0){
            this.salario= salario;
        }
    }
    @Override
    public String toString(){
        return "%s | %s | R$ %.2f".formatted(nome, cargo, salario);
    }
}