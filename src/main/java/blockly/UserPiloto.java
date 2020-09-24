package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.springframework.data.domain.*;
import org.springframework.validation.annotation.*;
import org.springframework.web.bind.annotation.*;


/** 
* 
* RestController @generated 
* 
*/ 

@RestController
@RequestMapping(value = "/api/rest/main/UserPiloto")

@CronapiMetaData(type = "blockly")
@CronappSecurity(get = "Public", execute = "Public")
public class UserPiloto {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */

@RequestMapping(method = RequestMethod.GET, value="/Executar")
// userPiloto
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;
   private Var login_user = Var.VAR_NULL;
   private Var lista = Var.VAR_NULL;

   public Var call() throws Exception {
    item = cronapi.screen.Operations.getValueOfField(Var.valueOf("params.id"));
    System.out.println(item.getObjectAsString());
    login_user = cronapi.database.Operations.query(Var.valueOf("app.entity.Address"),Var.valueOf("select a from Address a where a.person.email = :personEmail"),Var.valueOf("personEmail",item));
    System.out.println(cronapi.object.Operations.getObjectField(login_user, Var.valueOf("person.tipo_sanguineo")).getObjectAsString());
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.name"), cronapi.object.Operations.getObjectField(login_user, Var.valueOf("person.nome")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.email"), cronapi.object.Operations.getObjectField(login_user, Var.valueOf("person.email")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.endereco"), cronapi.object.Operations.getObjectField(login_user, Var.valueOf("logradouro")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.numero"), cronapi.object.Operations.getObjectField(login_user, Var.valueOf("numero")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.bairro"), cronapi.object.Operations.getObjectField(login_user, Var.valueOf("bairro")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.cidade"), cronapi.object.Operations.getObjectField(login_user, Var.valueOf("cidade")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.estado"), cronapi.object.Operations.getObjectField(login_user, Var.valueOf("estado")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.tipo_sanguineo"), cronapi.object.Operations.getObjectField(login_user, Var.valueOf("person.tipo_sanguineo")));
    lista = cronapi.list.Operations.newList();
    cronapi.list.Operations.addLast(lista,Var.valueOf("-12.8359504,-38.279418"));
    System.out.println(lista.getObjectAsString());
    cronapi.database.Operations.insert(Var.valueOf("app.entity.LogUso"),Var.valueOf("geoposicao",lista),Var.valueOf("id_usuario",cronapi.object.Operations.getObjectField(login_user, Var.valueOf("id"))));
    return Var.VAR_NULL;
   }
 }.call();
}

}

