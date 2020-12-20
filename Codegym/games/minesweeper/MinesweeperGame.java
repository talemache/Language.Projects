package com.codegym.games.minesweeper;

import com.codegym.engine.cell.Color;
import com.codegym.engine.cell.Game;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;

    @Override
    public void initialize(){
        setScreenSize(SIDE, SIDE);
        createGame();
    } 
    
    private void createGame(){
        for(int y = 0; y < SIDE; ++y){
            for(int x = 0; x <SIDE; ++x){
                int randomNumber = getRandomNumber(10);
                boolean isMine = randomNumber < 1;
                
                if (isMine){
                    ++countMinesOnField;
                }
                gameField[y][x] = new GameObject(x, y);
                setCellColor(x, y, java.awt.Color.GRAY);
            }
        }
    }
    
}
