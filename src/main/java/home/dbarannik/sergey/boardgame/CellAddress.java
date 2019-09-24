package home.dbarannik.sergey.boardgame;

public class CellAddress {
    protected int cellAddressX;
    protected int cellAddressY;
    protected final static int cellAddressXMin = 0;
    protected final static int cellAddressXMax = 7;
    protected final static int cellAddressYMin = 0;
    protected final static int cellAddressYMax = 7;

    public CellAddress(int cellAddressX, int cellAddressY) {
        this.cellAddressX = cellAddressX;
        this.cellAddressY = cellAddressY;

    }

    public CellAddress setCellAddress(int newCellAddressX, int newCellAddressY) {
        this.cellAddressX = Math.max(cellAddressXMin, Math.min(newCellAddressX, cellAddressXMax));
        this.cellAddressY = Math.max(cellAddressYMin, Math.min(newCellAddressY, cellAddressYMax));
        return this;
    }

    @Override
    public String toString() {
        return "cellAddressX = " + cellAddressX + " cellAddressY = " + cellAddressY;
    }
}