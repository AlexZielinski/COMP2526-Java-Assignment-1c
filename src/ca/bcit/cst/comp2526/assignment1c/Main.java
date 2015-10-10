package ca.bcit.cst.comp2526.assignment1c;

/**
 * Main class.
 * 
 * @author Alex Zielinski
 */

public class Main
{
    /**
     * Main method.
     * 
     * @param argv command line arguments
     */
    public static void main(final String[] argv)
    {
        final TableType type;
        final int       start;
        final int       stop;
        
        if(argv.length != 3)
        {
            usage();
        }

        type  = getType(argv[0]);
        start = getNumber(argv[1]);
        stop  = getNumber(argv[2]);
        
        Table t;
        t = getTable(type, start, stop);
    }
    
    public static TableType getType(final String str)
    {
        final TableType type;
        
        if(str.equals("+"))
        {
            type = TableType.ADD;
        }
        else if(str.equals("-"))            
        {
            type = TableType.SUB;
        }
        else if(str.equals("*"))            
        {
            type = TableType.MULT;
        }
        else
        {
            usage();
            type = null;
        }
        
        return (type);
    }
    
    public static int getNumber(final String str)
    {
        int val;
        
        try
        {
            val = Integer.parseInt(str);
            
            if(val < 1 || val > 100)
            {
                usage();
            }
        }
        catch(NumberFormatException ex)
        {
            usage();
            val = 0;
        }
        
        return (val);
    }
    
    /**
     * getTable method to retrieve arithmetic table
     * 
     * @param type tables type
     * @param start tables starting value
     * @param stop  tables ending value
     * 
     * @return Table
     */
    public static Table getTable(final TableType type,
                               final int start,
                               final int stop)
    {
        Table t;
        // if TableType is ADD, create and display addiction table
        if (type == TableType.ADD)
        {
            t = new AdditionTable(start, stop, "+");
            t.createTable();
            t.displayTable();
        }
        // if TableType is MULT, create and display multiplication table
        else if (type == TableType.MULT)
        {
            t = new MultiplicationTable(start, stop, "*");
            t.createTable();
            t.displayTable();
        }
        // if TableTyupe is SUB, create and display subtraction table
        else
        {
            t = new SubtractionTable(start, stop, "-");
            t.createTable();
            t.displayTable();
        }
        return t;
    }    
    
    public static void usage()
    {
        System.err.println("Usage: Main <type> <start> <stop>");
        System.err.println("\tWhere <type> is one of +, \"*\"");
        System.err.println("\tand <start> is between 1 and 100");
        System.err.println("\tand <stop> is between 1 and 100");
        System.err.println("\tand start < stop");
        System.exit(1);
    }            
}

