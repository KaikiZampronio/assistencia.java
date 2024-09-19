import java.util.ArrayList;
import java.util.List;

class Assistencia {
    private List<Dispositivo> dispositivos;
    private List<Tecnico> tecnicos;

    public Assistencia() {
        this.dispositivos = new ArrayList<>();
        this.tecnicos = new ArrayList<>();
    }

    public void adicionarDispositivo(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void adicionarTecnico(Tecnico tecnico) {
        tecnicos.add(tecnico);
    }

    public List<String> gerarRelatorio() {
        List<String> relatorio = new ArrayList<>();
        for (Dispositivo dispositivo : dispositivos) {
            relatorio.add(dispositivo.toString());
        }
        return relatorio;
    }
}
