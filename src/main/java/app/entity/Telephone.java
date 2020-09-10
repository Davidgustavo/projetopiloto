package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela TELEPHONE
 * @generated
 */
@Entity
@Table(name = "\"TELEPHONE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Telephone")
public class Telephone implements Serializable {

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
  @Column(name = "tipo_telefone", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String tipo_telefone;

  /**
  * @generated
  */
  @Column(name = "numero", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double numero;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_person", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Person person;

  /**
   * Construtor
   * @generated
   */
  public Telephone(){
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
  public Telephone setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém tipo_telefone
   * return tipo_telefone
   * @generated
   */
  
  public java.lang.String getTipo_telefone(){
    return this.tipo_telefone;
  }

  /**
   * Define tipo_telefone
   * @param tipo_telefone tipo_telefone
   * @generated
   */
  public Telephone setTipo_telefone(java.lang.String tipo_telefone){
    this.tipo_telefone = tipo_telefone;
    return this;
  }

  /**
   * Obtém numero
   * return numero
   * @generated
   */
  
  public java.lang.Double getNumero(){
    return this.numero;
  }

  /**
   * Define numero
   * @param numero numero
   * @generated
   */
  public Telephone setNumero(java.lang.Double numero){
    this.numero = numero;
    return this;
  }

  /**
   * Obtém person
   * return person
   * @generated
   */
  
  public Person getPerson(){
    return this.person;
  }

  /**
   * Define person
   * @param person person
   * @generated
   */
  public Telephone setPerson(Person person){
    this.person = person;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Telephone object = (Telephone)obj;
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
