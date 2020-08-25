package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela LOGUSO
 * @generated
 */
@Entity
@Table(name = "\"LOGUSO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.LogUso")
public class LogUso implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data_acesso", nullable = true, unique = false, insertable=true, updatable=true, columnDefinition = "TIMESTAMP")
  
  private java.util.Date data_acesso = Calendar.getInstance().getTime();

  /**
  * @generated
  */
  @Column(name = "id_usuario", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String id_usuario;

  /**
  * @generated
  */
  @Column(name = "geoposicao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String geoposicao;

  /**
   * Construtor
   * @generated
   */
  public LogUso(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public LogUso setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém data_acesso
   * return data_acesso
   * @generated
   */
  
  public java.util.Date getData_acesso(){
    return this.data_acesso;
  }

  /**
   * Define data_acesso
   * @param data_acesso data_acesso
   * @generated
   */
  public LogUso setData_acesso(java.util.Date data_acesso){
    this.data_acesso = data_acesso;
    return this;
  }

  /**
   * Obtém id_usuario
   * return id_usuario
   * @generated
   */
  
  public java.lang.String getId_usuario(){
    return this.id_usuario;
  }

  /**
   * Define id_usuario
   * @param id_usuario id_usuario
   * @generated
   */
  public LogUso setId_usuario(java.lang.String id_usuario){
    this.id_usuario = id_usuario;
    return this;
  }

  /**
   * Obtém geoposicao
   * return geoposicao
   * @generated
   */
  
  public java.lang.String getGeoposicao(){
    return this.geoposicao;
  }

  /**
   * Define geoposicao
   * @param geoposicao geoposicao
   * @generated
   */
  public LogUso setGeoposicao(java.lang.String geoposicao){
    this.geoposicao = geoposicao;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    LogUso object = (LogUso)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
