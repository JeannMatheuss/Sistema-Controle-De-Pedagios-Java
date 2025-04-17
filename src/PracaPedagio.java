public class PracaPedagio implements Calculavel {
    private String localizacao;
    private double tarifaBase;

    public PracaPedagio(String localizacao, double tarifaBase) {
        this.localizacao = localizacao;
        this.tarifaBase = tarifaBase;
    }

    @Override
    public double calcularValorPedagio(Veiculo veiculo) {
        switch (veiculo.getTipo().toLowerCase()) {
            case "carro":
                return tarifaBase;
            case "moto":
                return tarifaBase * 0.5;
            case "caminhao":
                return tarifaBase * veiculo.getEixos();
            default:
                return 0;
        }
    }

    public String getLocalizacao() {
        return localizacao;
    }
}
