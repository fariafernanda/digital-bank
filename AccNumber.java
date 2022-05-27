import java.util.Random;

public class AccNumber {

    public static long geraNumero() {
        Random geraNumero = new Random();
        int accNumber = 1000 + geraNumero.nextInt(9000);

        return accNumber;
    
    }

    
}
