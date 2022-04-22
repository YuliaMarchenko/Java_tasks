package com.company;

public class Main {

    public static void main(String[] args) {

	/* Дана строка, состоящая из слов, разделенных пробелом "aaa BBBB dEfxc"
	написать метод, позволяющий изменять слова в строке следующим образом:
	при длине слова =3 , изменить все буквы этого слова на заглавные
	при длине слова =4 , изменить все буквы этого слова на строчные
	при длине слова =5 , изменить все буквы слова на звездочки
	и возвращающий измененную строку
	пример: дана строка "aaa BBBB dEfxc"
	при длине слова =3 , изменить все буквы слова на заглавные -> "AAA BBBB dEfxc"
	при длине слова =4 , изменить все буквы слова на строчные -> "AAA BBBB dEfxc"
	public static String transform (String str, XXX) */

        String str = "aaa BBBB dEfxc bbbbb nnn";
        System.out.println(transform(str,new ChangeWith3()));
        System.out.println(transform(str,new ChangeWith4()));
        System.out.println(transform(str,new ChangeWith5()));
    }

    public static String transform (String str, ChangeString transformation){
        return transformation.getNewStr(str);
    }
}
