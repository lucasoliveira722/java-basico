package EstruturasCondicionais;

public class ForEmArrays {
    public static void main(String[] args) {
//        String[] alunos = { "MARCOS", "ALINE", "LUCAS", "PATRICIA" };
//        String log;
//
//        int totalAlunos = alunos.length;
//
//        log = "A lista de chamadas possui " + totalAlunos + " alunos\n";
//        System.out.println(log);
//
//        int matricula;
//        for (int posicao = 0; posicao < totalAlunos; posicao++) {
//            matricula = posicao + 1;
//            log = "Matricula: " + matricula + " Aluno: " + alunos[posicao] + "\n";
//            System.out.println(log);
//        }

        String[] nomes = new String[] {"MARCOS", "FERNANDA", "FELIPE", "JULIA"};

        // Sintaxe utilizada para uma composição do tipo forEach
        // a diferença é que, ao invés de criar um iterador i do tipo int, cria-se uma variável do tipo da qual o array é composto
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
