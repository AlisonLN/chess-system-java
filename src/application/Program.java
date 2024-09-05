package application;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Chessposition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ChessMatch  chessMatch = new ChessMatch();

            while (true) {
                try {
                    UI.clearScreen();
                    UI.printBoard(chessMatch.getPieces());
                    System.out.println();
                    System.out.print("Source : ");
                    Chessposition source = UI.readChessPosition(sc);

                    System.out.println();
                    System.out.print("Target : ");
                    Chessposition target = UI.readChessPosition(sc);

                    ChessPiece capturedPiece = chessMatch.performChesMove(source, target);
                }
                catch (ChessException e) {
                    System.out.println(e.getMessage());
                    sc.nextLine();
                }
                catch (InputMismatchException e ) {
                    System.out.println(e.getMessage());
                    sc.nextLine();
                }

            }
    }
}