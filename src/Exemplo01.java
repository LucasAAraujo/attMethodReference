interface Figura2D {
    void desenha(double largua, Double altura);
}

class Retangulo {
    public void desenhaRetangulo(Double largura, Double altura){
        System.out.println("Desenha retângulo de Largura: " + largura + " e Altura: " + altura);
    }
}

public class Exemplo01 {

    public static void main(String[] args) {
        //Lambda expression
        Figura2D fig1 = (l, a) -> System.out.println("Desenha retângulo de Largura: " + l + " e Altura: " + a);
        fig1.desenha(8.0,1.5);

        Retangulo ret = new Retangulo();
        //Method reference
        Figura2D fig2 = ret::desenhaRetangulo;

        fig2.desenha(10.5, 7.0);
    }
}
