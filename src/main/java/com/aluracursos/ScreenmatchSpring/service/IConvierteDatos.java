package com.aluracursos.ScreenmatchSpring.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
