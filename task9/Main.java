package task9;

import java.util.Scanner;

import static task9.Months.hasMonth;
import static task9.Months.hasSeason;
import static task9.Months.showAction;


public class Main {
    public static void main(String arg[]) throws WrongInputConsoleParametersException {
        Scanner scanner = new Scanner(System.in);
        String str;
        int num = 0;

        Months[] months = Months.values();


        while(true ){
            showAction();
            try{
                num = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
            if(num < 1 || num > 10){
                String mess = "Числа мають бути від 1 до 10";
                throw new WrongInputConsoleParametersException(mess);
            }
            switch (num){
                case 1: {
                    System.out.println("Введіть назву місяця: ");
                    str = scanner.nextLine();

                    if (hasMonth(str))
                        System.out.println("Такий місяць існує");
                    else
                        System.out.println("Дані про такий місяць відсутні або введіть англійською");

                    break;
                }
                case 2: {
                    System.out.println("Введіть назву пори року,щоб отримати її місяці : ");
                    str = scanner.nextLine();

                    if (hasSeason(str)) {
                        for (Months month : Months.values()) {
                            if (month.getSeason().name().equalsIgnoreCase(str))
                                System.out.println(month);
                        }
                    } else
                        System.out.println("Таких сезонів не існує");
                    System.out.println("/* ====== BREAK ===== */");
                    break;
                }
                case 3: {
                    System.out.println("Введіть назву місяця і Ви отримаєте інші місяці з однаковою кількістю днів: ");
                    str = scanner.nextLine();

                    if (hasMonth(str)) {
                        System.out.println("Місяці, які мають таку саму кількість дні: ");
                        Months month = Months.valueOf(str.toUpperCase());
                        for (Months m : Months.values()) {
                            if (m.getDay() == month.getDay())
                                System.out.println(m);
                        }
                    } else
                        System.out.println("Щодо такого місяця даних немає");
                    System.out.println("/* ====== BREAK ===== */");
                    break;
                }
                case 4: {
                    System.out.println("Введіть назву місяця і Ви отримаєте інші місяці з меншою кількістю днів: ");
                    str = scanner.nextLine();

                    if (hasMonth(str)) {
                        System.out.println("Місяці, які мають меншу кількість днів: ");
                        Months month = Months.valueOf(str.toUpperCase());
                        for (Months m : Months.values()) {
                            if (m.getDay() < month.getDay())
                                System.out.println(m);
                        }
                    } else
                        System.out.println("Про це даних немає");
                    System.out.println("/* ====== BREAK ===== */");
                    break;
                }
                case 5: {
                    System.out.println("Введіть назву місяця і Ви отримаєте інші місяці з більшою кількістю днів: ");
                    str = scanner.nextLine();

                    if (hasMonth(str)) {
                        System.out.println("Mісяці, які мають більшу кількість днів: ");
                        Months month = Months.valueOf(str.toUpperCase());
                        for (Months m : Months.values()) {
                            if (m.getDay() > month.getDay())
                                System.out.println(m);

                        }

                    } else
                        System.out.println("Про це даних немає");
                    System.out.println("/* ====== BREAK ===== */");
                    break;
                }
                case 6: {
                    System.out.println("Введіть назву пори року, щоб дізнатись, яка буде наступна: ");
                    str = scanner.nextLine();

                    if (hasSeason(str)) {
                        System.out.println(Seasons.values()[(Seasons.valueOf(str.toUpperCase()).ordinal() + 1) % 4]);
                    } else
                        System.out.println("Такого сезону немає");
                    System.out.println("/* ====== BREAK ===== */");
                    break;
                }
                case 7: {
                    System.out.println("Введіть назву сезону: ");
                    str = scanner.nextLine();

                    if (hasSeason(str)) {
                        int ord = Seasons.valueOf(str.toUpperCase()).ordinal() - 1;
                        System.out.println(Seasons.values()[ord < 0 ? 3 : ord]);
                    } else
                        System.out.println("Такого сезону немає");
                    System.out.println("/* ====== BREAK ===== */");
                    break;
                }
                case 8: {
                    System.out.println("Місяці які мають парну кількість днів: ");
                    for (Months month : months) {
                        if (month.getDay() % 2 == 0)
                            System.out.println(month);

                    }
                    System.out.println("/* ====== BREAK ===== */");
                    break;
                }
                case 9: {
                    System.out.println("Місяці які мають непарну кількість днів: ");
                    for (Months month : months) {
                        if (month.getDay() % 2 != 0)
                            System.out.println(month);

                    }
                    System.out.println("/* ====== BREAK ===== */");
                    break;
                }
                case 10: {
                    System.out.println("Введіть назву місяця щоб дізнатись чи має він парну кількість днів: ");
                    str = scanner.nextLine();

                    if (hasMonth(str)) {
                        Months month = Months.valueOf(str.toUpperCase());
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
