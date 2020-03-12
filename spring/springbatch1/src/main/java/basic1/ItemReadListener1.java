package basic1;

import org.springframework.batch.core.ItemReadListener;

public class ItemReadListener1 implements ItemReadListener<String> {

	public void afterRead(String in) {
		System.out.println("after read of : " + in);
	}

	public void beforeRead() {
		System.out.println("before read");
	}

	public void onReadError(Exception e) {
		System.out.println("error : " + e.getMessage());
		
	}

}
