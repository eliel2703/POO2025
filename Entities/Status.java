package Entities;

public enum Status {
    ONLINE("Disponivel"),
    SUSPENSO("Indisponivel"),
    OFFLINE("Desconectado");

    private final String mensagem;

    Status(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
