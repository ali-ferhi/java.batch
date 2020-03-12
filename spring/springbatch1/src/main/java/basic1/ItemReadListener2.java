package basic1;

import org.springframework.batch.core.ItemReadListener;

public class ItemReadListener2 implements ItemReadListener<Entity1> {

	public void afterRead(Entity1 in) {
		System.out.println("after read of : " + in.getName());
	}

	public void beforeRead() {
		System.out.println("before read");
	}

	public void onReadError(Exception e) {
		System.out.println("error : " + e.getMessage());
		
	}

}
