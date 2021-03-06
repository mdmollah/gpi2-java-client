/*
 * gpi API
 * Move your app forward with the gpi API
 *
 * OpenAPI spec version: 2.0.2
 * Contact: Li.JIE@swift.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.swift.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.swift.model.TransactionCancellationStatusRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ISO 20022 JSON Schema TransactionCancellationStatusRequest (camt.a07.001.02) Generated by SWIFT Standards 2018-07-16 09:05:02
 */
@ApiModel(description = "ISO 20022 JSON Schema TransactionCancellationStatusRequest (camt.a07.001.02) Generated by SWIFT Standards 2018-07-16 09:05:02")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-20T13:44:06.319-05:00")
public class CamtA0700102 {
  @SerializedName("transaction_cancellation_status_request")
  private TransactionCancellationStatusRequest transactionCancellationStatusRequest = null;

  public CamtA0700102 transactionCancellationStatusRequest(TransactionCancellationStatusRequest transactionCancellationStatusRequest) {
    this.transactionCancellationStatusRequest = transactionCancellationStatusRequest;
    return this;
  }

   /**
   * Get transactionCancellationStatusRequest
   * @return transactionCancellationStatusRequest
  **/
  @ApiModelProperty(value = "")
  public TransactionCancellationStatusRequest getTransactionCancellationStatusRequest() {
    return transactionCancellationStatusRequest;
  }

  public void setTransactionCancellationStatusRequest(TransactionCancellationStatusRequest transactionCancellationStatusRequest) {
    this.transactionCancellationStatusRequest = transactionCancellationStatusRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CamtA0700102 camtA0700102 = (CamtA0700102) o;
    return Objects.equals(this.transactionCancellationStatusRequest, camtA0700102.transactionCancellationStatusRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionCancellationStatusRequest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CamtA0700102 {\n");
    
    sb.append("    transactionCancellationStatusRequest: ").append(toIndentedString(transactionCancellationStatusRequest)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

