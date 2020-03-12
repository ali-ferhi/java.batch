package basic1;

import org.springframework.batch.item.ItemProcessor;

public class ItemProcessor2 implements ItemProcessor<Entity1, String> {

	public String process(Entity1 item) throws Exception {
		return "salam " + item.getName() + " !";
	}

}
