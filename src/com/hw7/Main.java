package com.hw7;

public class Main
{

    public static void main(String[] args) {
       /* String phone = "+960-415 75-37";

        phone = phone.replace("-","");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон длинный!");
        }else if (phone.length() < 10) {
            throw new RuntimeException("Телефон короткий!");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Зарубеж");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604157537";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех!");
        } else {
            System.out.println("Неудача");
        }*/
////// Задание 1
        String firstName = "Василий";  //для хранения имени;
        String middleName = "Артёмович"; //для хранения отчества;
        String lastName = "Трёпкин" ;    //для хранения фамилии;
        String fullName = lastName + ' ' + firstName + ' ' + middleName;//для хранения Ф.И.О. сотрудника в формате "Фамилия Имя Отчество"
        //fullName = fullName.replace("ё", "е");
        System.out.println("\"ФИО сотрудника - " + fullName +".\"");
////// Задание 2
        System.out.println("\"Данные ФИО сотрудника для заполнения отчета —  " + fullName.toUpperCase() +".\"");
////// Задание 3
        fullName = fullName.replace("ё", "е");
        System.out.println("\"Данные ФИО сотрудника —  " + fullName + ".\"");



    }
}
