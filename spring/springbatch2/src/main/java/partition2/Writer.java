package partition2;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class Writer implements ItemWriter<String> {

	public void write(List<? extends String> in) throws Exception {
		
		System.out.println(Thread.currentThread().getName() + " Writer.write.begin");
		
		for(String one : in) {
			System.out.println(Thread.currentThread().getName() + " Writer.write : " + one);
		}
		
		System.out.println(Thread.currentThread().getName() + " Writer.write.end");
	}

}
