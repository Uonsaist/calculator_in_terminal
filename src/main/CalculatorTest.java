package main;

public class CalculatorTest  {
    public static void main(String[] args) {
        ReadClass readClass= new ReadClass();
        double one,two;
        int action;
        do {

            System.out.println("Введите превое число: ");
            one = readClass.readNextDouble();
            System.out.println("Введите второе число: ");
            two = readClass.readNextDouble();

            calculator calculator = new calculator(one, two);
            System.out.println("Выберите действие: ");
            System.out.println("1.Сложить");
            System.out.println("2.Вычесть");
            System.out.println("3.Умножить");
            System.out.println("4.Разделить");
            System.out.println("5.Взять остаток");
            System.out.println("0.Выход");

            action = (int) readClass.readNextDouble();
            switch (action) {
                case 1:
                    System.out.println(calculator.add());
                    break;
                case 2:
                    System.out.println(calculator.subs());
                    break;
                case 3:
                    System.out.println(calculator.multi());
                    break;
                case 4:
                    System.out.println(calculator.div());
                    break;
                case 5:
                    System.out.println(calculator.mod());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Вы ввели неверный пункт");
            }
        }while(action !=0);
    }
}
