package ca.bcit.cst.comp2526.assignment1c;

/**
 * Class MultiplicationTable extends from class Table and 
 * represents a multiplication table.
 * 
 * @author Alex Zielinski
 */

public class MultiplicationTable extends Table {
 
     /**
     * Non-default constructor.
     * 
     * @param start tables starting value
     * @param stop  tables ending value
     * @param t     tables arithmetic operator
     */
    public MultiplicationTable(int start, int stop, String t)
    {
        // calls parent constructor
        super(start, stop, t);
    }
    
    /**
     * method to create table.
     */
    @Override
    public void createTable()
    {
        arraySize = stop - start + 1;               // defines 2D array size
        table = new float[arraySize][arraySize];    // creates 2D array
        
        // creates multiplication table
        for (int row = 0; row < table.length; row++)
                    for (int col = 0; col < table.length; col++)
                        table[row][col] = (row + start) * (col + start);
    }
    
    /**
     * Method to display table.
     */
    @Override
    public void displayTable()
    {
        String s = "-----";
        System.out.printf("\n");
        
        System.out.printf("%5s", operator);

        // prints header numbers
        System.out.printf("  ");
        for (int i = 0; i < table.length; i++)
            System.out.printf("%5d", (i + start));

        // prints operator
        System.out.printf("\n");

        // prints underline under header numbers
        System.out.printf("  ");
        for (int i = 0; i <= table.length; i++)
            System.out.printf("%5s", s);

        System.out.printf("\n");

        // prints side column numbers and elements of 2D array
        for (int row = 0; row < table.length; row++)
        {
            System.out.printf("%5d |", row + start);
            for (int col = 0; col < table.length; col++)
                System.out.printf("%5.0f", table[row][col]);
            
            System.out.printf("\n");
        }
    }
}
