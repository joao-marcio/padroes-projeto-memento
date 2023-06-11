package padroescomportamentais.memento;


public class JogadorEstadoContratado implements JogadorEstado {

    private JogadorEstadoContratado() {};
    private static JogadorEstadoContratado instance = new JogadorEstadoContratado();
    public static JogadorEstadoContratado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Contratado";
    }

}
