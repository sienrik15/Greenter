/**
 * Grenter App
 * Aplicación para MYPEs empleando sus comprobantes electrónicos
 *
 * OpenAPI spec version: 1.0.0
 * Contact: giansalex@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.greenter.core.model;

import com.google.gson.annotations.SerializedName;

public class DniResponse {
  
  @SerializedName("dni")
  private String dni = null;
  @SerializedName("nombres")
  private String nombres = null;
  @SerializedName("apellidoPaterno")
  private String apellidoPaterno = null;
  @SerializedName("apellidoMaterno")
  private String apellidoMaterno = null;
  @SerializedName("codVerifica")
  private String codVerifica = null;

  /**
   **/
  
  public String getDni() {
    return dni;
  }
  public void setDni(String dni) {
    this.dni = dni;
  }

  /**
   **/
  
  public String getNombres() {
    return nombres;
  }
  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  /**
   **/
  public String getApellidoPaterno() {
    return apellidoPaterno;
  }
  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  /**
   **/
  public String getApellidoMaterno() {
    return apellidoMaterno;
  }
  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }

  /**
   **/
  public String getCodVerifica() {
    return codVerifica;
  }
  public void setCodVerifica(String codVerifica) {
    this.codVerifica = codVerifica;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DniResponse dniResponse = (DniResponse) o;
    return (this.dni == null ? dniResponse.dni == null : this.dni.equals(dniResponse.dni)) &&
        (this.nombres == null ? dniResponse.nombres == null : this.nombres.equals(dniResponse.nombres)) &&
        (this.apellidoPaterno == null ? dniResponse.apellidoPaterno == null : this.apellidoPaterno.equals(dniResponse.apellidoPaterno)) &&
        (this.apellidoMaterno == null ? dniResponse.apellidoMaterno == null : this.apellidoMaterno.equals(dniResponse.apellidoMaterno)) &&
        (this.codVerifica == null ? dniResponse.codVerifica == null : this.codVerifica.equals(dniResponse.codVerifica));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.dni == null ? 0: this.dni.hashCode());
    result = 31 * result + (this.nombres == null ? 0: this.nombres.hashCode());
    result = 31 * result + (this.apellidoPaterno == null ? 0: this.apellidoPaterno.hashCode());
    result = 31 * result + (this.apellidoMaterno == null ? 0: this.apellidoMaterno.hashCode());
    result = 31 * result + (this.codVerifica == null ? 0: this.codVerifica.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DniResponse {\n");
    
    sb.append("  dni: ").append(dni).append("\n");
    sb.append("  nombres: ").append(nombres).append("\n");
    sb.append("  apellidoPaterno: ").append(apellidoPaterno).append("\n");
    sb.append("  apellidoMaterno: ").append(apellidoMaterno).append("\n");
    sb.append("  codVerifica: ").append(codVerifica).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
