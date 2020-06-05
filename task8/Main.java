package task8;

import java.util.Scanner;

import static task8.Calendar.hasMonth;
import static task8.Calendar.hasSeason;
import static task8.Calendar.showAction;

public class Main {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        String str;


        Calendar.Months[] months = Calendar.Months.values();

        while(true) {
            showAction();
            str = scanner.nextLine();
            switch (str){
                case "1": {
                    System.out.println("Введіть назву місяця: ");
                    str = scanner.nextLine();

                    if (hasMonth(str))
                        System.out.println("Такий місяць існує");
                    else
                        System.out.println("Дані про такий місяць відсутні або введіть англійською");

                    break;
                }
                case "2": {
                    System.out.println("Введіть назву пори року,щоб отримати її місяці : ");
                    str = scanner.nextLine();

                    if (hasSeason(str)) {
                        for (Calendar.Months month : Calendar.Months.values()) {
                            if (month.getSeason().name().equalsIgnoreCase(str))
                                System.out.println(month);
                        }
                    } else
                        System.out.println("Таких сезонів не існує");
                    System.out.println("/* ====== BREAK ===== */");
                    break;
                }
                case "3": {
                    System.out.println("Введіть назву місяця і Ви отримаєте інші місяці з однакою кількістю днів: ");
                    str = scanner.nextLine();

                    if (hasMonth(str)) {
                        System.out.println("Місяці, які мають таку саму кількість дні: ");
                        Calendar.Months month = Calendar.Months.valueOf(str.toUpperCase());
                        for (Calendar.Months m : Calendar.Months.values()) {
                            if (m.getDay() == month.getDay())
                                System.out.println(m);
                        }
                    } else
                        System.out.println("Щодо такого місяця даних немає");
                    System.out.println("/* ====== BREAK ===== */");
                    break;
                }
                case "4": {
                    System.out.println("Введіть назву місяця і Ви отримаєте інші місяці з меншою кількістю днів: ");
                    str = scanner.nextLine();

                    if (hasMonth(str)) {
                        System.out.println("Місяці, які мають меншу кількість днів: ");
                        Calendar.Months month = Calendar.Months.valueOf(str.toUpperCase());
                        for (Calendar.Months m : Calendar.Months.values()) {
                            if (m.getDay() < month.getDay())
                                System.out.println(m);
                        }
                    } else
                        System.out.println("Про це даних немає");
                    System.out.println("/* ====== BREAK ===== */");
                    break;
                }
                case "5": {
                    System.out.println("Введіть назву місяця і Ви отримаєте інші місяці з більшою кількістю днів: ");
                    str = scanner.nextLine();

                    if (hasMonth(str)) {
                        System.out.println("Mісяці, які мають більшу кількість днів: ");
                        Calendar.Months month = Calendar.Months.valueOf(str.toUpperCase());
                        for (Calendar.Months m : Calendar.Months.values()) {
                            if (m.getDay() > month.getDay())
                                System.out.println(m);

                        }

                    } else
                        System.out.println("Про це даних немає");
                    System.out.println("/* ====== BREAK ===== */");
                    break;
                }
                case "6": {
                    System.out.println("Введіть назву пори року, щоб дізнатись, яка буде наступна: ");
                    str = scanner.nextLine();

                    if (hasSeason(str)) {
                        System.out.println(Calendar.Seasons.values()[(Calendar.Seasons.valueOf(str.toUpperCase()).ordinal() + 1) % 4]);
                    } else
                        System.out.println("Такого сезону немає");
                    System.out.println("/* ====== BREAK ===== */");
                    break;
                }
                case "7": {
                    System.out.println("Введіть назву сезону: ");
                    str = scanner.nextLine();

                    if (hasSeason(str)) {
                        int ord = Calendar.Seasons.valueOf(str.toUpperCase()).ordinal() - 1;
                        System.out.println(Calendar.Seasons.values()[ord < 0 ? 3 : ord]);
                    } else
                        System.out.println("Такого сезону немає");
                    System.out.println("/* ====== BREAK ===== */");
                    break;
                }
                case "8": {
                    System.out.println("Місяці які мають парну кількість днів: ");
                    for (Calendar.Months month : months) {
                        if (month.getDay() % 2 == 0)
                            System.out.println(month);

                    }
                    System.out.println("/* ====== BREAK ===== */");
                    break;
                }
                case "9": {
                    System.out.println("Місяці які мають непарну кількість днів: ");
                    for (Calendar.Months month : months) {
                        if (month.getDay() % 2 != 0)
                            System.out.println(month);

                    }
                    System.out.println("/* ====== BREAK ===== */");
                    break;
                }
                case "10": {
                    System.out.println("Введіть назву місяця щоб дізнатись чи має він парну кількість днів: ");
                    str = scanner.nextLine();

                    if (hasMonth(str)) {
                        Calendar.Months month = Calendar.Months.valueOf(str.toUpperCase());
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

            }
        }
    }
}
