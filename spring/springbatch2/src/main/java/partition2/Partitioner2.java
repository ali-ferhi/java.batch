package partition2;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;

public class Partitioner2 implements Partitioner {

	public Map<String, ExecutionContext> partition(int gridSize) {
		
		System.out.println(Thread.currentThread().getName() + " Partitioner2.partition.begin");
		Map<String, ExecutionContext> toReturn = new HashMap<>();
		ExecutionContext exeCtx;
		
		for(int i=0; i< gridSize; i++){
			exeCtx = new ExecutionContext();
			exeCtx.putString("criterion", String.valueOf(i));
			toReturn.put(String.valueOf(i), exeCtx);
		}
		
		System.out.println(Thread.currentThread().getName() + " Partitioner2.partition.end");
		return toReturn;
	}

}
