package com.denysov.miner.game;

import java.util.ArrayList;
import java.util.List;

public class Cell {

    private final int id;
    private boolean mine;
    private boolean revealed;
    private boolean flagged;
    private int neighborMines;

    private final List<Cell> neighbors = new ArrayList<>();

    public Cell(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public boolean isMine() {
        return mine;
    }

    public void setMine(boolean mine) {
        this.mine = mine;
    }

    public boolean isRevealed() {
        return revealed;
    }

    public void setRevealed(boolean revealed) {
        this.revealed = revealed;
    }

    public boolean isFlagged() {
        return flagged;
    }

    public void toggleFlag() {
        if (!revealed) {
            flagged = !flagged;
        }
    }

    public int getNeighborMines() {
        return neighborMines;
    }

    public void setNeighborMines(int neighborMines) {
        this.neighborMines = neighborMines;
    }

    public List<Cell> getNeighbors() {
        return neighbors;
    }

    public void addNeighbor(Cell neighbor) {
        neighbors.add(neighbor);
    }
}