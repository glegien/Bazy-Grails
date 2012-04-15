/**
 * Created by IntelliJ IDEA.
 * User: gzeg
 * Date: 15.04.12
 * Time: 12:41
 * To change this template use File | Settings | File Templates.
 */
class Budget {

    static belongsTo = Family;

    Family familyId;
    Date fromDate;
    Date toDate;
    float value;
    float presentValue;
    Budget budgetParent;
    Boolean active; //czy budzet obowiązuje, czy okres w którym był liczony zakończył się
}
