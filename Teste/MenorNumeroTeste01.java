package dominio.Teste;

import dominio.Servico.MenorValor;

public class MenorNumeroTeste01 {
    //Jesus é o caminho da vida
    public static void main(String[] args) {
        double[] nums = {1,1.1,1.2,0.7,3,4.4,0.3};

        try {
            MenorValor.retornaMenorNumero(nums);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
