import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    private static final int TOP = 0;
    private final int bottom;
    private int size;
    private int openSitesCounter;
    private boolean[][] opened;
    private final WeightedQuickUnionUF quickUnionUF;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n){
        if (n <= 0){
            throw new IllegalArgumentException();
        }

        size             = n;
        bottom           = (size * size) + 1;
        opened           = new boolean[size][size]; // Creates a matrice with all the sites setted to false
        quickUnionUF     = new WeightedQuickUnionUF((size * size) + 2);
        openSitesCounter = 0;
    }

    public void open(int row, int col){
        if (row <= 0 || row > size || col <= 0 || col > size) {
            throw new IllegalArgumentException();
        }

        opened[row - 1][col - 1] = true;
        openSitesCounter++;

        if(row == 1){
            quickUnionUF.union(getQuickFindIndex(row, col), TOP);
        }

        if(row == size){
            quickUnionUF.union(getQuickFindIndex(row, col), bottom);
        }

        if(row > 1 && isOpen(row - 1, col)){
            quickUnionUF.union(getQuickFindIndex(row, col), getQuickFindIndex(row - 1, col));
        }

        if(row < size && isOpen(row + 1, col)){
            quickUnionUF.union(getQuickFindIndex(row, col), getQuickFindIndex(row + 1, col));
        }

        if(col > 1 && isOpen(row, col - 1)){
            quickUnionUF.union(getQuickFindIndex(row, col), getQuickFindIndex(row, col - 1));
        }

        if(col < size && isOpen(row, col + 1)){
            quickUnionUF.union(getQuickFindIndex(row, col), getQuickFindIndex(row, col + 1));
        }
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col){

    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col){

    }

    // returns the number of open sites
    public int numberOfOpenSites(){

    }

    // does the system percolate?
    public boolean percolates(){

    }

    // test client (optional)
    public static void main(String[] args) {

    }
}

