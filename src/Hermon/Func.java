package Hermon;

// nome, departamento, categoria, status e salário

public class Func {

    private String nome;
    private String departamento;
    private String categoria;
    private String status;
    private double salario;

    public Func(String nome, String departamento, String categoria, String status, double salario){

        this.nome = nome;
        this.departamento = departamento;
        this.categoria = categoria;
        this.status = status;
        this.salario = salario;

    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void aumentarSalario(double salario){
        if(salario < 3000 && status.equals("Activo")){
            this.salario = salario + salario*0.1;

        }
    }

    public void imprimirDados(){
        System.out.println("Nome : " + nome);
        System.out.println("Departamento " + departamento);
        System.out.println("Categoria " + categoria);
        System.out.println("Status " + status);
        System.out.println("Salário " + salario);
    }

    public void demitirFuncionario(){
        status = "Inactivo";
    }

    public void readmitirFuncionario(){
        status = "Activo";
    }




}
