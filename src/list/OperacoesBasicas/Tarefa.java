package list.OperacoesBasicas;

public class Tarefa {
    //Atributo
    private String descricao;

    //Construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    //Getter
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
