/* Капырина Алина Андреевна, ЗИТ-21
 * номер зач.книжки: 21-674.
 * Практическая работа №1. Задание 1. 
 
 * Реализовать программу, получающую на вход в качестве аргумента имя человека 
 * и выводящую “Hello ” + имя, в противном случае, 
 * если параметр не передавался, “Hello world”.
 
 */
 
public class practic1_1 {
	public static void main(String []name) {
		if (name.length > 0) {
			System.out.println("Hello, " + name[0] + "!"); /* сообщение пользователю */
      } else {
			System.out.println("Hello world"); /* сообщение пользователю */
	}
	}
}
