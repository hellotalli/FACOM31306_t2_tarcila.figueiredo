public class gerenciarCandidatos2 {
    public static void main(String[] args) {
        candidatos c1 = new candidatos();
        c1.setNomeCompleto ("ALBENEI CARVALHO FARELO");
        c1.setDataDeNascimento("10/12/1987");
        c1.setGenero('M');
        c1.setBens("286000");
        c1.setReleeicao('S');
        c1.setNumeroPartido(15);
        c1.setCargoPretendido("vereador");
        c1.cadastrar(null, null, null, null, null, null, null);

        candidatos c2 = new candidatos();
        c2.setNomeCompleto("PAULINHO URACH");
        c2.setDataDeNascimento("25/07/1978");
        c2.setGenero('M');
        c2.setBens("38000");
        c2.setReleeicao('N');
        c2.setNumeroPartido(44);
        c2.setCargoPretendido("Vereador");
        c2.cadastrar(null, null, null, null, null, null, null);

        candidatos c3 = new candidatos();
        c3.setNomeCompleto("CHICO DO PT");
        c3.setDataDeNascimento("22/01/1993");
        c3.setGenero('M');
        c3.setBens("0");
        c3.setReleeicao('N');
        c3.setNumeroPartido(13);
        c3.setCargoPretendido("Vereador");
        c3.cadastrar(null, null, null, null, null, null, null);



    }
}