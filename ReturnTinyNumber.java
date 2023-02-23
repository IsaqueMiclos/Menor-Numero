package dominio;

public class ReturnTinyNumber {

    private double[] numbers;
    private double tinyNumber = 0;

    public ReturnTinyNumber(double[] numbers) {
        this.numbers = numbers;
        verificador(this.numbers);
    }

    private void verificador(double[] numbers) {
        if (numbers.length < 2 || numbers == null) {
            System.out.println("[ERRO] The list of numbers, just has one number or don't has numbers!!!");
            return;
        }

        double counter = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (counter > numbers[i]) {
                counter = numbers[i];
            }
        }
        this.tinyNumber = counter;

        System.out.println("The tiny number is: " + this.tinyNumber + "!");
    }
}
