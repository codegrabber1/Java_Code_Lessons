package task12.e.list;

public enum Months {
    JANUARY(Seasons.WINTER, 31), FEBRUARY(Seasons.WINTER, 28), MARCH(Seasons.SPRING, 31), APRIL(Seasons.SPRING, 30),
    MAY(Seasons.SPRING, 31), JUNE(Seasons.SUMMER, 30), JULY(Seasons.SUMMER, 31), AUGUST(Seasons.SUMMER, 31),
    SEPTEMBER(Seasons.AUTUMN, 30), OCTOBER(Seasons.AUTUMN, 31), NOVEMBER(Seasons.AUTUMN, 30),
    DECEMBER(Seasons.WINTER, 31);

    private Seasons season;
    private int day;

    private Months(Seasons season, int day) {
        this.season = season;
        this.day = day;
    }

    public Seasons getSeason() {
        return season;
    }

    public int getDay() {
        return day;
    }


    static void showAction() {
        System.out.println("Enter: 1 -  To check a month");
        System.out.println("Enter: 2 -  Find out all the months of the specified season");
        System.out.println("Enter: 3 -  Print all months that have the same number of days");
        System.out.println("Enter: 4 -  Display all months with fewer days");
        System.out.println("Enter: 5 -  Display all months that have more days");
        System.out.println("Enter: 6 -  Display the next season");
        System.out.println("Enter: 7 -  Display the previous season");
        System.out.println("Enter: 8 -  Display all months that have an even number of days");
        System.out.println("Enter: 9 -  Display all months that have an odd number of days");
        System.out.println("Enter: 10 - Check that the month entered from the console has an even number of days");
        System.out.println("Enter: 11 - to exit");
    }

    static boolean hasMonth(String str) {
        boolean hasMonth = false;
        for (Months month : Months.values()) {
            if (str.equalsIgnoreCase(month.name())) {
                hasMonth = true;
                break;
            }
        }
        return hasMonth;

    }

    static boolean hasSeason(String str) {
        boolean hasSeason = false;
        for (Seasons seasons : Seasons.values()) {
            if (str.equalsIgnoreCase(seasons.name())) {
                hasSeason = true;
                break;
            }
        }
        return hasSeason;

    }
}
