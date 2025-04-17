public class RegistroPassagem {
    private Veiculo veiculo;
    private PracaPedagio praca;
    private double valorCobrado;

    public RegistroPassagem(Veiculo veiculo, PracaPedagio praca) {
        this.veiculo = veiculo;
        this.praca = praca;
        this.valorCobrado = praca.calcularValorPedagio(veiculo);
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public PracaPedagio getPraca() {
        return praca;
    }

    public double getValorCobrado() {
        return valorCobrado;
    }
}
