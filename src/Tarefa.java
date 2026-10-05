public class Tarefa {

    private String descricao;
    private boolean status;

    public Tarefa (String descricao) {
        this.descricao = descricao;
        this.status = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isStatus() {
        return status;
    }

    public void marcarComoConcluido () {
        this.status = true;
    }

    @Override
    public String toString() {
        if (status == true) {
            return "[X] " + descricao;
        } else {
            return "[ ] " + descricao;
        }
    }
}
