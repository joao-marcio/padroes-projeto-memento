package padroescomportamentais.memento;


public class JogadorEstadoRecuperado implements JogadorEstado {

    private JogadorEstadoRecuperado() {};
    private static JogadorEstadoRecuperado instance = new JogadorEstadoRecuperado();
    public static JogadorEstadoRecuperado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Recuperado";
    }

}
