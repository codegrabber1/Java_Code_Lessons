package task12.e.list;

import java.util.*;

public class Main {
    @SuppressWarnings({ "resource", "unlikely-arg-type" })
    public static void main(String[] args) {

        Scanner menu = new Scanner(System.in);
        String str;

        /*
         * Creating list for seasons
         */

        ArrayList<Seasons> seasons = new ArrayList<>();

        /*
         * Creating list for months
         */

        ArrayList<Months> months = new ArrayList<>();

        /*
         * Adding data into the seasons list
         */

        for(Seasons s: Seasons.values()) {
            seasons.add(s);

        }

        /*
         * Adding data into the months list
         */

        for(Months m: Months.values()) {
            months.add(m);
        }

        boolean state = true;

        while(state) {
            Months.showAction();
            str = menu.nextLine();

            switch(str) {
                case "1": {
                    System.out.println(" Enter the name of month: ");
                    str = menu.nextLine();
                    if(Months.hasMonth(str)) {
                        System.out.println("Такий місяць існує");
                    } else {
                        System.out.println("Дані про такий місяць відсутні або введіть англійською");
                    }
                    System.out.println("/* ====== BREAK ===== */");
                    break;

                }
                case "2" : {
                    System.out.println("Введіть назву пори року,щоб отримати її місяці : ");
                    str = menu.nextLine();

                    if(seasons.contains(str)) {

                        for (Months m : months) {
                            if (m.getSeason().name().equalsIgnoreCase(str))
                                System.out.println(m);
                        }
                    }else {
                        System.out.println("Таких сезонів не існує");
                    }
                    System.out.println("/* ====== BREAK ===== */");
                    break;

                }
                case "3" : {
                    System.out.println("Введіть назву місяця, щоб отримат інші місяці з однакою кількістю днів: ");
                    str = menu.nextLine();

                    if (Months.hasMonth(str)) {

                        System.out.println("Місяці, які мають таку саму кількість дні: ");
                        Months month = Months.valueOf(str.toUpperCase());
                        for (Months m : months) {
                            if (m.getDay() == month.getDay())
                                System.out.println(m);
                        }
                    } else
                        System.out.println("Щодо такого місяця даних немає");

                    System.out.println("/* ====== BREAK ===== */");
                    break;
                }
                case "4" : {
                    System.out.println("Введіть назву місяця, щоб отримати місяці з меншою кількістю днів: ");
                    str = menu.nextLine();

                    if (Months.hasMonth(str)) {
                        System.out.println("Місяці, які мають меншу кількість днів: ");
                        Months month = Months.valueOf(str.toUpperCase());
                        for (Months m : months) {
                            if (m.getDay() < month.getDay())
                                System.out.println(m);
                        }
                    } else
                        System.out.println("Про це даних немає");

                    System.out.println("/* ====== BREAK ===== */");
                    break;
                }
                case "5" : {
                    System.out.println("Введіть назву місяця і Ви отримаєте інші місяці з більшою кількістю днів: ");
                    str = menu.nextLine();

                    if (months.contains(str)) {

                        System.out.println("Mісяці, які мають більшу кількість днів: ");
                        Months month = Months.valueOf(str.toUpperCase());

                        for (Months m : months) {
                            if (m.getDay() > month.getDay())
                                System.out.println(m);

                        }

                    } else {
                        System.out.println("Про це даних немає");
                    }

                    System.out.println("/* ====== BREAK ===== */");
                    break;
                }
                case "6": {
                    System.out.println("Введіть назву пори року, щоб дізнатись, яка буде наступна: ");
                    str = menu.nextLine();

                    if (Months.hasSeason(str)) {
                        System.out.println(Seasons.values()[(Seasons.valueOf(str.toUpperCase()).ordinal() + 1) % 4]);
                    } else
                        System.out.println("Такого сезону немає");

                    System.out.println("/* ====== BREAK ===== */");
                    break;
                }
                case "7": {
                    System.out.println("Введіть назву сезону: ");
                    str = menu.nextLine();

                    if (Months.hasSeason(str)) {
                        int ord = Seasons.valueOf(str.toUpperCase()).ordinal() - 1;
                        System.out.println(Seasons.values()[ord < 0 ? 3 : ord]);
                    } else
                        System.out.println("Такого сезону немає");
                    System.out.println("/* ====== BREAK ===== */");
                    break;
                }
                case "8": {
                    System.out.println("Місяці які мають парну кількість днів: ");
                    for (Months m : months) {
                        if (m.getDay() % 2 == 0)
                            System.out.println(m);

                    }
                    System.out.println("/* ====== BREAK ===== */");
                    break;
                }
                case "9": {
                    System.out.println("Місяці які мають непарну кількість днів: ");
                    for (Months m : months) {
                        if (m.getDay() % 2 != 0)
                            System.out.println(m);

                    }
                    System.out.println("/* ====== BREAK ===== */");
                    break;
                }
                case "10": {
                    System.out.println("Введіть назву місяця щоб дізнатись чи має він парну кількість днів: ");
                    str = menu.nextLine();

                    if (Months.hasMonth(str)) {
                        Months month = Months.valueOf(str.toUpperCase());;
                        System.out.print(month + " - ");
                        if (month.getDay() % 2 == 0)
                            System.out.println("місяць, який має парну кількість днів");
                        else
                            System.out.println(" місяць, який має непарну кількість днів");

                    } else
                        System.out.println("Про це даних немає");
                    System.out.println("/* ====== BREAK ===== */");
                    break;
                }
                case "11": {
                    state = false;
                    System.out.print("Thank you!");
                    System.exit(0);
                }
            }
        }

    }
}
