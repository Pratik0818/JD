package study;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavadockerApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testInputIsEven(){
		 assertTrue(JavadockerApplication.checkIfInputIsAnEvenNumber(22)); 

		 }

}
