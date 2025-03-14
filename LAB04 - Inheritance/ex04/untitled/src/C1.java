public class C1 {
    public int atributoPublico;
    protected String atributoProtegido;
    private double atributoPrivado;

    public C1() {
        System.out.println("C1 chamada do construtor padrao sem parametros");
    }

    public C1(int atributoPublico, String atributoProtegido, double atributoPrivado) {
        System.out.println("C1 chamada do construtor com parametros");
        this.atributoPublico = atributoPublico;
        this.atributoProtegido = atributoProtegido;
        this.atributoPrivado = atributoPrivado;
    }

    public void mostrarAtributos() {
        System.out.println("C1 - publico: " + atributoPublico);
        System.out.println("C1 - protegido: " + atributoProtegido);
        System.out.println("C1 - privado: " + atributoPrivado);
    }

    public void mostrarAtributosSuper() {
        mostrarAtributos();
    }
}
