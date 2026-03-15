package com.denysov.miner.game;


import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public final class FloodFill {

    private FloodFill() {
    }

    public static void revealZeros(TriangleCell start) {
        Queue<TriangleCell> queue = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start.getId());

        while (!queue.isEmpty()) {
            TriangleCell current = queue.poll();

            for (TriangleCell neighbor : current.getNeighbors()) {
                if (!visited.add(neighbor.getId())) {
                    continue;
                }

                if (neighbor.isFlagged() || neighbor.isMine()) {
                    continue;
                }

                neighbor.setRevealed(true);

                if (neighbor.getNeighborMines() == 0) {
                    queue.add(neighbor);
                }
            }
        }
    }
}