public class BreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero ++){
            if(numero == 3)
                continue;/*break PARA o código, quebra, se o numero for igual a 3 o programa para e encerra*/
            System.out.println(numero);
        }
    }
}
