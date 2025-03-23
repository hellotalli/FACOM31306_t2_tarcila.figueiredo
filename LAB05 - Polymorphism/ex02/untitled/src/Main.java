public class Main {
    public static void main(String[] args) {

        Forma[] formas = new Forma[6];


        formas[0] = new Circulo(5);
        formas[1] = new Quadrado(4);
        formas[2] = new Triangulo(3, 6);
        formas[3] = new Esfera(3);
        formas[4] = new Cubo(2);
        formas[5] = new Tetraedro(4);


        for (Forma forma : formas) {
            System.out.println(forma.descricao());

            if (forma instanceof FormaBidimensional) {
                System.out.println("Área: " + ((FormaBidimensional) forma).obterArea());
            } else if (forma instanceof FormaTridimensional) {
                System.out.println("Área: " + ((FormaTridimensional) forma).obterArea());
                System.out.println("Volume: " + ((FormaTridimensional) forma).obterVolume());
            }
            System.out.println("------------------------");
        }
    }
}
