package kr.ac.kookmin.exception.fileio;

import java.io.* ; 

/**
 Makes numbered.txt the same as original.txt, but with each line numbered.
*/
public class AddLineNumber
{
   public static void main(String[] args)
   {
       try
      {
         BufferedReader inputStream = 
               new BufferedReader(new FileReader("original.txt"));
         PrintWriter outputStream = 
               new PrintWriter(new FileOutputStream("numbered.txt"));

         int cnt = 0 ;
         while(true)
		 {
				String line = inputStream.readLine() ;
				if (line == null)
					break ;
				cnt++ ;
				outputStream.write(cnt+" "+line);
				outputStream.write("\n") ;
		  }
         
         inputStream.close( );
         outputStream.close( );
      }
       
      catch(FileNotFoundException ex)
      {
     	  ex.printStackTrace(); 
       }

      catch(IOException ex)
      {
    	  ex.printStackTrace();
      }
      
   }
}