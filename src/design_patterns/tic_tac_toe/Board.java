package design_patterns.tic_tac_toe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Board {
    int[][] board;
    List<User> userList = new ArrayList<>();
    public Board(int no){
        board = new int[no][no];
        printBoard(no);
        initilizeUser();
    }

    private void initilizeUser() {
        HashMap<Piece, Boolean> hashMap = new HashMap<Piece, Boolean>();

        for(int i =0; i<2; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter user name");
            String userName = sc.next();
            System.out.println("Please Enter user symbole from X or O");
            String symbole = sc.next();
            // before check it will first check whether the symbole is already used or not
            hashMap.forEach((key, value) -> {
                if(symbole.equalsIgnoreCase(key.toString())){
                    System.out.println("Please try again, Symbole is already used");
                    return;
                }
            });
            if(symbole.equalsIgnoreCase(Piece.O.toString())){
                hashMap.put(Piece.O, true);
                userList.add(new User(userName, Piece.O));
            } else if (symbole.equalsIgnoreCase(Piece.X.toString())) {
                hashMap.put(Piece.X, true);
                userList.add(new User(userName, Piece.X));
            }
        }

    }

    public void printBoard(int no){
        int[][] gameBoard = new int[no][no];
        int count = 0;
        for(int i=0; i< 3; i++){
            for(int j =0; j<3; j++){
                System.out.print( "*" +" | ");
                count+=1;
            }
            System.out.println();
        }
    }

    public void startGame(){
        List<User> listUser = new ArrayList<>();
        boolean isOver = true;
        while (isOver){

        }
    }
}
