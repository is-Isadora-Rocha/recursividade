package rescursividade;

public class MainCalculadora {
    public static void main(String[] args) {

        int fatorialNR = Calculadora.fatorialNAORecursivo(5);
        System.out.println(fatorialNR);

        int fatorialR = Calculadora.fatorial(5);
        System.out.println(fatorialR);
    }
}
