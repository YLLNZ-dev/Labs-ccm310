/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Data nascimento1 = new Data(10, 5, 1990);
        Data nascimento2 = new Data(22, 7, 1985);
        Data admissao1 = new Data(1, 1, 2020);
        Data admissao2 = new Data(15, 3, 2018);
        Data promocao1 = new Data(10, 10, 2021);
        Data promocao2 = new Data(5, 6, 2022);

        
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Gerente> gerentes = new ArrayList<>();

        
        funcionarios.add(new Funcionario(admissao1, 3500.00, "João Silva", "11122233344", nascimento1));
        funcionarios.add(new Funcionario(admissao2, 4200.00, "Maria Souza", "55566677788", nascimento2));

       
        gerentes.add(new Gerente(10, promocao1, admissao1, 8000.00, "Carlos Lima", "99988877766", nascimento1));
        gerentes.add(new Gerente(20, promocao2, admissao2, 9500.00, "Ana Paula", "44433322211", nascimento2));

        
        System.out.println("=== FUNCIONÁRIOS ===");
        for (Funcionario f : funcionarios) {
            System.out.println(f); 
            System.out.println("Nome: " + f.getNome());
            System.out.println("Salário: R$ " + f.getSalario());
            System.out.println("Data de Admissão: " + f.getAdmissao());
            System.out.println();
        }

        
        System.out.println("=== GERENTES ===");
        for (Gerente g : gerentes) {
            System.out.println(g); 
            System.out.println("Nome: " + g.getNome());
            System.out.println("Departamento: " + g.getDepartamento());
            System.out.println("Data da Promoção: " + g.getPromocaoGerente());
            System.out.println("Salário: R$ " + g.getSalario());
            System.out.println();
        }
    }
}