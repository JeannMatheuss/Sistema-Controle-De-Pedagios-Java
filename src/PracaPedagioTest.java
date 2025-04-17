import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PracaPedagioTest {

    @Test
    public void testCalculoCarro() {
        Veiculo carro = new Veiculo("XYZ0001", "Carro", 0);
        PracaPedagio praca = new PracaPedagio("SP-330", 10.0);
        assertEquals(10.0, praca.calcularValorPedagio(carro));
    }

    @Test
    public void testCalculoMoto() {
        Veiculo moto = new Veiculo("XYZ0002", "Moto", 0);
        PracaPedagio praca = new PracaPedagio("SP-330", 10.0);
        assertEquals(5.0, praca.calcularValorPedagio(moto));
    }

    @Test
    public void testCalculoCaminhao() {
        Veiculo caminhao = new Veiculo("XYZ0003", "Caminhao", 5);
        PracaPedagio praca = new PracaPedagio("SP-330", 10.0);
        assertEquals(50.0, praca.calcularValorPedagio(caminhao));
    }
}
