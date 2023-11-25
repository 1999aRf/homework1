public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        else System.out.println("Установите версию приложения для Android по ссылке");


        System.out.println("Задание 2");
        int clientOS1 = 0;
        int clientDeviceYear = 2012;
        if (clientOS1 == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
            else System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }
        else if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else System.out.println("Установите облегченную версию приложения для Android по ссылке");


        System.out.println("Задание 3");
        int year = 1584;
        if (year <= 1584) {
            System.out.println(year + " год не является високосным, так как високосные годы были введены после 1584 года.");
        }
        else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        }
        else System.out.println(year + " год не является високосным.");

        System.out.println("Задание 4");
        int deliveryDistance = 45;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }
        else System.out.println("Свыше 100 км доставки нет");


        System.out.println("Задание 5");
        int monthNumber = 10;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Этот месяц принадлежит к сезону Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлежит к сезону Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит к сезону Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлежит к сезону Осень.");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}