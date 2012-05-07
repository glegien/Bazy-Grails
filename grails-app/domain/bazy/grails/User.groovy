package bazy.grails
/**
 * Created by IntelliJ IDEA.
 * bazy.grails.User: gzeg
 * Date: 14.04.12
 * Time: 15:48
 * To change this template use File | Settings | File Templates.
 */
class User {

    String login;
    String password;
    String name;
    String surname;
    String email;

    Family family;
    UserType userType;

    static constraints = {   //nullable jest false domyslnie
        login(unique: true, size: 4..20)
        password(size: 6..20)
        name(size: 3..20)
        surname(size: 3..20)
        email(email: true)
        family(nullable: true) //poki co, trzeba to przemyslec
        userType(nullable: true) //jw
    }

    //TODO - konstruktor, ew metody

}
