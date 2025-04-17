import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<RegistroPassagem> registros = new ArrayList<>();

        Veiculo carro = new Veiculo("ABC1234", "Carro", 0);
        Veiculo moto = new Veiculo("DEF5678", "Moto", 0);
        Veiculo caminhao = new Veiculo("GHI9012", "Caminhao", 4);

        PracaPedagio praca1 = new PracaPedagio("Rodovia Anhanguera - KM 50", 10.0);

        registros.add(new RegistroPassagem(carro, praca1));
        registros.add(new RegistroPassagem(moto, praca1));
        registros.add(new RegistroPassagem(caminhao, praca1));

        double total = 0;
        System.out.println("🧾 Relatório de Pedágio:");
        for (RegistroPassagem r : registros) {
            System.out.println("Veículo: " + r.getVeiculo().getPlaca() +
                    " | Tipo: " + r.getVeiculo().getTipo() +
                    " | Praça: " + r.getPraca().getLocalizacao() +
                    " | Valor: R$ " + r.getValorCobrado());
            total += r.getValorCobrado();
        }
        System.out.println("💸 Total arrecadado: R$ " + total);
    }
}
