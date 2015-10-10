package ca.bcit.cst.comp2526.assignment1c;

/**
 * Class Table acts as a parent class to allow subclasses to extend from it.
 * 
 * @author Alex Zielinski
 */

public class Table {
    
    /** Stores multiplication operator as String  */
    protected final String operator; 
    
    /** 2D array for multiplication table */
    protected float[][] table;     
    
    /** Stores array size */
    protected int arraySize;
    
    /** Stores tables start value */
    protected int start;
    
    /** Stores tables end value */
    protected int stop;
    
    /**
     * Non-default constructor.
     * 
     * @param start tables starting value
     * @param stop  tables ending value
     * @param t     tables arithmetic operator
     */
    protected Table(final int start, final int stop, final String t)
    {
        this.start = start;
        this.stop = stop;
        operator = t;
    }
    
    /**
     * Undefined method to create table.
     */
    protected void createTable()
    {
        
    }
    
    /**
     * Undefined method to display table.
     */
    protected void displayTable()
    {

    }
}
