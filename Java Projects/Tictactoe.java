//this program plays out a tic tac toe game with two players
package tictactoe;

import java.util.Scanner;//import scanner

public class Tictactoe {//name of program
    
 static char[][] board = new char[17][17];//declare board and integers (rows and columns)
 static Scanner scnr = new Scanner(System.in);//declare scanner
 static int player = 1;//declare player
 
 
    public static void main(String[] args) {//main method to play the game
        printBoard();

        int num;
        
        while(true){//loop for every player
            System.out.println("Player " + player + ", pick a spot from 1-9 to place your marker");
            num = scnr.nextInt();
            if(validNum(num)){//valid input from 1-9
                char marker = (player==1) ?'X' :'0';//declare symbol based on player
                makeMove(num, marker);
            updatedBoard();
            if (winCheck()){//loop to scan every possible win move
                System.out.println("Player " + player + " wins!");
                break;
            }
            player = (player == 1) ?2 :1 ;//switch to player 2 once player 1 makes a valid move
            }
            else{
                System.out.println("Invalid number, please pick one from 1-9");//invalid number
            }          
            
        }
    }//main
    public static void makeMove(int num, char player){//method to place a symbol on specified place
        
        switch(num){//switch for every space on the board depending on what the player picks
            case 1 -> board[2][2]=player;
            case 2 -> board[2][8]=player;
            case 3 -> board[2][14]=player;
            case 4 -> board[8][2]=player;
            case 5 -> board[8][8]=player;
            case 6 -> board[8][14]=player;
            case 7 -> board[14][2]=player;
            case 8 -> board[14][8]=player;
            case 9 -> board[14][14]=player;
                            
        }
        
    } 
    public static boolean winCheck(){//method t check every possible combination
        
        for(int i=2; i<17 ; i+=6){
            //check row combinations
            if((board[i][2]=='X' && board[i][8]=='X' && board[i][14]=='X')||(board[i][2]=='0' && board[i][8]=='0' && board[i][14]=='0')){
                    return true;
        }
            //check column combinations
            if((board[2][i]=='X' && board[8][i]=='X' && board[14][i]=='X')||(board[2][i]=='0' && board[8][i]=='0' && board[14][i]=='0')){
                    return true;
        }
            //check diagonal combinations
            if((board[2][2]=='X' && board[8][8]=='X' && board[14][14]=='X')||(board[2][2]=='0' && board[8][8]=='0' && board[14][14]=='0')){
                    return true;
        }
            if((board[2][14]=='X' && board[8][8]=='X' && board[14][2]=='X')||(board[14][2]=='0' && board[8][8]=='0' && board[2][14]=='0')){
                    return true;
        }
    }
        return false;
    }
    
    public static boolean validNum(int num){//method to check if the input is valid, returns true or false
        return num>=1 && num<=9;
    }
    public static void updatedBoard(){//method to update the board when a move is made
        //print the board
        for (int row=0; row<17; row++)
        {
            for (int col=0; col<17; col++){
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }
    
        public static void printBoard() {//method to print original board at the beginning of the game
        //loop to make the spaces and the vertical/horizontal lines in the board
        for (int row=0; row<17; row++)
        {
            for ( int col=0; col<17; col++){
                board[row][col]='0';
                if(col==5 || col==11){
                board[row][col]='|';
                }
                else if(row==5 || row==11){
                board[row][col]='-';
                }
                else{
                    board[row][col]=' ';
                }
        }
        }
        //assign spaces with numbers
        board[2][2]='1';
        board[2][8]='2';
        board[2][14]='3';
        board[8][2]='4';
        board[8][8]='5';
        board[8][14]='6';
        board[14][2]='7';
        board[14][8]='8';
        board[14][14]='9';
        
        
        //print the board
        for (int row=0; row<17; row++)
        {
            for (int col=0; col<17; col++){
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
        
        }
        
    
    
}//class
