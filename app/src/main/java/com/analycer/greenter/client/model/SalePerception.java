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

import com.google.gson.annotations.SerializedName;

public class SalePerception {
  
  @SerializedName("codReg")
  private String codReg = null;
  @SerializedName("mtoBase")
  private Float mtoBase = null;
  @SerializedName("mto")
  private Float mto = null;
  @SerializedName("mtoTotal")
  private Float mtoTotal = null;

  /**
   **/
  
  public String getCodReg() {
    return codReg;
  }
  public void setCodReg(String codReg) {
    this.codReg = codReg;
  }

  /**
   **/
  
  public Float getMtoBase() {
    return mtoBase;
  }
  public void setMtoBase(Float mtoBase) {
    this.mtoBase = mtoBase;
  }

  /**
   **/
  
  public Float getMto() {
    return mto;
  }
  public void setMto(Float mto) {
    this.mto = mto;
  }

  /**
   **/
  
  public Float getMtoTotal() {
    return mtoTotal;
  }
  public void setMtoTotal(Float mtoTotal) {
    this.mtoTotal = mtoTotal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalePerception salePerception = (SalePerception) o;
    return (this.codReg == null ? salePerception.codReg == null : this.codReg.equals(salePerception.codReg)) &&
        (this.mtoBase == null ? salePerception.mtoBase == null : this.mtoBase.equals(salePerception.mtoBase)) &&
        (this.mto == null ? salePerception.mto == null : this.mto.equals(salePerception.mto)) &&
        (this.mtoTotal == null ? salePerception.mtoTotal == null : this.mtoTotal.equals(salePerception.mtoTotal));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.codReg == null ? 0: this.codReg.hashCode());
    result = 31 * result + (this.mtoBase == null ? 0: this.mtoBase.hashCode());
    result = 31 * result + (this.mto == null ? 0: this.mto.hashCode());
    result = 31 * result + (this.mtoTotal == null ? 0: this.mtoTotal.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalePerception {\n");
    
    sb.append("  codReg: ").append(codReg).append("\n");
    sb.append("  mtoBase: ").append(mtoBase).append("\n");
    sb.append("  mto: ").append(mto).append("\n");
    sb.append("  mtoTotal: ").append(mtoTotal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
