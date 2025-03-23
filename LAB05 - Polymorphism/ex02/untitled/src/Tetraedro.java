class Tetraedro extends FormaTridimensional {
    private double aresta;

    public Tetraedro(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public double obterArea() {
        return Math.sqrt(3) * aresta * aresta;
    }

    @Override
    public double obterVolume() {
        return (Math.pow(aresta, 3)) / (6 * Math.sqrt(2));
    }

    @Override
    public String descricao() {
        return "Tetraedro de aresta " + aresta;
    }
}