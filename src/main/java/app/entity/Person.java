package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PERSON
 * @generated
 */
@Entity
@Table(name = "\"PERSON\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Person")
public class Person implements Serializable {

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
  @Column(name = "cpf", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String cpf;

  /**
  * @generated
  */
  @Column(name = "identidade", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String identidade;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "nascimento", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date nascimento;

  /**
  * @generated
  */
  @Column(name = "tipo_sanguineo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String tipo_sanguineo;

  /**
  * @generated
  */
  @Column(name = "picture", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String picture;

  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "email", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String email;

  /**
   * Construtor
   * @generated
   */
  public Person(){
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
  public Person setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém cpf
   * return cpf
   * @generated
   */
  
  public java.lang.String getCpf(){
    return this.cpf;
  }

  /**
   * Define cpf
   * @param cpf cpf
   * @generated
   */
  public Person setCpf(java.lang.String cpf){
    this.cpf = cpf;
    return this;
  }

  /**
   * Obtém identidade
   * return identidade
   * @generated
   */
  
  public java.lang.String getIdentidade(){
    return this.identidade;
  }

  /**
   * Define identidade
   * @param identidade identidade
   * @generated
   */
  public Person setIdentidade(java.lang.String identidade){
    this.identidade = identidade;
    return this;
  }

  /**
   * Obtém nascimento
   * return nascimento
   * @generated
   */
  
  public java.util.Date getNascimento(){
    return this.nascimento;
  }

  /**
   * Define nascimento
   * @param nascimento nascimento
   * @generated
   */
  public Person setNascimento(java.util.Date nascimento){
    this.nascimento = nascimento;
    return this;
  }

  /**
   * Obtém tipo_sanguineo
   * return tipo_sanguineo
   * @generated
   */
  
  public java.lang.String getTipo_sanguineo(){
    return this.tipo_sanguineo;
  }

  /**
   * Define tipo_sanguineo
   * @param tipo_sanguineo tipo_sanguineo
   * @generated
   */
  public Person setTipo_sanguineo(java.lang.String tipo_sanguineo){
    this.tipo_sanguineo = tipo_sanguineo;
    return this;
  }

  /**
   * Obtém picture
   * return picture
   * @generated
   */
  
  public java.lang.String getPicture(){
    return this.picture;
  }

  /**
   * Define picture
   * @param picture picture
   * @generated
   */
  public Person setPicture(java.lang.String picture){
    this.picture = picture;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Person setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém email
   * return email
   * @generated
   */
  
  public java.lang.String getEmail(){
    return this.email;
  }

  /**
   * Define email
   * @param email email
   * @generated
   */
  public Person setEmail(java.lang.String email){
    this.email = email;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Person object = (Person)obj;
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
