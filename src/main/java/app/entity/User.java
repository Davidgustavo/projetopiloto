package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


/**
 * Classe que representa a tabela USER
 * @generated
 */
@Entity
@Table(name = "\"USER\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"login" }))
@XmlRootElement
@CronappSecurity(post = "Administrators", get = "Administrators", delete = "Administrators", put = "Administrators")
@JsonFilter("app.entity.User")
public class User implements Serializable {
  /**
  * Variável privada para verificação da criptofrafia
  *
  * @generated
  */
  private static final String ENCRYPT = "$2a$10$";

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
  @Column(name = "email", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String email;

  /**
  * @generated
  */
  @Column(name = "name", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String name;

  /**
  * @generated
  */
  @Column(name = "login", nullable = false, unique = true, insertable=true, updatable=true)
  
  private java.lang.String login;

  /**
  * @generated
  */
  @Column(name = "picture", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String picture;

  /**
  * @generated
  */
  @Column(name = "password", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String password;

  /**
  * @generated
  */
  @Column(name = "theme", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String theme;

  /**
  * @generated
  */
  @Column(name = "cep", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String cep;

  /**
  * @generated
  */
  @Column(name = "logradouro", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String logradouro;

  /**
  * @generated
  */
  @Column(name = "numero", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String numero;

  /**
  * @generated
  */
  @Column(name = "bairro", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String bairro;

  /**
  * @generated
  */
  @Column(name = "cidade", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String cidade;

  /**
  * @generated
  */
  @Column(name = "estado", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String estado;

  /**
  * @generated
  */
  @Column(name = "tipo_sanguineo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String tipo_sanguineo;

  /**
  * @generated
  */
  @Column(name = "telefone", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String telefone;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_logUso", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private LogUso logUso;

  /**
   * Construtor
   * @generated
   */
  public User(){
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
  public User setEmail(java.lang.String email){
    this.email = email;
    return this;
  }

  /**
   * Obtém name
   * return name
   * @generated
   */
  
  public java.lang.String getName(){
    return this.name;
  }

  /**
   * Define name
   * @param name name
   * @generated
   */
  public User setName(java.lang.String name){
    this.name = name;
    return this;
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
  public User setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém login
   * return login
   * @generated
   */
  
  public java.lang.String getLogin(){
    return this.login;
  }

  /**
   * Define login
   * @param login login
   * @generated
   */
  public User setLogin(java.lang.String login){
    this.login = login;
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
  public User setPicture(java.lang.String picture){
    this.picture = picture;
    return this;
  }

  /**
   * Obtém password
   * return password
   * @generated
   */
  
  public java.lang.String getPassword(){
    return this.password;
  }

  /**
   * Define password
   * @param password password
   * @generated
   */
  public User setPassword(java.lang.String password){
    password = password.startsWith(ENCRYPT) ? password : new BCryptPasswordEncoder().encode(password);
    this.password = password;
    return this;
  }

  /**
   * Obtém theme
   * return theme
   * @generated
   */
  
  public java.lang.String getTheme(){
    return this.theme;
  }

  /**
   * Define theme
   * @param theme theme
   * @generated
   */
  public User setTheme(java.lang.String theme){
    this.theme = theme;
    return this;
  }

  /**
   * Obtém cep
   * return cep
   * @generated
   */
  
  public java.lang.String getCep(){
    return this.cep;
  }

  /**
   * Define cep
   * @param cep cep
   * @generated
   */
  public User setCep(java.lang.String cep){
    this.cep = cep;
    return this;
  }

  /**
   * Obtém logradouro
   * return logradouro
   * @generated
   */
  
  public java.lang.String getLogradouro(){
    return this.logradouro;
  }

  /**
   * Define logradouro
   * @param logradouro logradouro
   * @generated
   */
  public User setLogradouro(java.lang.String logradouro){
    this.logradouro = logradouro;
    return this;
  }

  /**
   * Obtém numero
   * return numero
   * @generated
   */
  
  public java.lang.String getNumero(){
    return this.numero;
  }

  /**
   * Define numero
   * @param numero numero
   * @generated
   */
  public User setNumero(java.lang.String numero){
    this.numero = numero;
    return this;
  }

  /**
   * Obtém bairro
   * return bairro
   * @generated
   */
  
  public java.lang.String getBairro(){
    return this.bairro;
  }

  /**
   * Define bairro
   * @param bairro bairro
   * @generated
   */
  public User setBairro(java.lang.String bairro){
    this.bairro = bairro;
    return this;
  }

  /**
   * Obtém cidade
   * return cidade
   * @generated
   */
  
  public java.lang.String getCidade(){
    return this.cidade;
  }

  /**
   * Define cidade
   * @param cidade cidade
   * @generated
   */
  public User setCidade(java.lang.String cidade){
    this.cidade = cidade;
    return this;
  }

  /**
   * Obtém estado
   * return estado
   * @generated
   */
  
  public java.lang.String getEstado(){
    return this.estado;
  }

  /**
   * Define estado
   * @param estado estado
   * @generated
   */
  public User setEstado(java.lang.String estado){
    this.estado = estado;
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
  public User setTipo_sanguineo(java.lang.String tipo_sanguineo){
    this.tipo_sanguineo = tipo_sanguineo;
    return this;
  }

  /**
   * Obtém telefone
   * return telefone
   * @generated
   */
  
  public java.lang.String getTelefone(){
    return this.telefone;
  }

  /**
   * Define telefone
   * @param telefone telefone
   * @generated
   */
  public User setTelefone(java.lang.String telefone){
    this.telefone = telefone;
    return this;
  }

  /**
   * Obtém logUso
   * return logUso
   * @generated
   */
  
  public LogUso getLogUso(){
    return this.logUso;
  }

  /**
   * Define logUso
   * @param logUso logUso
   * @generated
   */
  public User setLogUso(LogUso logUso){
    this.logUso = logUso;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    User object = (User)obj;
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
