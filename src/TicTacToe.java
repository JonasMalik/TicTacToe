import java.util.Scanner;

/**
 * Created by jonas on 2015-08-27.
 */
public class TicTacToe {
    public static void main(String[] args) {

        String player1 = "";
        String player2 = "";

        boolean win = false;
        int place;


        Scanner keybord = new Scanner(System.in);

        Functions.MainMenu();

        //System.out.print("Name player 1: ");
        //player1 = keybord.next();

        //System.out.print("Name player 2: ");
        //player2 = keybord.next();

        System.out.println("\n\n" + player1 + " VS " + player2 + "\nLET THE GAME BEGIN!");
        System.out.print("+----------+----------+----------+\n" + Grafic.row1);
        System.out.print("+----------+----------+----------+\n" + Grafic.row2);
        System.out.print("+----------+----------+----------+\n" + Grafic.row3 + "+----------+----------+----------+\n");


       // while (win == false) {



            //*************************** Vilken ruta *****************************
            /*if (place == 1 && whoIsIt == 1){
                one = 1;
            }
            else if (place == 1 && whoIsIt == 0){
                one = 2;
            }
            else if (place == 2 && whoIsIt == 1){
                two = 1;
            }
            else if (place == 2 && whoIsIt == 0){
                two = 2;
            }

            else if (place == 3 && whoIsIt == 1){
                three = 1;
            }
            else if (place == 3 && whoIsIt == 0){
                three = 2;
            }
            else if (place == 4 && whoIsIt == 1){
                four = 1;
            }
            else if (place == 4 && whoIsIt == 0){
                four = 2;
            }
            else if (place == 5 && whoIsIt == 1){
                five = 1;
            }
            else if (place == 5 && whoIsIt == 0){
                five = 2;
            }

            else if (place == 6 && whoIsIt == 1){
                six = 1;
            }
            else if (place == 6 && whoIsIt == 0){
                six = 2;
            }
            else if (place == 7 && whoIsIt == 1){
                seven = 1;
            }
            else if (place == 7 && whoIsIt == 0){
                seven = 2;
            }
            else if (place == 8 && whoIsIt == 1){
                eight = 1;
            }
            else if (place == 8 && whoIsIt == 0){
                eight = 2;
            }

            else if (place == 9 && whoIsIt == 1){
                nine = 1;
            }
            else if (place == 9 && whoIsIt == 0){
                nine = 2;
            }
            */


            //**************************** Row 1 (O) ***********************************

           /*  if (one == 0 && two == 0 && three ==1 ){
                 Grafic.row1 = Grafic.t12o;
            }
             if (one == 0 && two == 1 && three ==0){
                 Grafic.row1 = Grafic.t1o3;
            }
             if (one == 1 && two == 0 && three ==0){
                 Grafic.row1 = Grafic.to23;
            }
             if (one == 1 && two == 1 && three ==0){
                 Grafic.row1 = Grafic.too3;
            }
             if (one == 0 && two == 1 && three ==1){
                 Grafic.row1 = Grafic.t1oo;
            }
             if (one == 1 && two == 0 && three ==1){
                 Grafic.row1 = Grafic.t1o3;
            }
             if (one == 1 && two == 1 && three ==1){
                 Grafic.row1 = Grafic.ooo;
            }


            //**************************** Row 1 (X) *********************************
            if (one == 0 && two == 0 && three ==2 ){
                Grafic.row1 = Grafic.t12x;
            }
            if (one == 0 && two == 2 && three ==0){
                Grafic.row1 = Grafic.t1x3;
            }
            if (one == 2 && two == 0 && three ==0){
                Grafic.row1 = Grafic.tx23;
            }
            if (one == 2 && two == 2 && three ==0){
                Grafic.row1 = Grafic.txx3;
            }
            if (one == 0 && two == 2 && three ==2){
                Grafic.row1 = Grafic.t1xx;
            }
            if (one == 2 && two == 0 && three ==2){
                Grafic.row1 = Grafic.tx2x;
            }
            if (one == 2 && two == 2 && three ==2){
                Grafic.row1 = Grafic.xxx;
            }

            //*************************** Row 1 (Blandat) *******************************
            if (one == 1 && two == 1 && three ==2 ){
                Grafic.row1 = Grafic.oox;
            }
            if (one == 0 && two == 1 && three ==2){
                Grafic.row1 = Grafic.t1ox;
            }
            if (one == 1 && two == 0 && three ==2){
                Grafic.row1 = Grafic.to2x;
            }
            if (one == 2 && two == 2 && three ==1){
                Grafic.row1 = Grafic.xxo;
            }
            if (one == 0 && two == 2 && three ==1){
                Grafic.row1 = Grafic.t1xo;
            }
            if (one == 2 && two == 0 && three ==1){
                Grafic.row1 = Grafic.tx2o;
            }
            if (one == 2 && two == 1 && three ==1){
                Grafic.row1 = Grafic.xoo;
            }
            if (one == 2 && two == 1 && three ==0 ){
                Grafic.row1 = Grafic.txo3;
            }
            if (one == 1 && two == 2 && three ==2){
                Grafic.row1 = Grafic.oxx;
            }
            if (one == 1 && two == 2 && three ==0){
                Grafic.row1 = Grafic.tox3;
            }
            if (one == 1 && two == 2 && three ==1){
                Grafic.row1 = Grafic.oxo;
            }
            if (one == 2 && two == 1 && three ==2){
                Grafic.row1 = Grafic.xox;
            }


            //**************************** Row 2 (O) ***********************************

            if (four == 0 && five == 0 && six ==1 ){
                Grafic.row2 = Grafic.t45o;
            }
            if (four == 0 && five == 1 && six ==0){
                Grafic.row2 = Grafic.t4o6;
            }
            if (four == 1 && five == 0 && six ==0){
                Grafic.row2 = Grafic.to56;
            }
            if (four == 1 && five == 1 && six ==0){
                Grafic.row2 = Grafic.too6;
            }
            if (four == 0 && five == 1 && six ==1){
                Grafic.row2 = Grafic.t4oo;
            }
            if (four == 1 && five == 0 && six ==1){
                Grafic.row1 = Grafic.t4o6;
            }
            if (four == 1 && five == 1 && six ==1){
                Grafic.row2 = Grafic.ooo;
            }


            //**************************** Row 2 (X) *********************************
            if (four == 0 && five == 0 && six ==2 ){
                Grafic.row2 = Grafic.t45x;
            }
            if (four == 0 && five == 2 && six ==0){
                Grafic.row2 = Grafic.t4x6;
            }
            if (four == 2 && five == 0 && six ==0){
                Grafic.row2 = Grafic.tx56;
            }
            if (four == 2 && five == 2 && six ==0){
                Grafic.row2 = Grafic.txx6;
            }
            if (four == 0 && five == 2 && six ==2){
                Grafic.row2 = Grafic.t4xx;
            }
            if (four == 2 && five == 0 && six ==2){
                Grafic.row2 = Grafic.tx5x;
            }
            if (four == 2 && five == 2 && six ==2){
                Grafic.row2 = Grafic.xxx;
            }

            //*************************** Row 2 (Blandat) *******************************
            if (four == 1 && five == 1 && six ==2 ){
                Grafic.row2 = Grafic.oox;
            }
            if (four == 0 && five == 1 && six ==2){
                Grafic.row2 = Grafic.t4ox;
            }
            if (four == 1 && five == 0 && six ==2){
                Grafic.row2 = Grafic.to5x;
            }
            if (four == 2 && five == 2 && six ==1){
                Grafic.row2 = Grafic.xxo;
            }
            if (four == 0 && five == 2 && six ==1){
                Grafic.row2 = Grafic.t4xo;
            }
            if (four == 2 && five == 0 && six ==1){
                Grafic.row2 = Grafic.tx5o;
            }
            if (four == 2 && five == 1 && six ==1){
                Grafic.row2 = Grafic.xoo;
            }
            if (four == 2 && five == 1 && six ==0 ){
                Grafic.row2 = Grafic.txo6;
            }
            if (four == 1 && five == 2 && six ==2){
                Grafic.row2 = Grafic.oxx;
            }
            if (four == 1 && five == 2 && six ==0){
                Grafic.row2 = Grafic.tox6;
            }
            if (four == 1 && five == 2 && six ==1){
                Grafic.row2 = Grafic.oxo;
            }
            if (four == 2 && five == 1 && six ==2){
                Grafic.row2 = Grafic.xox;
            }

            //**************************** Row 3 (O) ***********************************

            if (seven == 0 && eight == 0 && nine ==1 ){
                Grafic.row3 = Grafic.t78o;
            }
            if (seven == 0 && eight == 1 && nine ==0){
                Grafic.row3 = Grafic.t7o9;
            }
            if (seven == 1 && eight == 0 && nine ==0){
                Grafic.row3 = Grafic.to89;
            }
            if (seven == 1 && eight == 1 && nine ==0){
                Grafic.row3 = Grafic.too9;
            }
            if (seven == 0 && eight == 1 && nine ==1){
                Grafic.row3 = Grafic.t7oo;
            }
            if (seven == 1 && eight == 0 && nine ==1){
                Grafic.row1 = Grafic.t7o9;
            }
            if (seven == 1 && eight == 1 && nine ==1){
                Grafic.row3 = Grafic.ooo;
            }


            //**************************** Row 3 (X) *********************************
            if (seven == 0 && eight == 0 && nine ==2 ){
                Grafic.row3 = Grafic.t78x;
            }
            if (seven == 0 && eight == 2 && nine ==0){
                Grafic.row3 = Grafic.t7x9;
            }
            if (seven == 2 && eight == 0 && nine ==0){
                Grafic.row3 = Grafic.tx89;
            }
            if (seven == 2 && eight == 2 && nine ==0){
                Grafic.row3 = Grafic.txx9;
            }
            if (seven == 0 && eight == 2 && nine ==2){
                Grafic.row3 = Grafic.t7xx;
            }
            if (seven == 2 && eight == 0 && nine ==2){
                Grafic.row3 = Grafic.tx8x;
            }
            if (seven == 2 && eight == 2 && nine ==2){
                Grafic.row3 = Grafic.xxx;
            }

            //*************************** Row 3 (Blandat) *******************************
            if (seven == 1 && eight == 1 && nine ==2 ){
                Grafic.row3 = Grafic.oox;
            }
            if (seven == 0 && eight == 1 && nine ==2){
                Grafic.row3 = Grafic.t7ox;
            }
            if (seven == 1 && eight == 0 && nine ==2){
                Grafic.row3 = Grafic.to8x;
            }
            if (seven == 2 && eight == 2 && nine ==1){
                Grafic.row3 = Grafic.xxo;
            }
            if (seven == 0 && eight == 2 && nine ==1){
                Grafic.row3 = Grafic.t7xo;
            }
            if (seven == 2 && eight == 0 && nine ==1){
                Grafic.row3 = Grafic.tx8o;
            }
            if (seven == 2 && eight == 1 && nine ==1){
                Grafic.row3 = Grafic.xoo;
            }
            if (seven == 2 && eight == 1 && nine ==0 ){
                Grafic.row3 = Grafic.txo9;
            }
            if (seven == 1 && eight == 2 && nine ==2){
                Grafic.row3 = Grafic.oxx;
            }
            if (seven == 1 && eight == 2 && nine ==0){
                Grafic.row3 = Grafic.tox9;
            }
            if (seven == 1 && eight == 2 && nine ==1){
                Grafic.row3 = Grafic.oxo;
            }
            if (seven == 2 && eight == 1 && nine ==2){
                Grafic.row3 = Grafic.xox;
            }



            System.out.print("+----------+----------+----------+\n" + Grafic.row1);
            System.out.print("+----------+----------+----------+\n" + Grafic.row2);
            System.out.print("+----------+----------+----------+\n" + Grafic.row3 + "+----------+----------+----------+\n");

            if (one == 1 && two == 1 && three == 1 ||
                    four == 1 && five == 1 && six == 1 ||
                    seven == 1 && eight == 1 && nine == 1||
                    one == 1 && four == 1 && seven == 1 ||
                    two == 1 && five == 1 && eight == 1 ||
                    three == 1 && six == 1 && nine == 1 ||
                    one == 1 && five == 1 && nine == 1 ||
                    three == 1 && five == 1 && seven == 1){
                System.out.println("player 1 vann !");
            }
            if (one == 2 && two == 2 && three == 2 ||
                    four == 2 && five == 2 && six == 2 ||
                    seven == 2 && eight == 2 && nine == 2 ||
                    one == 2 && four == 2 && seven == 2 ||
                    two == 2 && five == 2 && eight == 2 ||
                    three == 2 && six == 2 && nine == 2 ||
                    one == 2 && five == 2 && nine == 2 ||
                    three == 2 && five == 2 && seven == 2){
                System.out.println("player 2 vann !");
            }*/
        }
    }
        //}
