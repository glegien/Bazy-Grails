package bazy.grails
/**
 * Created by IntelliJ IDEA.
 * bazy.grails.User: gzeg
 * Date: 15.04.12
 * Time: 11:35
 * To change this template use File | Settings | File Templates.
 */
abstract class UserType {
    /* pomysł na klasę mam taki - SuperUser, zwykły użytkownik i ew
    klasy pochodne będą dziedziczyć po typie abstrakcyjnym, który
    będzie miał zdefiniowane metody, do sprawdzania czy dany użytkownik może
     zrobić wykonac operacje. Np.:
       abstract boolean ifCanDoSth();

       w klasie SuperUser:
       public boolean ifCanDoSth() {
        return true;
       }

       a w klasie bazy.grails.User:
      public boolean ifCanDoSth() {
        return false;
       }
     */
    //TODO - najpierw rozbudowac reszte, pozniej pomyslimy jak zrobic uprawnienia
}
