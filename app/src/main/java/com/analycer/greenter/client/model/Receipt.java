/**
 * Grenter App
 * Aplicacion para mypes empleando sus comprobantes electrónicos
 *
 * OpenAPI spec version: 1.0.0
 * Contact: giansalex@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.analycer.greenter.client.model;

import java.util.Date;
import com.google.gson.annotations.SerializedName;

public class Receipt {
  
  @SerializedName("person")
  private Company person = null;
  @SerializedName("receptor")
  private Client receptor = null;
  @SerializedName("serie")
  private String serie = null;
  @SerializedName("correlativo")
  private String correlativo = null;
  @SerializedName("fechaEmision")
  private Date fechaEmision = null;
  @SerializedName("concepto")
  private String concepto = null;
  @SerializedName("montoLetras")
  private String montoLetras = null;
  @SerializedName("subTotal")
  private Float subTotal = null;
  @SerializedName("retencion")
  private Float retencion = null;
  @SerializedName("porcentaje")
  private Float porcentaje = null;
  @SerializedName("total")
  private Float total = null;
  @SerializedName("name")
  private String name = null;

  /**
   **/
  
  public Company getPerson() {
    return person;
  }
  public void setPerson(Company person) {
    this.person = person;
  }

  /**
   **/
  
  public Client getReceptor() {
    return receptor;
  }
  public void setReceptor(Client receptor) {
    this.receptor = receptor;
  }

  /**
   **/
  
  public String getSerie() {
    return serie;
  }
  public void setSerie(String serie) {
    this.serie = serie;
  }

  /**
   **/
  
  public String getCorrelativo() {
    return correlativo;
  }
  public void setCorrelativo(String correlativo) {
    this.correlativo = correlativo;
  }

  /**
   **/
  
  public Date getFechaEmision() {
    return fechaEmision;
  }
  public void setFechaEmision(Date fechaEmision) {
    this.fechaEmision = fechaEmision;
  }

  /**
   **/
  
  public String getConcepto() {
    return concepto;
  }
  public void setConcepto(String concepto) {
    this.concepto = concepto;
  }

  /**
   **/
  
  public String getMontoLetras() {
    return montoLetras;
  }
  public void setMontoLetras(String montoLetras) {
    this.montoLetras = montoLetras;
  }

  /**
   **/
  
  public Float getSubTotal() {
    return subTotal;
  }
  public void setSubTotal(Float subTotal) {
    this.subTotal = subTotal;
  }

  /**
   **/
  
  public Float getRetencion() {
    return retencion;
  }
  public void setRetencion(Float retencion) {
    this.retencion = retencion;
  }

  /**
   **/
  
  public Float getPorcentaje() {
    return porcentaje;
  }
  public void setPorcentaje(Float porcentaje) {
    this.porcentaje = porcentaje;
  }

  /**
   **/
  
  public Float getTotal() {
    return total;
  }
  public void setTotal(Float total) {
    this.total = total;
  }

  /**
   **/
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Receipt receipt = (Receipt) o;
    return (this.person == null ? receipt.person == null : this.person.equals(receipt.person)) &&
        (this.receptor == null ? receipt.receptor == null : this.receptor.equals(receipt.receptor)) &&
        (this.serie == null ? receipt.serie == null : this.serie.equals(receipt.serie)) &&
        (this.correlativo == null ? receipt.correlativo == null : this.correlativo.equals(receipt.correlativo)) &&
        (this.fechaEmision == null ? receipt.fechaEmision == null : this.fechaEmision.equals(receipt.fechaEmision)) &&
        (this.concepto == null ? receipt.concepto == null : this.concepto.equals(receipt.concepto)) &&
        (this.montoLetras == null ? receipt.montoLetras == null : this.montoLetras.equals(receipt.montoLetras)) &&
        (this.subTotal == null ? receipt.subTotal == null : this.subTotal.equals(receipt.subTotal)) &&
        (this.retencion == null ? receipt.retencion == null : this.retencion.equals(receipt.retencion)) &&
        (this.porcentaje == null ? receipt.porcentaje == null : this.porcentaje.equals(receipt.porcentaje)) &&
        (this.total == null ? receipt.total == null : this.total.equals(receipt.total)) &&
        (this.name == null ? receipt.name == null : this.name.equals(receipt.name));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.person == null ? 0: this.person.hashCode());
    result = 31 * result + (this.receptor == null ? 0: this.receptor.hashCode());
    result = 31 * result + (this.serie == null ? 0: this.serie.hashCode());
    result = 31 * result + (this.correlativo == null ? 0: this.correlativo.hashCode());
    result = 31 * result + (this.fechaEmision == null ? 0: this.fechaEmision.hashCode());
    result = 31 * result + (this.concepto == null ? 0: this.concepto.hashCode());
    result = 31 * result + (this.montoLetras == null ? 0: this.montoLetras.hashCode());
    result = 31 * result + (this.subTotal == null ? 0: this.subTotal.hashCode());
    result = 31 * result + (this.retencion == null ? 0: this.retencion.hashCode());
    result = 31 * result + (this.porcentaje == null ? 0: this.porcentaje.hashCode());
    result = 31 * result + (this.total == null ? 0: this.total.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Receipt {\n");
    
    sb.append("  person: ").append(person).append("\n");
    sb.append("  receptor: ").append(receptor).append("\n");
    sb.append("  serie: ").append(serie).append("\n");
    sb.append("  correlativo: ").append(correlativo).append("\n");
    sb.append("  fechaEmision: ").append(fechaEmision).append("\n");
    sb.append("  concepto: ").append(concepto).append("\n");
    sb.append("  montoLetras: ").append(montoLetras).append("\n");
    sb.append("  subTotal: ").append(subTotal).append("\n");
    sb.append("  retencion: ").append(retencion).append("\n");
    sb.append("  porcentaje: ").append(porcentaje).append("\n");
    sb.append("  total: ").append(total).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
