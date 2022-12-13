public class MinhaClasse {
   public static void main(String[] args) {

    String primeiroNome = "Daniele";
    String segundoNome = "Pereira";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
   }
   
   public static String nomeCompleto (String primeiroNome, String segundoNome){
    return "Meu nome é " + primeiroNome.concat(" ").concat(segundoNome);
   }
    
}
