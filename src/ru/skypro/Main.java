package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задание 1

        byte clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию прилоения для Android по ссылке");
        }

        // Заание 2

        byte clientiOS = 1;
        int clientDeviceYear = 2014;
        if (clientiOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientiOS != 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для Android по ссылке");
        }


        // Задание 3

        int year = 2000;
        if (((year % 4 == 0) && ( year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }

        // Задание 4
        int deliveryDistance = 95;
        int timeDelivery = 1;
        int timeDelivery2 = timeDelivery +1;
        int timeDelivery3 = timeDelivery2 +1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней " + timeDelivery);
        }
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней " + timeDelivery2);
        }
        if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней " + timeDelivery3);
        }

        // Задание 5

        int monthNumber = 13;

        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
        }

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }




        }
    }

