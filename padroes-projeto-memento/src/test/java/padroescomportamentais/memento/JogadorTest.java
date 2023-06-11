package padroescomportamentais.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void deveArmazenarEstados() {
        Jogador jogador = new Jogador();
        jogador.setEstado(JogadorEstadoContratado.getInstance());
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        assertEquals(2, jogador.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Jogador jogador = new Jogador();
        jogador.setEstado(JogadorEstadoContratado.getInstance());
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        jogador.restauraEstado(0);
        assertEquals(JogadorEstadoContratado.getInstance(), jogador.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Jogador jogador = new Jogador();
        jogador.setEstado(JogadorEstadoContratado.getInstance());
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        jogador.setEstado(JogadorEstadoContratado.getInstance());
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        jogador.restauraEstado(2);
        assertEquals(JogadorEstadoContratado.getInstance(), jogador.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Jogador jogador = new Jogador();
            jogador.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}