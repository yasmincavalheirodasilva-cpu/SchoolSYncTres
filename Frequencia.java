public class Frequencia {
    int faltas;

    public Frequencia(int faltas) {
        this.faltas = faltas;
    }

    public int mostraFaltas() {
        return faltas;
    }

    public static void main(String[] args) {

        Frequencia aluno = new Frequencia(5);

        System.out.println("Número de faltas: " + aluno.mostraFaltas());

    }
}