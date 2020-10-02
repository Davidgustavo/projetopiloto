package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class BlocoMarcacao {

public static final int TIMEOUT = 300;

/**
 *
 * @param id_user
 * @return Var
 */
// blocoMarcacao
public static Var Executar(Var id_user) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    System.out.println(id_user.getObjectAsString());
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"), Var.valueOf("#/app/logged/home"), cronapi.list.Operations.newList(Var.valueOf("id",id_user)));
    return Var.VAR_NULL;
   }
 }.call();
}

}

