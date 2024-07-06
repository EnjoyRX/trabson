package com.lucas.trabalho.Enums;

public enum Prioridade {
    BAIXA(0,"Baixa"),
    MEDIA(0,"Média"),
    ALTA(0,"Alta");

    private Integer codigo;
    private String descricao;

    Prioridade(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static Prioridade toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }
        for (Prioridade prioridade : Prioridade.values()) {
            if (cod.equals(prioridade.getCodigo())) {
                return prioridade;
            }
        }
        throw new IllegalArgumentException("Prioridade inválida");
    }

    public Integer getCodigo() {
        return this.codigo;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
}
