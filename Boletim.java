public class Boletim {
    int nota1;
    int nota2;
       
    public Boletim(int nota1, int nota2) {
   this.nota1 = nota1;
   this.nota2 =nota2;
    }
   
    public double CalcularMedia() {
       return (nota1 + nota2) /2; 
    }
   
   }