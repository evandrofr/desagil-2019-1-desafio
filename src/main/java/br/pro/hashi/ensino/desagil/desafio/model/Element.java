package br.pro.hashi.ensino.desagil.desafio.model;

public class Element {
    protected int row;
    protected int col;
    protected String name;

    protected Element(int row, int col, String name) {
        this.row = row;
        this.col = col;
        this.name = name;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public String getName() {
        return name;
    }
}
