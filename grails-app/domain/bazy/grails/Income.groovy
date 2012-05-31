package bazy.grails


class Income {

    User userId;
    String title;
    String description
    float price
    Period period
    boolean confirmed
    Budget budget

    static constraints = {
        title(blank: false, size: 1..256)
        description(blank: true)
        price(nullable: false, scale: 2)
    }
}

