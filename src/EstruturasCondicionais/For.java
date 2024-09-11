package EstruturasCondicionais;

public class For {
    public static void main(String[] args) {
        int numero;
        String log;

        for (numero = 1; numero <= 10; numero+= 1) {
            log = "O Npumero atual é: " + numero + "\n";
            System.out.println(log);
        }
    }
}
