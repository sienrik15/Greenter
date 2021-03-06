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

package com.greenter.core.model;

import java.util.*;
import java.util.Date;
import com.google.gson.annotations.SerializedName;

public class Note {
  
  @SerializedName("tipoDoc")
  private String tipoDoc = null;
  @SerializedName("serie")
  private String serie = null;
  @SerializedName("correlativo")
  private String correlativo = null;
  @SerializedName("fechaEmision")
  private Date fechaEmision = null;
  @SerializedName("client")
  private Client client = null;
  @SerializedName("company")
  private Company company = null;
  @SerializedName("tipoMoneda")
  private String tipoMoneda = null;
  @SerializedName("sumOtrosCargos")
  private Float sumOtrosCargos = null;
  @SerializedName("mtoOperGravadas")
  private Float mtoOperGravadas = null;
  @SerializedName("mtoOperInafectas")
  private Float mtoOperInafectas = null;
  @SerializedName("mtoOperExoneradas")
  private Float mtoOperExoneradas = null;
  @SerializedName("mtoIGV")
  private Float mtoIGV = null;
  @SerializedName("mtoISC")
  private Float mtoISC = null;
  @SerializedName("mtoOtrosTributos")
  private Float mtoOtrosTributos = null;
  @SerializedName("mtoImpVenta")
  private Float mtoImpVenta = null;
  @SerializedName("details")
  private List<SaleDetail> details = null;
  @SerializedName("legends")
  private List<Legend> legends = null;
  @SerializedName("relDocs")
  private List<Document> relDocs = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("codMotivo")
  private String codMotivo = null;
  @SerializedName("desMotivo")
  private String desMotivo = null;
  @SerializedName("tipDocAfectado")
  private String tipDocAfectado = null;
  @SerializedName("numDocfectado")
  private String numDocfectado = null;
  @SerializedName("mtoOperGratuitas")
  private Float mtoOperGratuitas = null;
  @SerializedName("perception")
  private SalePerception perception = null;

  /**
   **/
  
