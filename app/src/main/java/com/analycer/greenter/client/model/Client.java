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

public class Client {
  
  @SerializedName("tipoDoc")
  private String tipoDoc = null;
  @SerializedName("numDoc")
  private String numDoc = null;
  @SerializedName("rznSocial")
  private String rznSocial = null;
  @SerializedName("address")
  private Address address = null;

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
  
  public String getNumDoc() {
    return numDoc;
  }
  public void setNumDoc(String numDoc) {
    this.numDoc = numDoc;
  }

  /**
   **/
  
  public String getRznSocial() {
    return rznSocial;
  }
  public void setRznSocial(String rznSocial) {
    this.rznSocial = rznSocial;
  }

  /**
   **/
  
  public Address getAddress() {
    return address;
  }
  public void setAddress(Address address) {
    this.address = address;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Client client = (Client) o;
    return (this.tipoDoc == null ? client.tipoDoc == null : this.tipoDoc.equals(client.tipoDoc)) &&
        (this.numDoc == null ? client.numDoc == null : this.numDoc.equals(client.numDoc)) &&
        (this.rznSocial == null ? client.rznSocial == null : this.rznSocial.equals(client.rznSocial)) &&
        (this.address == null ? client.address == null : this.address.equals(client.address));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.tipoDoc == null ? 0: this.tipoDoc.hashCode());
    result = 31 * result + (this.numDoc == null ? 0: this.numDoc.hashCode());
    result = 31 * result + (this.rznSocial == null ? 0: this.rznSocial.hashCode());
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Client {\n");
    
    sb.append("  tipoDoc: ").append(tipoDoc).append("\n");
    sb.append("  numDoc: ").append(numDoc).append("\n");
    sb.append("  rznSocial: ").append(rznSocial).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
