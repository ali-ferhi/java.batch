package restart;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class ItemReader1 implements ItemReader<String> {
	
	private int a = 0;
	
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {		
		
		if(a == 0) {
			a++;
			return "ali";
		} else if(a == 1)	{
			a++;
			//throw new Exception("test exception");			
			return "ilyane";
		}
		return null;
	}

}
