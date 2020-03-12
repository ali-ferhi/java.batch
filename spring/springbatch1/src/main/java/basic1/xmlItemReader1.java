package basic1;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class xmlItemReader1 implements ItemReader<Entity1> {

	public Entity1 read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		return null;
	}

}
