package com.denysov.miner.geometry.polyhedra;

import javafx.scene.shape.MeshView;



public class TriangleCellData {

    private final MeshView mesh;
    private final boolean up;
    private final int row;
    private final int col;

    private final Vec3 a;
    private final Vec3 b;
    private final Vec3 c;

    public TriangleCellData(MeshView mesh, boolean up, int row, int col, Vec3 a, Vec3 b, Vec3 c) {
        this.mesh = mesh;
        this.up = up;
        this.row = row;
        this.col = col;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public MeshView getMesh() {
        return mesh;
    }

    public boolean isUp() {
        return up;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Vec3 getA() {
        return a;
    }

    public Vec3 getB() {
        return b;
    }

    public Vec3 getC() {
        return c;
    }
}