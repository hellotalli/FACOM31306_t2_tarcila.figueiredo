public class C3 extends C2 {
    public String atributoPublicoC3;
    protected double atributoProtegidoC3;
    private int atributoPrivadoC3;

    public C3() {
        System.out.println("C3 chamada do construtor padrao sem parametros");
    }

    public C3(int atributoPublico, String atributoProtegido, double atributoPrivado, boolean atributoPublicoC2, char atributoProtegidoC2, float atributoPrivadoC2,
              String atributoPublicoC3, double atributoProtegidoC3, int atributoPrivadoC3) {
        super(atributoPublico, atributoProtegido, atributoPrivado, atributoPublicoC2, atributoProtegidoC2, atributoPrivadoC2);
        System.out.println("C3 chamada do construtor com parametros");
        this.atributoPublicoC3 = atributoPublicoC3;
        this.atributoProtegidoC3 = atributoProtegidoC3;
        this.atributoPrivadoC3 = atributoPrivadoC3;
    }

    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("C3 - publico: " + atributoPublicoC3);
        System.out.println("C3 - protegido: " + atributoProtegidoC3);
        System.out.println("C3 - privado: " + atributoPrivadoC3);
    }

    public void mostrarAtributosSuper() {
        mostrarAtributos();
    }
}
