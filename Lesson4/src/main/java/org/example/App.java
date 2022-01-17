package org.example;

import java.util.Random;
import java.util.Scanner;

/**
 * Крестики-нолики в процедурном стиле
 */

public class App
{
    public static char gameField[][];
    public static int size = 3;
    public static int dotsToWin = 3;

    public static char emptyCell = '•';
    public static char playerCell = 'X';
    public static char computerCell = 'O';

    public static Scanner playerInput = new Scanner(System.in);

    public static Random random = new Random();

    public static void main( String[] args )
    {
        initGameField();
        showGameField();

        while (true){
            playerTurn();
            if (checkWin(playerCell)){
                System.out.println("Вы победили!");
                break;
            }
            if (isGameEnd()){
                System.out.println("Ничья!");
                break;
            }
            showGameField();
            computerTurn();
            if (checkWin(playerCell)){
                System.out.println("Выйграл компьютер :(");
                break;
            }
            if (isGameEnd()){
                System.out.println("Ничья!");
                break;
            }
            showGameField();
        }
        System.out.println("Игра закончена");

    }

    private static void initGameField(){
        gameField = new char[size][size];
        for (int i = 0; i < size; i++){
            for (int x = 0; x < size; x++){
                gameField[i][x] = emptyCell;
            }
        }
    }

    private static void showGameField(){
        for (int i = 0; i < gameField.length; i++){
            for (int x = 0; x < gameField.length; x++){
                System.out.print(gameField[i][x] + " ");
            }
            System.out.println("");
        }
    }

    private static void playerTurn(){
        int x, y;
        do {
            System.out.println("Введите кординаты хода в формате X и Y");
            y = playerInput.nextInt() - 1;
            x = playerInput.nextInt() - 1;
        } while(!isTurnValid(x, y));
        gameField[y][x] = playerCell;
    }

    private static void computerTurn(){
        int x , y;
        do {
            x = random.nextInt(size);
            y = random.nextInt(size);
        } while(!isTurnValid(x, y));
        System.out.println("Компьютер выбрал точку X = " + x + ", Y = " + y);
        gameField[y][x] = computerCell;
    }

    private static boolean isTurnValid(int x, int y){
        if (x > size || y > size || x < 0 || y < 0){
            return false;
        }
        if (gameField[y][x] == emptyCell){
            return true;
        }
        return false;
    }

    private static boolean checkWin(char symb){
        // Проверка горизонтальных линий
        boolean Win = false;
        for (int i = 0; i < gameField.length; i++){
            if (gameField[i][0] == symb && gameField[i][1] == symb && gameField[i][2] == symb){return true;}
        }
        // Проверка вертикальных линий
        for (int i = 0; i < gameField.length; i++){
            if (gameField[0][i] == symb && gameField[1][i] == symb && gameField[2][i] == symb){return true;}
        }
        // Проверка диагоналей
        if(gameField[0][0] == symb && gameField[1][1] == symb && gameField[2][2] == symb) return true;
        if(gameField[2][0] == symb && gameField[1][1] == symb && gameField[0][2] == symb) return true;
        return false;
    }

    private static boolean isGameEnd(){
        for (int i = 0; i < gameField.length; i++){
            for (int x = 0; x < gameField.length; x++){
                if (gameField[i][x] == emptyCell){
                    return false;
                }
            }
        }
        return true;
    }
}
