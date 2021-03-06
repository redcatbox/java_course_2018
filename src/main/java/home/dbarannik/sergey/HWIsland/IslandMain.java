package home.dbarannik.sergey.HWIsland;

public class IslandMain {
    public static void main(String[] args) {
        int[][] worldMap = new int[][]{
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };

        Island island = new Island(worldMap);
        System.out.println("Island perimeter = " + island.getPerimeter());
        System.out.println("Island square = " + island.getSquare());
    }
}
