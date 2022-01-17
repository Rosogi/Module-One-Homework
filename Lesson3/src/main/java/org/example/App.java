package org.example;


public class App
{
    public static void main( String[] args )
    {
        System.out.println("Задание №1");
        exampleOne();
        System.out.println("Задание №2");
        exampleTwo();
        System.out.println("Задание №3");
        exampleThree();
        System.out.println("Задание №4");
        exampleFour();
        System.out.println("Задание №5");
        int arr[] = exampleFive(6, 3);
        for (int i = 0; i < arr.length; i ++){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println("Задание №6");
        exampleSix();

    }

    private static void exampleOne(){
        int arr[] = new int[6];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 2);
        }

        for (int i = 0; i < arr.length; i ++){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                arr[i] = 1;
            }
            else {
                arr[i] = 0;
            }
        }

        for (int i = 0; i < arr.length; i ++){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

    }

    private static void exampleTwo(){
        int arr[] = new int[100];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }

        for (int i = 0; i < arr.length; i ++){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    private static void exampleThree(){
        int arr[] = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
        }

        for (int i = 0; i < arr.length; i ++){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

    }

    private static void exampleFour(){
        int arr[][] = new int[10][10];

        for (int i = 0; i < arr.length; i++){
            for (int x = 0; x < arr.length; x++){
                if (i == x && x == i){
                    arr [i][x] = 1;
                }
            }
        }
        int y = 0;
        for (int i = 0; i < arr.length; i++){
            for (int x = 0; x < arr.length; x++){
                arr[i][arr.length-i-1] = 1;
            }
        }
        System.out.println(arr[1][3]);
        for (int i = 0; i < arr.length; i++){
            for (int x = 0; x < arr.length; x++){
                System.out.print((arr[i][x]) + " ");
            }
            System.out.println("");
        }
    }

    private static int[] exampleFive(int len, int initialValue){
        int arr[] = new int[len];

        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }

        return arr;
    }

    private static void exampleSix(){
        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < arr.length; i ++){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        int minValue = arr[0];
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i ++){
            if (minValue > arr[i]){
                minValue = arr[i];
            }

            if (maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        System.out.println("Max is = " + maxValue + ", Min is = " + minValue);
    }

}