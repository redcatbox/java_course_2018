package home.dbarannik.sergey.boardgame;

public class Pawn {
    protected CellAddress address;

    public Pawn(int cellX, int cellY) {
        address = new CellAddress(cellX, cellY);
    }

    public void followPath(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            makeTurn(c[i]);
        }
    }

    public void makeTurn(char turn) {
        switch (turn) {
            case 'U':
                address.setCellAddress(address.cellAddressX, address.cellAddressY + 1);
                break;
            case 'D':
                address.setCellAddress(address.cellAddressX, address.cellAddressY - 1);
                break;
            case 'L':
                address.setCellAddress(address.cellAddressX - 1, address.cellAddressY);
                break;
            case 'R':
                address.setCellAddress(address.cellAddressX + 1, address.cellAddressY);
                break;
        }
    }
}
