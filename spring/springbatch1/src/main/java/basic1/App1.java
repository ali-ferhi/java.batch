package basic1;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	
	public static void main(String[] args) throws Exception { 
		  
	      String[] springConfig  =  {"basic1.xml"};  
	      ApplicationContext springContext = new ClassPathXmlApplicationContext(springConfig);	      
	      
	      JobLauncher jobLauncher1 = (JobLauncher) springContext.getBean("jobLauncher1"); 
	      
	      Job job1 = (Job) springContext.getBean("job1");
	      JobExecution job1Execution = jobLauncher1.run(job1, new JobParameters());
	      System.out.println("job 1 / exit status : " + job1Execution.getStatus());
	      
	      Job job2 = (Job) springContext.getBean("job2");
	      JobExecution job2Execution = jobLauncher1.run(job2, new JobParameters());
	      System.out.println("job 2 / exit status : " + job2Execution.getStatus());	      
	       
	   }  

}
