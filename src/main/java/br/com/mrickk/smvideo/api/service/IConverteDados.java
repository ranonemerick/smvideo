package br.com.mrickk.smvideo.api.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
