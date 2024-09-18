import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

// Program to estimate the value of the percolation threshold via Monte Carlo simulation

// Corner cases.  By convention, the row and column indices are integers between 1 and n,
// where (1, 1) is the upper-left site: Throw an IllegalArgumentException if any argument to open(),
// isOpen(), or isFull() is outside its prescribed range. Throw an IllegalArgumentException in the constructor if n ≤ 0

// Running Time must be proportional to n²

public class Percolation {
    // creates n-by-n grid, with all sites initially blocked
    public Percolation(){

    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col){

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
