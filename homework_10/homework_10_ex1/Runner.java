package com.tms.homework_10.homework_10_ex1;

import java.util.Locale;

public class Runner {


    private static boolean isCorrectLoginAndPassword(String login, String password, String confirmPassword)throws WrongPasswordException,WrongLoginException {
       int numberOfDigits = 0;
        boolean rez=true;
        String letter;
        //Считает количество цифр в слове.
        for (int i = 0; i < 10; i++) {
            letter = String.valueOf(i);
            if (password.indexOf(letter) >=0) {
               numberOfDigits++;
            }
            }



//Проверяет длину логина, наличие пробелов в логине.
        if (login.length() >= 20 || login.contains(" ")) {
rez=false;

throw new WrongLoginException("Вы вышли за рамки размера логина или в логине имеются пробелы");
        }


//Проверяет длину пароля, наличие пробелов в пароле и наличие хотя бы 1 цифры.
        if (password.length() >= 20 || password.contains(" ") || numberOfDigits == 0) {
rez=false;

throw new WrongPasswordException("Размер введенного пароля больше 20 символов или в пароле имеются пробелы или в пароле нет цифр");
        }


        //Проверяет совпадает ли повторно введеный пароль с первоначальным паролем.
       if( password.equalsIgnoreCase(confirmPassword)) {
       }
        else{
               rez = false;
               throw new WrongPasswordException("Пароль повторно введен неверно ");
           }

return rez;
    }



        public static void main (String[] args) throws WrongLoginException, WrongPasswordException {

        if(isCorrectLoginAndPassword("asd", "dsacaxq1", "dsacaxq1")){
            System.out.println("Пользователь индифицирован.");
        }
        else {
            System.out.println("Не удалось индифицировать пользователя");
        }

        }
    }
