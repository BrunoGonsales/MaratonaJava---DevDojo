package br.com.moraessite.maratonajava.estudando.Kenum.domain;

public enum TipoCliente {
    PESSOA_JURIDICA(1, "Pessoa Jurídica"),
    PESSOA_FISICA(2, "Pessoa Física");

    public final int VALOR;
    public final String NOMERELATORIO;
    TipoCliente(int valor, String nomeRelatorio){
        this.VALOR = valor;
        this.NOMERELATORIO = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorRelatorio(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()) {
            if(tipoCliente.getNOMERELATORIO().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        } return null;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNOMERELATORIO() {
        return NOMERELATORIO;
    }
}
