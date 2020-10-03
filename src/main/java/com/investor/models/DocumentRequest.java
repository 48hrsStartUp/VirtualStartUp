/*
 * investor
 * This swagger documentation provides investor onboarding api details.
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.investor.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import java.util.Objects;

/** DocumentRequest */
@JsonPropertyOrder({
  DocumentRequest.JSON_PROPERTY_DOCUMENT,
  DocumentRequest.JSON_PROPERTY_DOCUMENT_ID,
  DocumentRequest.JSON_PROPERTY_DOCUMENT_TYPE
})
@JsonTypeName("DocumentRequest")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-10-03T17:43:44.473+05:30[Asia/Kolkata]")
public class DocumentRequest {
  public static final String JSON_PROPERTY_DOCUMENT = "document";
  private File document;

  public static final String JSON_PROPERTY_DOCUMENT_ID = "documentId";
  private String documentId;

  public static final String JSON_PROPERTY_DOCUMENT_TYPE = "documentType";
  private String documentType;

  public DocumentRequest document(File document) {

    this.document = document;
    return this;
  }

  /**
   * Get document
   *
   * @return document
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOCUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public File getDocument() {
    return document;
  }

  public void setDocument(File document) {
    this.document = document;
  }

  public DocumentRequest documentId(String documentId) {

    this.documentId = documentId;
    return this;
  }

  /**
   * Get documentId
   *
   * @return documentId
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3456789087654", value = "")
  @JsonProperty(JSON_PROPERTY_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public DocumentRequest documentType(String documentType) {

    this.documentType = documentType;
    return this;
  }

  /**
   * Get documentType
   *
   * @return documentType
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "address proof, Bank documents-- bank documents , taxDocuments-- PAN Card",
      value = "")
  @JsonProperty(JSON_PROPERTY_DOCUMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentRequest documentRequest = (DocumentRequest) o;
    return Objects.equals(this.document, documentRequest.document)
        && Objects.equals(this.documentId, documentRequest.documentId)
        && Objects.equals(this.documentType, documentRequest.documentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, documentId, documentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentRequest {\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
