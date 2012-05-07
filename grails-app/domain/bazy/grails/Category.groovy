package bazy.grails
/**
 * Created by IntelliJ IDEA.
 * bazy.grails.User: gzeg
 * Date: 15.04.12
 * Time: 13:23
 * To change this template use File | Settings | File Templates.
 */
class Category {
    String name;
    String description;
    Family familyId

    static constraints = {
        name(blank: false)
        description(blank: true)
    }
}
