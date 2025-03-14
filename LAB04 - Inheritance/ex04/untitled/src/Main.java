public class Main {
    public static void main(String[] args) {
        System.out.println("instanciando C1");
        C1 obj1 = new C1(10, "AtributoProtegidoC1", 99.9);
        obj1.mostrarAtributos();

        System.out.println("\ninstanciando C2");
        C2 obj2 = new C2(20, "AtributoProtegidoC1", 88.8, true, 'X', 10.5f);
        obj2.mostrarAtributos();

        System.out.println("\ninstanciando C3");
        C3 obj3 = new C3(30, "AtributoProtegidoC1", 77.7, false, 'Y', 5.5f, "AtributoPublicoC3", 55.5, 42);
        obj3.mostrarAtributos();
    }
}
