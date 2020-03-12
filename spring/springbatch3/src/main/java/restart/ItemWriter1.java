package restart;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class ItemWriter1 implements ItemWriter<String> {

	public void write(List<? extends String> in) throws Exception {
		
		int i=0;
		for(String one : in) {
			if(i==1) {
				throw new RuntimeException("I am Ali!");
			}
			System.out.println(one);
			i++;
		}
	}

}
