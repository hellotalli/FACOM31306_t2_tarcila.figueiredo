//eu não entendi se o exercício pedia que o usuario informasse os valores dos atributos ou se eu deveria colocar alguns
public class Main {
    public static void main(String[] args) {
        Ingresso ingressoNormal = new Normal(50.0);
        ingressoNormal.escreveValor();

        VIP ingressoVIP = new VIP(50.0, 30.0);
        System.out.println("preço vip: R$" + ingressoVIP.getValorVIP());

        CamaroteInferior camaroteInferior = new CamaroteInferior(50.0, 30.0, "setor tal");
        camaroteInferior.imprimeLocalizacao();
        System.out.println("preço camarote inferior: R$" + camaroteInferior.getValorVIP());

        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(50.0, 30.0, 20.0);
        System.out.println("preço camarote superior: R$" + camaroteSuperior.getValorCamaroteSuperior());
    }
}
