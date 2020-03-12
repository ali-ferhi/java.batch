package basic1;

import org.springframework.batch.item.ItemProcessor;

public class ItemProcessor1 implements ItemProcessor<String, String>{

	public String process(String in) throws Exception {
		return "salam " + in + " !";
	}

}
