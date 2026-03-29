import java.sql.SQLOutput;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("\n Задача 1");
        // Создаем входной массив (5 выплат)
        int[] inputArray1 = {254670, 161900, 273560, 164500, 181200};
        // Создаем выходной массив
        // нужно 4 числа:[сумма, макс, мин, среднее] Значит, размер массива = 4
        double[] outputArray1 = new double[4];
        // Переменные для расчетов
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];
        // Считаем сумму, максимум и минимум в одном цикле
        for (int i = 0; i < inputArray1.length; i++) {
            sum = sum + inputArray1[i]; // общая сумма выплат
            if (inputArray1[i] > max) max = inputArray1[i]; // максимальная выплата
            if (inputArray1[i] < min) min = inputArray1[i]; // минимальная выплата
        }
        double average = sum / inputArray1.length; // средняя выплата
        //Записываем результаты в outputArray1 по порядку
        outputArray1[0] = sum;
        outputArray1[1] = max;
        outputArray1[2] = min;
        outputArray1[3] = average;
        // вывод для наглядности (необязателен в задаче)
        System.out.println("Сумма " + sum);
        System.out.println("Максимальная выплата за месяц " + max);
        System.out.println("Минимальная выплата за месяц " + min);
        System.out.println("Средняя выплата за месяц " + average);
        // Выводим inputArray1
        System.out.println("Input: " + Arrays.toString(inputArray1));
        System.out.println("Output: " + Arrays.toString(outputArray1));


        System.out.println("\n Задача 2");
        // Создаем входной массив
        int[] inputArray2 = {89400, 94009, 76900, 64547, 93300};
        // Создаем выходной массив
        double[] outputArray2 = new double[5];
        double tax = 0; // Объявляем переменную "налога"
        for (int i = 0; i < inputArray2.length; i++) {
            tax = inputArray2[i] * 0.13; // Вычисляем 13%
            outputArray2[i] = tax; //Записываем результат в ячейку массива
        }
        System.out.println("Input: " + Arrays.toString(inputArray2));
        System.out.println("Output: " +Arrays.toString(outputArray2));


        System.out.println("\n Задача 3");
        int[] inputArray3 = {2500, 5700, 3400, 6100, 7700}; // Входной массив
        boolean[] outputArray3 = new boolean[5];  // Выходной массив
        // Запускаем проверку в цикле
        for (int i = 0; i < inputArray3.length; i++) {
            if (inputArray3[i] > 5000) {
                outputArray3[i] = true; // В остальных случая будет false
            }
        }
        System.out.println("Input:  " + Arrays.toString(inputArray3));
        System.out.println("Output: " + Arrays.toString(outputArray3));


        System.out.println("\n Задача 4");
        // Входной массив
        int[] inputArray4 = {19500, 12000, -7400, 850, -940};
        // Выходной массив: 1 ячейка для одного boolean-результата
        boolean[] outputArray4 = new boolean[1];
        // Если нет просрочек - значит true
        boolean noOverdue = true;
        // Проверяем
        for (int balance : inputArray4) {
            // Если баланс хоть раз был отрицательным - false и выходим из цикла
            if (balance <= 0) {
                noOverdue = false;
             break;
             }
        }
        outputArray4[0] = noOverdue; // Записываем результат в ячейку
        // Вывщд в консоль
        System.out.println("Input: " + Arrays.toString(inputArray4));
        System.out.println("Output: " + Arrays.toString(outputArray4));


        System.out.println("\n Задача 5");
        // Входной массив
        int[] inputArray5 = {490000, -14500, 840300, 975400, -23200};
        // Выходной массив: 1 ячейка для одного boolean-результата
        int[] outputArray5 = new int[1];
        // Переменная счетчика (считаем сколько мес с положительной прибылью)
        int count = 0;
        // Проверяем в цикле с помощью переменной прибыль
        for (int profit : inputArray5) {
            if (profit > 0 ){ // Если прибыль больше 0 - прибавляем в счетчик
                count++;
            }
            outputArray5[0] = count; // Записываем значение счетчика в ячейку массива
        }
        // Выводим резултат
        System.out.println("Input: " + Arrays.toString(inputArray5));
        System.out.println("Output: " + Arrays.toString(outputArray5));



    }
}