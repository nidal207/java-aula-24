public class App {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;

        int soma = A+B;
        System.out.println("A soma é: " + soma);

        int sub = B-A;
        System.out.println("A subtração é: " + sub);

        int mult = A*B*200;
        System.out.println("A multiplicação é: " + mult);

        int div = B/A;
        System.out.println("A divisão é: " + div);

        int exp1 = (B*A)+80-(45/B);
        System.out.println("A expresão é: " + exp1);

        int exp2 = (B*B*A*6)-80/A*10;
        System.out.println("A expresão é: " + exp2);

        System.out.println(A > B);
        System.out.println(A >= B);
        System.out.println(A < B);
        System.out.println(A <= B);
        System.out.println(A == B);
        System.out.println(A != B);
        boolean exp3 = (A*B)>(B/A);
        System.out.println("A expressão é: " + exp3);

        boolean exp4 = (A+B*A)<=(A-B*4+B);
        System.out.println("A expressão é: " + exp4);
    }
}
