package com.obra.dto;

public class ApiResponse<T> {
    public boolean sucesso;
    public String mensagem;
    public T dados;

    public ApiResponse(boolean sucesso, String mensagem, T dados) {
        this.sucesso = sucesso;
        this.mensagem = mensagem;
        this.dados = dados;
    }
}
