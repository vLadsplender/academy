package by.academy.homework1;

import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        System.out.print("Введите тип данных: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        switch (str) {
           
        		case "int":
                System.out.print("Введите значение переменной типа int: ");
                if(sc.hasNextInt()) {
                    int var1 = sc.nextInt();
                    int result1 = var1 % 2;
                    System.out.println("Остаток от деления на 2 переменной " + var1 + " равен " + result1);
                } else {
                    System.out.println("Incorrect type value. Int type value is required");
                }
                break;
                
        		case "double":
                System.out.print("Введите значение переменной типа double: ");
                if(sc.hasNextDouble()) {
                    double var2 = sc.nextDouble();
                    double result2 = var2 * 0.7;
                    System.out.println("70% от числа " + var2 + " равно " + result2);
                } else{
                    System.out.println("Incorrect type value. Double type value is required");
                }
                break;
                
        		case "float":
                System.out.print("Введите значение переменной типа float: ");
                if (sc.hasNextFloat()) {
                  float var3 = sc.nextFloat();
                  double result3 = var3 * var3;
                  System.out.println(var3 + " в квадрате равно " + result3);
                } else {
                  System.out.println("Incorrect type value. Float type value is required");
                }
                break;
                
        		case "String":
                System.out.print("Введите значение переменной типа String: ");
                    String var4 = sc.nextLine();
                    System.out.println("Hello " + var4);
                break;
                
        		case "char":
                System.out.print("Введите значение переменной: ");
                String var5 = sc.nextLine();
                System.out.println("Код символа " + var5.charAt(0) + " соответствует коду " + (int)(var5.charAt(0)));
                break;
                
        		default:
                System.out.println("Unsupported type");
                break;
        }
        }
    }