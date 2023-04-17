import java.util.Scanner;

import static java.lang.System.exit;

public class MineSweeper {

    int row ;
    int col;
    String [][] gameTable;
    int constSweepNum  ;


    MineSweeper(int row, int col){
        this.col=col;
        this.row=row;
        this.gameTable = new String[row][col];
        this.constSweepNum = row *  col / 4;
    }


    String[][]  createTable(){
        int currentSweepNum = 0 ;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                int random = (int) (Math.random() + 0.5);
                //System.out.print(random);
                    if(random == 1 && currentSweepNum < constSweepNum){
                        gameTable[i][j] = " * ";
                        currentSweepNum++;
                    }else{
                       gameTable[i][j] = " - ";
                    }
            }
        }
        return gameTable;
    }

    void printTables(String[][] table){
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }

    public int checkTable(int rowNum, int colNum) {
        int count = 0;
        for (int i = Math.max(rowNum - 1, 0); i <= Math.min(rowNum + 1, row - 1); i++) {
            for (int j = Math.max(colNum - 1, 0); j <= Math.min(colNum + 1, col - 1); j++) {
                if (i == rowNum && j == colNum) {
                    continue;
                }
                if (gameTable[i][j].equals(" * ")) {
                    count++;
                }
            }
        }
        return count;
    }


    void run() {
        createTable();
        printTables(gameTable);
        System.out.println("-----------------");
        Scanner inp = new Scanner(System.in);
        int rowNum, colNum, right = 0;


        String[][] baseTable = new String[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                baseTable[i][j] = " - ";
            }
        }

        while (right < row * col - constSweepNum) {
            System.out.println("Please enter row");
            rowNum = inp.nextInt();
            System.out.println("Please enter col");
            colNum = inp.nextInt();

            if (rowNum >= row || rowNum < 0 || colNum >= col || colNum < 0) {
                System.out.println("Wrong value");
            } else {
                if (gameTable[rowNum][colNum] == " * ") {
                    System.out.println("LOSE!!!!");
                    printTables(gameTable);
                    System.exit(0);
                }

                int count = checkTable(rowNum, colNum);
                baseTable[rowNum][colNum] = " " + String.valueOf(count) + " ";
                printTables(baseTable);

                right++;

               }
        }
        System.out.println("WIN!!");
        printTables(gameTable);
    }

}
