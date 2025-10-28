package Controller;

import model.OperacaoMatematica;


public class Controller {

    private Double valor1;
    private OperacaoMatematica operacaoAtual;

    public Controller() {
        
        zerar();
    }

    
    public void setOperacao(OperacaoMatematica operacao, String valor) {
        this.operacaoAtual = operacao;
        this.valor1 = Double.valueOf(valor.replace(",", "."));
    }

    
    public Double calcular(String valor) {
        if (valor1 == null || operacaoAtual == null) {
            return Double.valueOf(valor.replace(",", "."));
        }
        
        Double valor2 = Double.valueOf(valor.replace(",", "."));
        Double resultado = 0.0;

        switch (operacaoAtual) {
            case SOMAR -> resultado = valor1 + valor2;
            case SUBTRAIR -> resultado = valor1 - valor2;
            case MULTIPLICAR -> resultado = valor1 * valor2;
            case DIVIDIR -> {
                if (valor2 == 0) {
                    return null; 
                }
                resultado = valor1 / valor2;
            }
        }
        
        
        valor1 = resultado;
        operacaoAtual = null;

        return resultado;
    }
    
    
    public final void zerar() {
        valor1 = null;
        operacaoAtual = null;
    }
}