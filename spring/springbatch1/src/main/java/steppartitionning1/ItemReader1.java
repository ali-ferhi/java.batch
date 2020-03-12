package steppartitionning1;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class ItemReader1 implements ItemReader<String> {

	private String criterion;
	
	private int counter;
	
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		
		System.out.println(Thread.currentThread().getName() + " " + "ItemReader1.read.begin");
		String toReturn = null;
		
		if(criterion.equals("0") && counter < 4) {
			
			toReturn = "ali " + counter;
			
		} else if(criterion.equals("1") && counter < 4)	{
			
			toReturn = "ilyane " + counter;
		}
		
		counter++;
		System.out.println(Thread.currentThread().getName() + " " + "ItemReader1.read.end : " + toReturn);
		return toReturn;
	}
	
	public void setCriterion(String criterion) {
		this.criterion = criterion;
	}

}
