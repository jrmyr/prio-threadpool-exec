package de.myrnet.prioTPExec;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PrioThreadPoolExecutorApplication.class)
public class PrioThreadPoolExecutorApplicationTests {

	@Test
	public void testPriorisation() {
		try {
		PrioritizedThreadPoolTaskExecutor pte = new PrioritizedThreadPoolTaskExecutor();

		pte.setCorePoolSize(1);
		pte.setMaxPoolSize(1);
		pte.setQueueCapacity(10);
		pte.initialize();

		pte.execute(new ReportTask("X", 5));
		pte.execute(new ReportTask("X", 2));
		pte.execute(new ReportTask("X", 10));
		pte.execute(new ReportTask("X", 8));
		pte.execute(new ReportTask("X", 4));
		pte.execute(new ReportTask("X", 1));
		pte.execute(new ReportTask("X", 5));
		} catch (Exception e) {
			e.printStackTrace();
		}
		}

}
