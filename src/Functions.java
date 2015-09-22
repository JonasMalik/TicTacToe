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
    static String player1;
    static String player2;


    static void MainMenu(){

         byte menuChoise;


         System.out.print(Grafic.mainMenu);
         System.out.print("\nPlease type the number of game alternative you want to play: ");
         menuChoise = keybord.nextByte();

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

        boolean isPlayAgain = true;

        System.out.print("Name player 1: ");
        player1 = keybord.next();
        player2 = "Computer";

        ClearScreen();
        System.out.println("Let the game begin!\n"+player1+"  VS  "+player2);
    }

    static void PlayerVsPlayer(){

        boolean isPlayAgain = true;

        System.out.print("Name player 1: ");
        player1 = keybord.next();
        System.out.print("Name player 2: ");
        player2 = keybord.next();

        ClearScreen();
        System.out.println("Let the game begin!\n" + player1 + "  VS  " + player2);

    }

    static void Points(){

        System.out.println("points");
    }

    static void Exit(){

        int i = 0;

        ClearScreen();
        System.out.println("Thanks for playing!\nCreated by Jonas Malik");

        while (i != 5){
            System.out.println("\n");
            i++;
        }
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
