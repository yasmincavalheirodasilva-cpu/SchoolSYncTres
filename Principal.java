public class Principal {

    public static void main(String[] args) {

        Estudante[] alunos = {
            new Estudante("João", 1, true),
            new Estudante("Yasmin", 2, true),
            new Estudante("GAby", 3, false)
        };

        Boletim[] boletins = {
            new Boletim(8, 9),
            new Boletim(4, 5),
            new Boletim(9, 8)
        };

        Frequencia[] frequencias = {
            new Frequencia(2),
            new Frequencia(1),
            new Frequencia(0)
        };

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno: " + alunos[i].nome);

            if (alunos[i].mensalidadeDia) {
                System.out.println("Média: " + boletins[i].CalcularMedia());
                System.out.println("Faltas: " + frequencias[i].mostraFaltas());
            } else {
                System.out.println("Aviso: Dados retidos por pendência financeira");
            }

            System.out.println();
        }
    }
}