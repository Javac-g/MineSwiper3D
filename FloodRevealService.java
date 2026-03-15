package com.denysov.miner.game;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public final class FloodRevealService {

    private FloodRevealService() {
    }

    public static void revealZeros(GameBoard board, int startId) {
        Queue<Integer> queue = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(startId);
        visited.add(startId);

        while (!queue.isEmpty()) {
            int currentId = queue.poll();
            Cell current = board.getCell(currentId);

            for (int neighborId : board.getTopology().neighborsOf(currentId)) {
                if (!visited.add(neighborId)) {
                    continue;
                }

                Cell neighbor = board.getCell(neighborId);

                if (neighbor.isMine() || neighbor.isFlagged()) {
                    continue;
                }

                neighbor.setRevealed(true);

                if (neighbor.getNeighborMines() == 0) {
                    queue.add(neighborId);
                }
            }
        }
    }
}