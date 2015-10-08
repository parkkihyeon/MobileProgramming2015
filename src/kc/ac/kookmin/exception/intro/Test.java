package kc.ac.kookmin.exception.intro;

import java.io.* ;
import java.util.* ;

class AAA
{
	BufferedReader in ;

	AAA() {} 
	
	public void readFile() 
	{
		try
		{
			this.in = new BufferedReader(new FileReader("a")) ;
			System.out.println("������ �дµ� �����Ͽ����ϴ�.") ;
						
			while(true)
		    {
				String line = in.readLine() ;
				if (line == null)
					break ;
				
				System.out.println(line) ;
		     }
		}
		
		catch(IOException ex)
		{
			ex.printStackTrace();
			System.exit(0); 
		}
		
		finally
		{
			this.CloseFile();
		}
		
	}

	public void CloseFile()
	{
		try
		{
			this.in.close() ;
			System.out.println("������ �ݴµ� �����Ͽ����ϴ�.") ;
		}
		catch (IOException e) 
		{
			e.printStackTrace();
			System.exit(0); 
		}
	}
	
}

public class Test 
{
    public static void main(String args[])
    {
    	AAA a = new AAA();
    	a.readFile();
    	
    }
} 
