package first_task;

import java.util.ArrayList;
import java.util.List;

public class FirstTask {
    static void numMult(float num, boolean expr){
        double res;
        if (expr)
            res = num * 1.5;
        else
            res = num * num;
        System.out.println(res);
    }

    static void daysOfWeek(int num){
        String res = "Please make sure you input right day number of week";
        String[] daysInWeek = new String[]{"Mon", "Tue", "Wen", "Thu", "Fri", "Weekend"};
        switch (num){
            case 1: res = daysInWeek[0]; break;
            case 2: res = daysInWeek[1]; break;
            case 3: res = daysInWeek[2]; break;
            case 4: res = daysInWeek[3]; break;
            case 5: res = daysInWeek[4]; break;
            case 6:
            case 7:
                res = daysInWeek[5]; break;
        }
        System.out.println(res);
    }

    static void numbersDividedBy9(){
        int count = 0;
        List<Integer> numbersDividedBy9 = new ArrayList<>();
        while (count < 50){
            count++;
            if (count % 9 == 0)
                numbersDividedBy9.add(count);
        }
        System.out.print("list of numbers from 1 to 50 that can be divided by 9 without the remainder --> ");
        System.out.println("" + numbersDividedBy9);
    }

    static void factorial(int num){
        int result = 1;
        if (num < 0) System.out.println("Num is less than 0");
        else
            for(int i = 1; i<=num; i++)
                result *= i;
        System.out.println("factorial of " + num + " is " + result);
    }

    static void average(String[] numbers){
        System.out.println("average of 3 first arguments is " + ((Float.parseFloat(numbers[0]) +
                Float.parseFloat(numbers[1]) + Float.parseFloat(numbers[2])) / 3));
    }

    static void arrayOfElements(String[] args){
        Double[] array = new Double[]{0.0,0.0,0.0,0.0,0.0};
        for(int i = 0; i < array.length; i++) {
            System.out.print(args[i]);
            array[i] = Double.parseDouble(args[i]);
            String evenOrNot = array[i] % 2 == 0 ? "even" : "not even";
            String divByIndOrNot = i == 0 ? "division by 0" :
                    array[i] % i == 0 ? "divided by index without the remainder" :
                            "not divided by index without the remainder";
            System.out.println(" is " + evenOrNot + " and " + divByIndOrNot);
        }
    }

    static void main(String[] args){
        try {
            float num = Float.parseFloat(args[0]);
            boolean expr = num % 2.0 == 0;
            numMult(num, expr);
            daysOfWeek((int) num);
            numbersDividedBy9();
            factorial((int) num);
            try {
                average(args);
                arrayOfElements(args);
            } catch (IndexOutOfBoundsException e){
                System.out.println("please ensure you input correct number of arguments");
            }
        } catch(NumberFormatException e){
            System.out.println("please make sure that you pass a number as an argument");
        }
    }
}
