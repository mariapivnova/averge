package com.company;

public class Main {

    public static void main(String[] args) {
	int[] array={4,2,7,13,54,23};
    int minvalue=array[0];
    for (int i=1;i<array.length;i++){
        if (array[i]<minvalue){
            minvalue=array[i];
        }
    }
        double average = 0;
        if (array.length > 0)
        {
            double summa = 0;
            for (int j = 0; j < array.length; j++) {
                summa += array[j];
            }
            average = summa / array.length;
        }
         double sum=minvalue+average;
    System.out.println("Минимальный элемент:"+ minvalue);
        System.out.println("Среднее арифметическое:"+average);
        System.out.println("Сумма минимального элемента и среднего арифметического:"+sum);
    }
}