  public String getTipoDoc() {
    return tipoDoc;
  }
  public void setTipoDoc(String tipoDoc) {
    this.tipoDoc = tipoDoc;
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
  
  public Client getClient() {
    return client;
  }
  public void setClient(Client client) {
    this.client = client;
  }

  /**
   **/
  
  public Company getCompany() {
    return company;
  }
  public void setCompany(Company company) {
    this.company = company;
  }

  /**
   **/
  
  public String getTipoMoneda() {
    return tipoMoneda;
  }
  public void setTipoMoneda(String tipoMoneda) {
    this.tipoMoneda = tipoMoneda;
  }

  /**
   **/
  
  public Float getSumOtrosCargos() {
    return sumOtrosCargos;
  }
  public void setSumOtrosCargos(Float sumOtrosCargos) {
    this.sumOtrosCargos = sumOtrosCargos;
  }

  /**
   **/
  
  public Float getMtoOperGravadas() {
    return mtoOperGravadas;
  }
  public void setMtoOperGravadas(Float mtoOperGravadas) {
    this.mtoOperGravadas = mtoOperGravadas;
  }

  /**
   **/
  
  public Float getMtoOperInafectas() {
    return mtoOperInafectas;
  }
  public void setMtoOperInafectas(Float mtoOperInafectas) {
    this.mtoOperInafectas = mtoOperInafectas;
  }

  /**
   **/
  
  public Float getMtoOperExoneradas() {
    return mtoOperExoneradas;
  }
  public void setMtoOperExoneradas(Float mtoOperExoneradas) {
    this.mtoOperExoneradas = mtoOperExoneradas;
  }

  /**
   **/
  
  public Float getMtoIGV() {
    return mtoIGV;
  }
  public void setMtoIGV(Float mtoIGV) {
    this.mtoIGV = mtoIGV;
  }

  /**
   **/
  
  public Float getMtoISC() {
    return mtoISC;
  }
  public void setMtoISC(Float mtoISC) {
    this.mtoISC = mtoISC;
  }

  /**
   **/
  
  public Float getMtoOtrosTributos() {
    return mtoOtrosTributos;
  }
  public void setMtoOtrosTributos(Float mtoOtrosTributos) {
    this.mtoOtrosTributos = mtoOtrosTributos;
  }

  /**
   **/
  
  public Float getMtoImpVenta() {
    return mtoImpVenta;
  }
  public void setMtoImpVenta(Float mtoImpVenta) {
    this.mtoImpVenta = mtoImpVenta;
  }

  /**
   **/
  
  public List<SaleDetail> getDetails() {
    return details;
  }
  public void setDetails(List<SaleDetail> details) {
    this.details = details;
  }

  /**
   **/
  
  public List<Legend> getLegends() {
    return legends;
  }
  public void setLegends(List<Legend> legends) {
    this.legends = legends;
  }

  /**
   **/
  
  public List<Document> getRelDocs() {
    return relDocs;
  }
  public void setRelDocs(List<Document> relDocs) {
    this.relDocs = relDocs;
  }

  /**
   **/
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  public String getCodMotivo() {
    return codMotivo;
  }
  public void setCodMotivo(String codMotivo) {
    this.codMotivo = codMotivo;
  }

  /**
   **/
  
  public String getDesMotivo() {
    return desMotivo;
  }
  public void setDesMotivo(String desMotivo) {
    this.desMotivo = desMotivo;
  }

  /**
   **/
  
  public String getTipDocAfectado() {
    return tipDocAfectado;
  }
  public void setTipDocAfectado(String tipDocAfectado) {
    this.tipDocAfectado = tipDocAfectado;
  }

  /**
   **/
  
  public String getNumDocfectado() {
    return numDocfectado;
  }
  public void setNumDocfectado(String numDocfectado) {
    this.numDocfectado = numDocfectado;
  }

  /**
   **/
  
  public Float getMtoOperGratuitas() {
    return mtoOperGratuitas;
  }
  public void setMtoOperGratuitas(Float mtoOperGratuitas) {
    this.mtoOperGratuitas = mtoOperGratuitas;
  }

  /**
   **/
  
  public SalePerception getPerception() {
    return perception;
  }
  public void setPerception(SalePerception perception) {
    this.perception = perception;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Note note = (Note) o;
    return (this.tipoDoc == null ? note.tipoDoc == null : this.tipoDoc.equals(note.tipoDoc)) &&
        (this.serie == null ? note.serie == null : this.serie.equals(note.serie)) &&
        (this.correlativo == null ? note.correlativo == null : this.correlativo.equals(note.correlativo)) &&
        (this.fechaEmision == null ? note.fechaEmision == null : this.fechaEmision.equals(note.fechaEmision)) &&
        (this.client == null ? note.client == null : this.client.equals(note.client)) &&
        (this.company == null ? note.company == null : this.company.equals(note.company)) &&
        (this.tipoMoneda == null ? note.tipoMoneda == null : this.tipoMoneda.equals(note.tipoMoneda)) &&
        (this.sumOtrosCargos == null ? note.sumOtrosCargos == null : this.sumOtrosCargos.equals(note.sumOtrosCargos)) &&
        (this.mtoOperGravadas == null ? note.mtoOperGravadas == null : this.mtoOperGravadas.equals(note.mtoOperGravadas)) &&
        (this.mtoOperInafectas == null ? note.mtoOperInafectas == null : this.mtoOperInafectas.equals(note.mtoOperInafectas)) &&
        (this.mtoOperExoneradas == null ? note.mtoOperExoneradas == null : this.mtoOperExoneradas.equals(note.mtoOperExoneradas)) &&
        (this.mtoIGV == null ? note.mtoIGV == null : this.mtoIGV.equals(note.mtoIGV)) &&
        (this.mtoISC == null ? note.mtoISC == null : this.mtoISC.equals(note.mtoISC)) &&
        (this.mtoOtrosTributos == null ? note.mtoOtrosTributos == null : this.mtoOtrosTributos.equals(note.mtoOtrosTributos)) &&
        (this.mtoImpVenta == null ? note.mtoImpVenta == null : this.mtoImpVenta.equals(note.mtoImpVenta)) &&
        (this.details == null ? note.details == null : this.details.equals(note.details)) &&
        (this.legends == null ? note.legends == null : this.legends.equals(note.legends)) &&
        (this.relDocs == null ? note.relDocs == null : this.relDocs.equals(note.relDocs)) &&
        (this.name == null ? note.name == null : this.name.equals(note.name)) &&
        (this.codMotivo == null ? note.codMotivo == null : this.codMotivo.equals(note.codMotivo)) &&
        (this.desMotivo == null ? note.desMotivo == null : this.desMotivo.equals(note.desMotivo)) &&
        (this.tipDocAfectado == null ? note.tipDocAfectado == null : this.tipDocAfectado.equals(note.tipDocAfectado)) &&
        (this.numDocfectado == null ? note.numDocfectado == null : this.numDocfectado.equals(note.numDocfectado)) &&
        (this.mtoOperGratuitas == null ? note.mtoOperGratuitas == null : this.mtoOperGratuitas.equals(note.mtoOperGratuitas)) &&
        (this.perception == null ? note.perception == null : this.perception.equals(note.perception));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.tipoDoc == null ? 0: this.tipoDoc.hashCode());
    result = 31 * result + (this.serie == null ? 0: this.serie.hashCode());
    result = 31 * result + (this.correlativo == null ? 0: this.correlativo.hashCode());
    result = 31 * result + (this.fechaEmision == null ? 0: this.fechaEmision.hashCode());
    result = 31 * result + (this.client == null ? 0: this.client.hashCode());
    result = 31 * result + (this.company == null ? 0: this.company.hashCode());
    result = 31 * result + (this.tipoMoneda == null ? 0: this.tipoMoneda.hashCode());
    result = 31 * result + (this.sumOtrosCargos == null ? 0: this.sumOtrosCargos.hashCode());
    result = 31 * result + (this.mtoOperGravadas == null ? 0: this.mtoOperGravadas.hashCode());
    result = 31 * result + (this.mtoOperInafectas == null ? 0: this.mtoOperInafectas.hashCode());
    result = 31 * result + (this.mtoOperExoneradas == null ? 0: this.mtoOperExoneradas.hashCode());
    result = 31 * result + (this.mtoIGV == null ? 0: this.mtoIGV.hashCode());
    result = 31 * result + (this.mtoISC == null ? 0: this.mtoISC.hashCode());
    result = 31 * result + (this.mtoOtrosTributos == null ? 0: this.mtoOtrosTributos.hashCode());
    result = 31 * result + (this.mtoImpVenta == null ? 0: this.mtoImpVenta.hashCode());
    result = 31 * result + (this.details == null ? 0: this.details.hashCode());
    result = 31 * result + (this.legends == null ? 0: this.legends.hashCode());
    result = 31 * result + (this.relDocs == null ? 0: this.relDocs.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.codMotivo == null ? 0: this.codMotivo.hashCode());
    result = 31 * result + (this.desMotivo == null ? 0: this.desMotivo.hashCode());
    result = 31 * result + (this.tipDocAfectado == null ? 0: this.tipDocAfectado.hashCode());
    result = 31 * result + (this.numDocfectado == null ? 0: this.numDocfectado.hashCode());
    result = 31 * result + (this.mtoOperGratuitas == null ? 0: this.mtoOperGratuitas.hashCode());
    result = 31 * result + (this.perception == null ? 0: this.perception.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Note {\n");
    
    sb.append("  tipoDoc: ").append(tipoDoc).append("\n");
    sb.append("  serie: ").append(serie).append("\n");
    sb.append("  correlativo: ").append(correlativo).append("\n");
    sb.append("  fechaEmision: ").append(fechaEmision).append("\n");
    sb.append("  client: ").append(client).append("\n");
    sb.append("  company: ").append(company).append("\n");
    sb.append("  tipoMoneda: ").append(tipoMoneda).append("\n");
    sb.append("  sumOtrosCargos: ").append(sumOtrosCargos).append("\n");
    sb.append("  mtoOperGravadas: ").append(mtoOperGravadas).append("\n");
    sb.append("  mtoOperInafectas: ").append(mtoOperInafectas).append("\n");
    sb.append("  mtoOperExoneradas: ").append(mtoOperExoneradas).append("\n");
    sb.append("  mtoIGV: ").append(mtoIGV).append("\n");
    sb.append("  mtoISC: ").append(mtoISC).append("\n");
    sb.append("  mtoOtrosTributos: ").append(mtoOtrosTributos).append("\n");
    sb.append("  mtoImpVenta: ").append(mtoImpVenta).append("\n");
    sb.append("  details: ").append(details).append("\n");
    sb.append("  legends: ").append(legends).append("\n");
    sb.append("  relDocs: ").append(relDocs).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  codMotivo: ").append(codMotivo).append("\n");
    sb.append("  desMotivo: ").append(desMotivo).append("\n");
    sb.append("  tipDocAfectado: ").append(tipDocAfectado).append("\n");
    sb.append("  numDocfectado: ").append(numDocfectado).append("\n");
    sb.append("  mtoOperGratuitas: ").append(mtoOperGratuitas).append("\n");
    sb.append("  perception: ").append(perception).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
