package br.pro.hashi.ensino.desagil.desafio.model;

public abstract class Player extends Element {
    protected final Board board;

    protected Player(int row, int col,String name, Board board) {
        super(row, col, name);
        this.board = board;
    }

    protected void move(int rowShift, int colShift) {
        row += rowShift;
        col += colShift;
    }
}
