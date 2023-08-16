package dominio.Servico;

public class MenorValor {
    //Jesus é o caminho da vida
   public static void retornaMenorNumero(double[] numeros) throws Exception {
        if (numeros.length < 2 || numeros == null) {
            throw new Exception("Informações erradas.. Tene novamente!");
        }

        double verificador = numeros[0];

       for (int i = 0; i < numeros.length; i++) {
           if (verificador > numeros[i]) {
               verificador = numeros[i];
           }
       }

       System.out.println("O menor valor é " + verificador);
    }
}
