package sudokuplayer;

/**
 * @author pgm33
 */
public class Sudoku 
{
    private char[][] board = new char[9][9];
    
    public Sudoku()
    {
        
    }
    
    
    public Sudoku(String starting_configuration)
    {
        int row  = 0;
        int col = 0;
        
        char [] charArray = starting_configuration.toCharArray();
        for (char value : charArray)
        {
            if (value == '\n') 
            {
                row++; 
                col = 0; 
            } 
            else 
            { 
                board[row][col] = value; 
                col++; 
            }
        }
    }
    
    
    public char getSquare(int row, int col)
    {
        char digit = board[row][col];
        return digit;
    }
    
    
    public void setSquare(int row, int col,char value)
    {
        char digit = board[row][col];
        value = digit;
    }

    
    public boolean isValid()
    {

        return (areAllRowsValid() && areAllColsValid() && areAllSubSquaresValid());
    }
    
    
    private boolean areAllRowsValid()
    {
       // loop that calls "isRowValid" 9 times that goes through each row
     for( int row = 0; row < 9; row++)
     {
         if (isRowValid(row) == false) 
         {
         return false;
         }
     }
     return true;  
    }
    
    
    private boolean isRowValid(int row)
    {
        int OneCount = 0, TwoCount = 0, ThreeCount = 0;
        int FourCount = 0, FiveCount = 0, SixCount = 0;
        int SevenCount = 0, EightCount = 0, NineCount = 0;
        for (int col = 0; col < 9; col ++)
        {
            char value = board[row][col];
            if (value == '1') {OneCount++;}
            if (value == '2') {TwoCount++;}
            if (value == '3') {ThreeCount++;}
            if (value == '4') {FourCount++;}
            if (value == '5') {FiveCount++;}
            if (value == '6') {SixCount++;}
            if (value == '7') {SevenCount++;}
            if (value == '8') {EightCount++;}
            if (value == '9') {NineCount++;}
        }
        return (OneCount < 2) && (TwoCount < 2) && (ThreeCount < 2) && 
                (FourCount < 2) && (FiveCount < 2) && (SixCount < 2) && 
                (SevenCount < 2) && (EightCount < 2) && (NineCount < 2);         
    }
    
    
    private boolean areAllColsValid()
    {
       // loop that calls "isColValid" 9 times that goes through each col
     for( int col = 0; col < 9; col++)
     {
         if (isColValid(col) == false) 
         {
         return false;
         }
         
     }
     return true;  
    }
    
    
    private boolean isColValid(int col)
    {
        int OneCount = 0, TwoCount = 0, ThreeCount = 0;
        int FourCount = 0, FiveCount = 0, SixCount = 0;
        int SevenCount = 0, EightCount = 0, NineCount = 0;
        for (int row = 0; row < 9; row ++)
        {
            char value = board[row][col];
            if (value == '1') {OneCount++;}
            if (value == '2') {TwoCount++;}
            if (value == '3') {ThreeCount++;}
            if (value == '4') {FourCount++;}
            if (value == '5') {FiveCount++;}
            if (value == '6') {SixCount++;}
            if (value == '7') {SevenCount++;}
            if (value == '8') {EightCount++;}
            if (value == '9') {NineCount++;}
        }
        return (OneCount < 2) && (TwoCount < 2) && (ThreeCount < 2) && 
                (FourCount < 2) && (FiveCount < 2) && (SixCount < 2) && 
                (SevenCount < 2) && (EightCount < 2) && (NineCount < 2);         
    }
        
        
    private boolean areAllSubSquaresValid()
    {	
	if(isSubSquareValid() == false){
	    return false;
	}
        return true;
    }
    
    
    private boolean isSubSquareValid()
    {
    	
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               int  OneCount = 0, TwoCount = 0,ThreeCount = 0;
               int  FourCount = 0, FiveCount = 0,  SixCount = 0;
               int SevenCount = 0, EightCount = 0,NineCount = 0;
                for (int row = i * 3; row < (i + 1) * 3; row++) {
                    for (int col = j * 3; col < (j + 1) * 3; col++) {
                        char value = board[row][col];
                        if((value!=1)&&(value!=2)&&(value!=3)&&(value!=4)
                                &&(value!=5)&&(value!=6)&&(value!=7)&&(value!=8)
                                &&(value!=9)&&(value!=' ')){
                            return false;
                        }
                        if (value == '1') {OneCount++;}
                        if (value == '2') {TwoCount++;}
                        if (value == '3') {ThreeCount++;}
                        if (value == '4') {FourCount++;}
                        if (value == '5') {FiveCount++;}
                        if (value == '6') {SixCount++;}
                        if (value == '7') {SevenCount++;}
                        if (value == '8') {EightCount++;}
                        if (value == '9') {NineCount++;}
                    }
                }
                if (!((OneCount < 2) && (TwoCount < 2) && (ThreeCount < 2) && 
                    (FourCount < 2) && (FiveCount < 2) && (SixCount < 2) && 
                    (SevenCount < 2) && (EightCount < 2) && (NineCount < 2))){
                return false;
                }
            }
        }
        return  true;     
    }
             
             
             
    public boolean isSolved()
    {
        if (!isValid()) {
        	return false;
        }      
        for (int row = 0; row < 9; row++)
            for (int col = 0; col < 9; col++)
            {
                if (board[row][col] == ' ') { 
                	return false;
                	}
            }
            return true;
    }
}