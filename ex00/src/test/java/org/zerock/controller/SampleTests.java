package org.zerock.controller;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.sample.Restaurant;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
// 객체 생성이나 DI 적용이 src/main/java -> 자동 적용, src/test/java -> 자동 적용 안됨(읽어올 파일 지정)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
// log 객체 사용하기 위한 지정. log - 사용 내역 출력
@Log4j
public class SampleTests {
	
	//{} = 여러개를 의미
	@Setter(onMethod_= {@Autowired})
	private Restaurant restaurant;
	
	//실제적인 테스트를 하는 메소드 작성
	@Test
	public void testExist() {
		// not null 확인 - null 이면 예외 발생
		assertNotNull(restaurant);
		
		log.info(restaurant);
		log.info("---------------------------------------");
		log.info(restaurant.getChef());
	}
}
