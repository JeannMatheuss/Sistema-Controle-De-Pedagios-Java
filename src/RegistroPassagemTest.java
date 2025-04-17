import org.junit.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class RegistroPassagemTest {

    @Test
    public void testTotalArrecadado() {
        PracaPedagio praca = new PracaPedagio("Rodovia dos Bandeirantes - KM 30", 10.0);

        Veiculo carro = new Veiculo("ABC1234", "Carro", 0);
        Veiculo moto = new Veiculo("DEF5678", "Moto", 0);
        Veiculo caminhao = new Veiculo("GHI9012", "Caminhao", 3);

        List<RegistroPassagem> registros = new ArrayList<>();
        registros.add(new RegistroPassagem(carro, praca));
        registros.add(new RegistroPassagem(moto, praca));
        registros.add(new RegistroPassagem(caminhao, praca));

        double totalEsperado = 10.0 + 5.0 + (10.0 * 3);
        double totalCalculado = registros.stream()
                .mapToDouble(RegistroPassagem::getValorCobrado)
                .sum();

        assertEquals(totalEsperado, totalCalculado);
    }
}
