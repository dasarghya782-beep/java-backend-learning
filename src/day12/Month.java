package day12;

public enum Month {
    JANUARY(1,31),FEBRUARY(2,28),MARCH(3,31),APRIL(4,30),
    MAY(5,31),JUNE(6,30),JULY(7,31),AUGUST(8,31),
    SEPTEMBER(9,30),OCTOBER(10,31),NOVEMBER(11,30),DECEMBER(12,31);

    private final int monthNumber;
    private final int daysInMonth;

    Month(int monthNumber, int daysInMonth) {
        this.monthNumber = monthNumber;
        this.daysInMonth = daysInMonth;
    }
    public int getMonthNumber() {
        return monthNumber;
    }
    public int getDaysInMonth() {
        return daysInMonth;
    }

    public static Month fromNumber(int number){
        for(Month m:Month.values()){
            if(m.monthNumber==number){
                return m;
            }
        }
        throw new IllegalArgumentException("Invalid month number: " + number);
    }

    public boolean isQuarter(){
        return this==JANUARY || this==APRIL || this==JULY || this==OCTOBER;
    }
}
