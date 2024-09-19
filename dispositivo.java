import java.util.Date;

abstract class Dispositivo {
    protected int id;
    protected String problema;
    protected String diagnostico;
    protected Double orcamento;
    protected boolean aprovado;
    protected Date dataInicio;
    protected Date dataConclusao;
    protected String status;

    public Dispositivo(int id, String problema) {
        this.id = id;
        this.problema = problema;
        this.status = "Aguardando Diagnóstico";
    }

    public void diagnosticar(String diagnostico) {
        this.diagnostico = diagnostico;
        this.status = "Aguardando Orçamento";
    }

    public void gerarOrcamento(double custo) {
        this.orcamento = custo;
        this.status = "Aguardando Aprovação";
    }

    public void concluirReparo() {
        this.status = "Reparo Concluído";
    }

    public abstract void aprovar();

    @Override
    public String toString() {
        return "ID: " + id + ", Problema: " + problema + ", Status: " + status +
                ", Data de Conclusão: " + (dataConclusao != null ? dataConclusao.toString() : "Não definido");
    }
}

class Smartphone extends Dispositivo {
    public Smartphone(int id, String problema) {
        super(id, problema);
    }

    @Override
    public void aprovar() {
        this.aprovado = true;
        this.dataInicio = new Date();
        this.dataConclusao = new Date(dataInicio.getTime() + (3 * 24 * 60 * 60 * 1000)); // 3 dias
        this.status = "Reparo em Andamento";
    }
}

class Notebook extends Dispositivo {
    public Notebook(int id, String problema) {
        super(id, problema);
    }

    @Override
    public void aprovar() {
        this.aprovado = true;
        this.dataInicio = new Date();
        this.dataConclusao = new Date(dataInicio.getTime() + (7 * 24 * 60 * 60 * 1000)); // 7 dias
        this.status = "Reparo em Andamento";
    }
}

class Console extends Dispositivo {
    public Console(int id, String problema) {
        super(id, problema);
    }

    @Override
    public void aprovar() {
        this.aprovado = true;
        this.dataInicio = new Date();
        this.dataConclusao = new Date(dataInicio.getTime() + (10 * 24 * 60 * 60 * 1000)); // 10 dias
        this.status = "Reparo em Andamento";
    }
}
