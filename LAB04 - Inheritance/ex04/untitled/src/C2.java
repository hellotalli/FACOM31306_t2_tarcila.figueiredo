public class C2 extends C1 {
    public boolean atributoPublicoC2;
    protected char atributoProtegidoC2;
    private float atributoPrivadoC2;

    public C2() {
        System.out.println("C2 chamada do construtor padrao sem parametros");
    }

    public C2(int atributoPublico, String atributoProtegido, double atributoPrivado, boolean atributoPublicoC2, char atributoProtegidoC2, float atributoPrivadoC2) {
        super(atributoPublico, atributoProtegido, atributoPrivado);
        System.out.println("C2 chamada do construtor com parametros");
        this.atributoPublicoC2 = atributoPublicoC2;
        this.atributoProtegidoC2 = atributoProtegidoC2;
        this.atributoPrivadoC2 = atributoPrivadoC2;
    }

    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("C2 - publico: " + atributoPublicoC2);
        System.out.println("C2 - protegido: " + atributoProtegidoC2);
        System.out.println("C2 - privado: " + atributoPrivadoC2);
    }

    public void mostrarAtributosSuper() {
        mostrarAtributos();
    }
}
