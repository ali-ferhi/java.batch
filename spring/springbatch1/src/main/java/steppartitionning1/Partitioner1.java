package steppartitionning1;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;

public class Partitioner1 implements Partitioner {

	public Map<String, ExecutionContext> partition(int gridSize) {
		
		System.out.println("Partitioner1.partition.begin");
		Map toReturn = new HashMap();
		ExecutionContext exeCtx;
		
		for(int i=0; i< gridSize; i++){
			exeCtx = new ExecutionContext();
			exeCtx.putString("criterion", String.valueOf(i));
			toReturn.put(String.valueOf(i), exeCtx);
		}
		
		System.out.println("Partitioner1.partition.end");
		return toReturn;
	}

}
