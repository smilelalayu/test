package com.cn.bus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gep.util.PropertyUtils;
import com.hm.bus.service.BusSysErrorLogService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class BusSentTest {

	@Autowired
	BusSysErrorLogService busSysErrorLogService;
	

//	@Test
//	public void runTaskThreeTest() {
//		busSentService.runTaskThree("admin");
//	}
	
	@Test
	public void runTaskFourTest() {
		// try {
		// Long.parseLong("A");
		// } catch (Exception e) {
		// busSysErrorLogService.saveError("[BusSentServiceImpl] LoanConfirmTask method Exception ",
		// e);
		// }
		
		while(true){
			System.out.println("Property  value =  "+PropertyUtils.getConfig("bus", "com.hm.bus.direct.link.switch"));
			try {
				Thread.sleep(1000*60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
//		busSentService.runTaskFour();
	}
}
