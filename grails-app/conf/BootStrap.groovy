import bazy.grails.Budget
import bazy.grails.Family
import bazy.grails.User

class BootStrap {

    def init = { servletContext ->
        //TODO - usunac w wersji produkcyjnej
        def family = new Family(familyId: 'rodzinaAdama', familyKey: '123').save()
        def family2 = new Family(familyId: 'rodzinaInna', familyKey: '1234').save()
        def adam = new User(login: 'adam1', password: '123456', name: 'Adam', surname: 'Adamowski', email: 'adam@adam.pl',
                family: family).save()
        def budget = new Budget(family: family, fromDate: new Date(), toDate: new Date(2045, 12, 12), value: 123.45,
                presentValue: 123.45)
        if (budget.validate()) {
            budget.save()
        }
        else
            print "Blad tworzenia danych pocztkowych - niepoprawny budżet"
        new bazy.grails.Period(fromDate: new Date(2013, 1, 10), periodType: bazy.grails.PeriodType.monthly, toDate: new Date(2013, 2, 1)).save()

    }

    def destroy = {
    }
}
