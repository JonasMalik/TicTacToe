import java.util.Scanner;

/**
 * Created by jonas on 2015-09-20.
 */
public class Functions {

    static Scanner keybord = new Scanner(System.in);
    static int[][] board = { {5,5,5},
                             {5,5,5},
                             {5,5,5}};
    static int  turn;


    static void MainMenu(){

         int menuChoise;


         System.out.print(Grafic.mainMenu);
         menuChoise = keybord.nextInt();

         switch (menuChoise){
             case 1: PlayerVsComputer();
                 break;
             case 2: PlayerVsPlayer();
                 break;
             case 3: Points();
                 break;
             case 4: Exit();
                 break;
             default: System.out.println("Please try again! (only one number)");
                 break;
         }
    }

    static void PlayerVsComputer(){
        System.out.println("pvc");
    }

    static void PlayerVsPlayer(){
        String player1;
        String player2;
        boolean isPlayAgain = true;

        System.out.print("Name player 1: ");
        player1 = keybord.next();
        System.out.print("Name player 2: ");
        player2 = keybord.next();

        while (isPlayAgain == true){
            ClearScreen();
            System.out.println("hej");
            isPlayAgain = false;

        }

    }

    static void Points(){
        System.out.println("points");
    }

    static void Exit(){
        System.out.println("Exit");
    }

    static void WhoseTurn(){

        int whoIsIt;
        int place;
        int arrayRow;
        int arrayColum;


        place = keybord.nextInt();
        whoIsIt = turn % 2;
        turn = turn + 1;


        if (place <= 3){
            arrayRow = 0;
            arrayColum = place - 1;
            board[arrayRow][arrayColum] = whoIsIt;
            System.out.println(board[arrayRow][arrayColum]);
        }
        else if (place <= 6){
            arrayRow = 1;
            arrayColum = place - 4;
            board[arrayRow][arrayColum] = whoIsIt;
            System.out.println(board[arrayRow][arrayColum]);
        }
        else if (place <=9){
            arrayRow = 2;
            arrayColum = place - 7;
            board[arrayRow][arrayColum] = whoIsIt;
            System.out.println(board[arrayRow][arrayColum]);
        }
    }

    static void ClearScreen(){

        int i = 0;

        while (i != 50){
            System.out.println("\n");
            i++;
        }
    }
}
