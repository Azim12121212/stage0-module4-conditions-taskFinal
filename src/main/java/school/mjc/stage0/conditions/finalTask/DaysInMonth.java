package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public static void printDays(int year, int month) {
        if (year<0) {
            System.out.println("invalid date");
            return;
        }
        int leapYear = 0;
        int amountOfDays;

        if ((year%4==0 && year%100!=0) || (year%400==0)) {
            leapYear = 1;
        }

        amountOfDays = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                yield 31;
            }
            case 4, 6, 9, 11 -> {
                yield 30;
            }
            case 2 -> switch (leapYear) {
                case 1:
                    yield 29;
                default:
                    yield 28;
            };
            default -> -1;
        };

        if (amountOfDays == -1) {
            System.out.println("invalid date");
        } else {
            System.out.println(amountOfDays);
        }
    }
    public static void main(String[] args) {
        printDays(1222, 3);
    }
}
