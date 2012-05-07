package bazy.grails

/**
 * Created by IntelliJ IDEA.
 * bazy.grails.User: gzeg
 * Date: 15.04.12
 * Time: 13:22
 * To change this template use File | Settings | File Templates.
 */
class Outgo {
    User userId;
    String title;
    String description
    Category category;
    float price;
    Period period;
    Boolean confirmed;
    Budget budget;

    static constraints = {
        title(blank: false, size: 1..256)
        description(blank: true)
        price(nullbale: false, scale: 2)    //bo waluta moze miec maks dwa miejsca po przecinku
    }
}
