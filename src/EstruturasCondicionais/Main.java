package EstruturasCondicionais;

public class Main {
    public static void main(String[] args) {
//        double mediaFinal = 7.5;
//        String resultado =  "INDEFINIDO";
//
//        if (mediaFinal >= 7) {
//            resultado = "APROVADA";
//        } else {
//            resultado = "REPROVADA";
//        }
//        System.out.println(resultado);

        double mediaFinal = 6.0;
        String resultado = "INDEFINIDO";

        if (mediaFinal >= 7) {
            resultado = "APROVADA";
        } else if (mediaFinal >= 6.0) {
            resultado = "REALIZAR PROVA BONUS";
        } else {
            resultado = "REPROVADA";
        }

        System.out.println(resultado);
    }
}