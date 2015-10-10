package ca.bcit.cst.comp2526.assignment1c;

/**
 * Class AdditionTable extends from class Table and represents an 
 * addition table.
 * 
 * @author Alex Zielinski
 */

public class AdditionTable extends Table {

     /**
     * Non-default constructor.
     * 
     * @param start tables starting value
     * @param stop  tables ending value
     * @param t     tables arithmetic operator
     */
    public AdditionTable(int start, int stop, String t) 
    {
        // calls parent constructor
        super(start, stop, t);
    }
    
    /**
     * Method to create table.
     */
    @Override
    public void createTable()
    {
        arraySize = stop - start + 1;                // defines 2D array size
        table = new float[arraySize][arraySize];     // creates 2D array
        
        // creates addition table
        for (int row = 0; row < table.length; row++)
                    for (int col = 0; col < table.length; col++)
                        table[row][col] = (row + start) + (col + start);
    }
    
    /**
     * Method to display table.
     */
    @Override
    public void displayTable()
    {
        String s = "-----";
        System.out.printf("\n");
       
        // prints operator
        System.out.printf("%5s", operator);

        // prints header numbers
        System.out.printf("  ");
        for (int i = 0; i < table.length; i++)
            System.out.printf("%5d", (i + start));

        System.out.printf("\n");

        // prints underline under header numbers
        System.out.printf("  ");
        for (int i = 0; i <= table.length; i++)
            System.out.printf("%5s", s);

        System.out.printf("\n");

        // prints side column numbers and elements of array
        for (int row = 0; row < table.length; row++)
        {
            System.out.printf("%5d |", row + start);
            for (int col = 0; col < table.length; col++)
                System.out.printf("%5.0f", table[row][col]);
            
            System.out.printf("\n");
        }
    }
}
