package task9;

public enum Months {
    /**
     * The list of months which belongs to seasons.
     * @see Seasons
     */
    JANUARY(Seasons.WINTER, 31), FEBRUARY(Seasons.WINTER, 28), MARCH(Seasons.SPRING, 31), APRIL(Seasons.SPRING, 30),
    MAY(Seasons.SPRING, 31), JUNE(Seasons.SUMMER, 30), JULY(Seasons.SUMMER, 31), AUGUST(Seasons.SUMMER, 31),
    SEPTEMBER(Seasons.AUTUMN, 30), OCTOBER(Seasons.AUTUMN, 31), NOVEMBER(Seasons.AUTUMN, 30),
    DECEMBER(Seasons.WINTER, 31);

    private Seasons season;
    private int day;

    /**
     * Constructor with two params.
     * @param season
     * @param day
     */
    Months(Seasons season, int day) {
        this.season = season;
        this.day = day;
    }

    public Seasons getSeason() {
        return season;
    }

    public int getDay() {
        return day;
    }

    /**
     * The methods asks a user to enter a number to get an answer.
     */
    static void showAction() {
        System.out.println("Введіть: 1 -  Для місяця");
        System.out.println("Введіть: 2 -  Вивести всі місяці з такою ж порою року");
        System.out.println("Введіть: 3 -  Вивести всі місяці які мають таку саму кількість днів");
        System.out.println("Введіть: 4 -  Вивести на екран всі місяці які мають меншу кількість днів");
        System.out.println("Введіть: 5 -  Вивести на екран всі місяці які мають більшу кількість днів");
        System.out.println("Введіть: 6 -  Вивести на екран наступну пору року");
        System.out.println("Введіть: 7 -  Вивести на екран попередню пору року");
        System.out.println("Введіть: 8 -  Вивести на екран всі місяці які мають парну кількість днів");
        System.out.println("Введіть: 9 -  Вивести на екран всі місяці які мають непарну кількість днів");
        System.out.println("Введіть: 10 - Вивести на екран чи введений з консолі місяць має парну кількість днів");
    }

    /**
     *
     * @param str
     * @return
     */
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

    /**
     * The method gets the name of seasons and checks for the capital letter .
     * @param str
     * @return
     */
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
