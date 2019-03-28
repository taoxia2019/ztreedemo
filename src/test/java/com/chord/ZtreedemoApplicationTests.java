package com.chord;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZtreedemoApplicationTests {

	@Test
	public void contextLoads() {
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime ldt = LocalDateTime.now();
		String strDate = dtf.format(ldt);

		System.out.println(strDate+".....");
		LocalDateTime newDate = ldt.parse(strDate,DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println(newDate);


	}

	@Test
	public void lambdatese(){
		List<String> names= Arrays.asList("ybc","def","dddd","zfy");
		Collections.sort(names,(t1,t2)->t1.compareTo(t2));
		names.stream().forEach(System.out::print);
	}

}
