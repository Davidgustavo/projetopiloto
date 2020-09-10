package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("PersonDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface PersonDAO extends JpaRepository<Person, java.lang.String> {

  /**
   * Obtém a instância de Person utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Person entity WHERE entity.id = :id")
  public Person findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Person utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Person entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Address entity WHERE entity.person.id = :id")
  public Page<Address> findAddress(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Telephone entity WHERE entity.person.id = :id")
  public Page<Telephone> findTelephone(@Param(value="id") java.lang.String id, Pageable pageable);

}
