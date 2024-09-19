import java.util.List;

public class Main {
    public static void main(String[] args) {
        Assistencia assistencia = new Assistencia();


        assistencia.adicionarTecnico(new Tecnico("João", "Smartphone"));
        assistencia.adicionarTecnico(new Tecnico("Maria", "Notebook"));
        assistencia.adicionarTecnico(new Tecnico("Pedro", "Console"));


        Dispositivo smartphone = new Smartphone(1, "Troca de tela");
        Dispositivo notebook = new Notebook(2, "Formatação");
        Dispositivo console = new Console(3, "Superaquecimento");

        assistencia.adicionarDispositivo(smartphone);
        assistencia.adicionarDispositivo(notebook);
        assistencia.adicionarDispositivo(console);


        smartphone.diagnosticar("Tela quebrada");
        smartphone.gerarOrcamento(300.0);

        notebook.diagnosticar("Sistema lento");
        notebook.gerarOrcamento(150.0);

        console.diagnosticar("Falha na leitura");
        console.gerarOrcamento(200.0);


        smartphone.aprovar();
        notebook.aprovar();
        console.aprovar();


        smartphone.concluirReparo();
        notebook.concluirReparo();
        console.concluirReparo();


        List<String> relatorio = assistencia.gerarRelatorio();
        for (String item : relatorio) {
            System.out.println(item);
        }
    }
}
