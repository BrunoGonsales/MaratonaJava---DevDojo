package br.com.moraessite.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    //Variaveis deve vir sempre depois das enumerações
    public final int VALOR;
    public String nomeRelatorio;
    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelaotiro){
        for (TipoCliente tipoCliente : values()) {
            if(tipoCliente.getnomeRelatorio().equals(nomeRelaotiro)){
                return tipoCliente;
            }
        }
        return null;

    }

    public int getVALOR() {
        return VALOR;
    }

    public String getnomeRelatorio() {
        return nomeRelatorio;
    }
}
