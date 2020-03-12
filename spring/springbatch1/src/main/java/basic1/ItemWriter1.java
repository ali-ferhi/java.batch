package basic1;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class ItemWriter1 implements ItemWriter<String> {

	public void write(List<? extends String> in) throws Exception {
		
		for(String one : in) {
			System.out.println(one);
		}
	}

}
