public class BoletimEstudantil {
    public static void main(String[] args) {

        double mediaFinal = 4;

        String resultado = resultado(mediaFinal);

        System.out.println(resultado);
        
    }
    
    public static String resultado (double mediaFinal) {
        if (mediaFinal < 6)
            return "REPROVADO";
        if (mediaFinal == 6)
            return "PROVA MINERVA";
        else
            return "APROVADO";

    }
}
