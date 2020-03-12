package steppartitionning1;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class ItemWriter1 implements ItemWriter<String> {

	public void write(List<? extends String> in) throws Exception {
		
		System.out.println(Thread.currentThread().getName() + " " + "ItemWriter1.write.begin");
		
		for(String one : in) {
			System.out.println(Thread.currentThread().getName() + " " + "ItemWriter1.write : " + one);
		}
		
		System.out.println(Thread.currentThread().getName() + " " + "ItemWriter1.write.end");
	}

}
