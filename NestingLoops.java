public class NestingLoops {
    
    public static void main( String[] args )
    {
        // this is #1 - I'll call it "CN"
        
        // 1. n is going faster
        // 2. It is controlled by the outer loop.
        // 3. The list of numbers prints out before the list of letters.

           

       
        for ( int n=1; n <= 3; n++ )
        {
            for ( char c='A'; c <= 'E'; c++ )
            {            
                System.out.println( c + " " + n );
            }
        }
        
       
        System.out.println("\n");

        // 4. Instead of printing on different lines, it all prints on one line.


        // this is #2 - I'll call it "AB"
        for ( int a=1; a <= 3; a++ )
        {
            for ( int b=1; b <= 3; b++ )
            {
                System.out.print( a + "-" + b + " " );
            }
            System.out.println("Added input here.");
        }

        System.out.println("\n");

    }

}
// 5. There are three pairs printed to a line.