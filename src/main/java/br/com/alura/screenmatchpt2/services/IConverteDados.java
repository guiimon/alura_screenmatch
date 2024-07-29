package br.com.alura.screenmatchpt2.services;

public interface IConverteDados {
   <T> T obterDados(String json, Class<T> classe);
}
