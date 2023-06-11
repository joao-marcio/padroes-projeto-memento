package padroescomportamentais.memento;


public class JogadorEstadoSondado implements JogadorEstado {

    private JogadorEstadoSondado() {};
    private static JogadorEstadoSondado instance = new JogadorEstadoSondado();
    public static JogadorEstadoSondado getInstance() {
        return instance;
    }
    
    public String getNomeEstado() {
        return "Sondado";
    }
    
}

