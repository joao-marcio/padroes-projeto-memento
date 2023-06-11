package padroescomportamentais.memento;


public class JogadorEstadoLesionado implements JogadorEstado {

    private JogadorEstadoLesionado() {};
    private static JogadorEstadoLesionado instance = new JogadorEstadoLesionado();
    public static JogadorEstadoLesionado getInstance() {
        return instance;
    }
    
    public String getNomeEstado() {
        return "Lesionado";
    }

}
