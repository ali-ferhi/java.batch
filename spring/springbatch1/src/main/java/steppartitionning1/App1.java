package steppartitionning1;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	
	/* réf
	 * 	- Google : spring batch partitioning step
	 * 	- https://examples.javacodegeeks.com	
	 * 		- Spring Batch Partitioning Example
	 * 			- https://examples.javacodegeeks.com/core-java/spring-batch-partitioning-example/ 
	 */
	
	public static void main(String[] args) throws Exception { 
		  
		String[] springConfig  =  {"stepPartitionning1.xml"};  
	    ApplicationContext springContext = new ClassPathXmlApplicationContext(springConfig);	      
	    
	    JobLauncher jobLauncher1 = (JobLauncher) springContext.getBean("jobLauncher1"); 
	    
	    Job job1 = (Job) springContext.getBean("job1");
	    JobExecution job1Execution = jobLauncher1.run(job1, new JobParameters());
	    System.out.println("job 1 / exit status : " + job1Execution.getStatus());
	}

}
