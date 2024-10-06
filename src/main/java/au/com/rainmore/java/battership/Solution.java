package au.com.rainmore.java.battership;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    private String [] board;

    public int[] solution(String[] B) {
        this.board = B;

        int countPatrolBoats = 0;
        int countSubmarines = 0;
        int countDestroyers = 0;

        Set<Cell> checkedCells = new HashSet<>();

        for (int row = 0; row < this.board.length; row++) {
            for (int col = 0; col < this.board[row].length(); col++) {
                Cell cell = new Cell(row, col);
                boolean isCellShip = isCellShip(cell);
                System.out.println(String.format("check %s, is ship cell %b", cell, isCellShip));
                if (!isCellShip) {
                    continue;
                }

                if (checkedCells.contains(cell)) {
                    continue;
                }

                Set<Cell> nextCells = getNextShipCells(cell);
                int childrenSize = nextCells.size();

                if (childrenSize == 0) {
                    countPatrolBoats++;
                    continue;
                }

                if (childrenSize > 1)  {
                    // middle cell or invalid cell doesn't need to be checked
                    continue;
                }

                Set<Cell> checkedNextCells = new HashSet<>();

                getNextPartCell(cell, nextCells, checkedNextCells);

                childrenSize = checkChildrenSize(cell);
                System.out.println(String.format("------------------%d", childrenSize));
                checkedCells.addAll(checkedNextCells);

                if (childrenSize == 1) {
                    countSubmarines++;
                }

                if (childrenSize == 2) {
                    countDestroyers++;
                }
            }
        }

        return new int[]{countPatrolBoats, countSubmarines, countDestroyers};
    }

    private int checkChildrenSize(Cell cell) {
        int result = 0;
        Cell check = cell;
        while (check.getNext() != null) {
            check = check.getNext();
            result++;
        }
        return result;
    }

    private void getNextPartCell(Cell cell, Set<Cell> nextCells, Set<Cell> cells) {
        nextCells.stream().filter(nextCell -> nextCell != null && !nextCell.equals(cell.prev))
                        .forEach(nextCell -> {
                            cell.setNext(nextCell);
                            nextCell.setPrev(cell);
                            cells.add(nextCell);
                            getNextPartCell(nextCell,  getNextShipCells(nextCell), cells);
                        });
    }

    private Set<Cell> getNextShipCells(Cell cell) {
        Cell leftCell = (cell.col - 1 < 0) ? null : new Cell(cell.row, cell.col - 1);
        Cell rightCell = (cell.col + 1 >= this.board[cell.row].length()) ? null : new Cell(cell.row, cell.col + 1);
        Cell topCell = (cell.row - 1 < 0) ? null : new Cell(cell.row - 1, cell.col);
        Cell bottomCell = (cell.row + 1 >= this.board.length) ? null : new Cell(cell.row + 1, cell.col);

        return Stream.of(leftCell, rightCell, topCell, bottomCell)
                .filter(this::isCellShip)
                .collect(Collectors.toSet());
    }

    private boolean isCellShip(Cell cell) {
        return cell != null && this.board[cell.row].charAt(cell.col) == '#';
    }

    private class Cell {

        private final int row;
        private final int col;

        private Cell prev;
        private Cell next;

        public Cell(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public int getRow() {
            return row;
        }

        public int getCol() {
            return col;
        }

        public Cell getPrev() {
            return prev;
        }

        public void setPrev(Cell prev) {
            this.prev = prev;
        }

        public Cell getNext() {
            return next;
        }

        public void setNext(Cell next) {
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cell cell = (Cell) o;
            return row == cell.row && col == cell.col;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, col);
        }

        @Override
        public String toString() {
            return "Cell{" +
                    "row=" + row +
                    ", col=" + col +
                    '}';
        }
    }

}
