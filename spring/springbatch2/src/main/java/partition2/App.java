package partition2;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) throws Exception { 
		  
		String[] springConfig  =  {"partition3/master.xml"};  
		ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext(springConfig);	      
	    
	    JobLauncher jobLauncher = (JobLauncher) springContext.getBean("jobLauncher"); 
	    
	    Job job = (Job) springContext.getBean("job");
	    System.out.println(Thread.currentThread().getName() + " App.main.job.run");
	    JobExecution jobExecution = jobLauncher.run(job, new JobParameters());
	    System.out.println(Thread.currentThread().getName() + " App.main.job.exitStatus : " + jobExecution.getStatus());
	    
	    springContext.close();
	}

}
