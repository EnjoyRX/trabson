package com.lucas.trabalho.Enums;

public enum Status {
    ABERTO(0, "Aberto"),
    ANDAMENTO(0, "Andamento"),
    ENCERRADO(0, "Encerrado");

    private Integer codigo;
    private String descricao;

    Status(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static Status toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }
        for (Status status : Status.values()) {
            if (cod.equals(status.getCodigo())) {
                return status;
            }
        }
        throw new IllegalArgumentException("Status inválido");
    }

    public Integer getCodigo() {
        return this.codigo;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
}
