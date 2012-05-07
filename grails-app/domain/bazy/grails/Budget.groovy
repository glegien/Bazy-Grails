package bazy.grails
/**
 * Created by IntelliJ IDEA.
 * bazy.grails.User: gzeg
 * Date: 15.04.12
 * Time: 12:41
 * To change this template use File | Settings | File Templates.
 */
class Budget {

    static belongsTo = Family;

    Family family;
    Date fromDate;
    Date toDate;
    float value;
    float presentValue = value;
    Budget budgetParent;
    Boolean active = true; //czy budzet obowiązuje, czy okres w którym był liczony zakończył się

    static hasMany = [outgoes: Outgo, incomes: Income]


    static constraints = {
        family(nullable: false)
        fromDate(min: new Date())
        toDate(validator: { val, obj ->
            val.after(obj.fromDate)
        })
        value(nullable: false)
        budgetParent(nullable: true)
        active(nullable: true)
    }

}
