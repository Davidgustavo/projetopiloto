package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity(post = "Public", get = "Public", execute = "Public", delete = "None", put = "None")
public class Sendemail {

public static final int TIMEOUT = 300;

/**
 *
 * @param id_person
 * @return Var
 */
// sendemail
public static Var Executar(Var id_person) throws Exception {
 return new Callable<Var>() {

   private Var lista = Var.VAR_NULL;

   public Var call() throws Exception {
    lista = cronapi.list.Operations.getLast((cronapi.database.Operations.query(Var.valueOf("app.entity.LogUso"),Var.valueOf("select l.geoposicao from LogUso l where l.id_usuario = :id_usuario"),Var.valueOf("id_usuario",cronapi.list.Operations.getFirst((cronapi.database.Operations.query(Var.valueOf("app.entity.Person"),Var.valueOf("select p.id from Person p where p.email = :email"),Var.valueOf("email",Var.valueOf("alex.dorea@cronapp.io")))))))));
    System.out.println(lista.getObjectAsString());
    cronapi.email.Operations.sendEmail(Var.valueOf("guga.lite@hotmail.com"), id_person, Var.VAR_NULL, Var.VAR_NULL, lista, Var.valueOf("teste teste teste teste"), Var.VAR_NULL, Var.VAR_NULL, Var.valueOf("smtp.office365.com"), Var.valueOf("587"), Var.valueOf("guga.lite@hotmail.com"), Var.valueOf("12aalves"), Var.valueOf("TLS"));
    return Var.VAR_NULL;
   }
 }.call();
}

}

