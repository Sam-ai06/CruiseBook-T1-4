package com.espol.entidades;

import com.espol.enums.estadoIncidente;

public class Incidente {
  private String descripcion;
  private estadoIncidente estado;

  //asignar a un agente el incidente
  private void asignarAgente(){
    //to do
  }

  //escalar el problema a gerencia
  private void escalarIncidente(){
    //to do
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public estadoIncidente getEstado() {
    return estado;
  }

  public void setEstado(estadoIncidente estado) {
    this.estado = estado;
  }

  

}
