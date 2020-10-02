package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity(post = "Public", get = "Public", execute = "Public")
public class Geoposicao {

public static final int TIMEOUT = 300;

/**
 *
 * @param latitude
 * @param longitude
 * @param id_person
 * @return Var
 */
// geoposicao
public static Var Executar(Var latitude, Var longitude, Var id_person) throws Exception {
 return new Callable<Var>() {

   private Var coordenadas = Var.VAR_NULL;

   public Var call() throws Exception {
    coordenadas = cronapi.list.Operations.newList();
    cronapi.list.Operations.addLast(coordenadas,latitude);
    cronapi.list.Operations.addLast(coordenadas,longitude);
    System.out.println(coordenadas.getObjectAsString());
    cronapi.database.Operations.insert(Var.valueOf("app.entity.LogUso"),Var.valueOf("geoposicao",coordenadas),Var.valueOf("id_usuario",cronapi.list.Operations.getFirst((cronapi.database.Operations.query(Var.valueOf("app.entity.Person"),Var.valueOf("select p.id from Person p where p.email = :email"),Var.valueOf("email",Var.valueOf("alex.dorea@cronapp.io")))))));
    return Var.valueOf("sucesso");
   }
 }.call();
}

}

