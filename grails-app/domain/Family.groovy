/**
 * Created by IntelliJ IDEA.
 * User: gzeg
 * Date: 15.04.12
 * Time: 11:34
 * To change this template use File | Settings | File Templates.
 */
class Family {

    String familyId;
    String description;
    String familyKey; //kiedy dolaczasz do rodziny, musisz podac key, który ustala familyManager
    User familyManager;

    static constraints = {
        familyId(unique: true, size: 3..20)
        familyKey(nullable: false, size: 3..20)
        description(nullable: true)
    }

    //TODO
}
