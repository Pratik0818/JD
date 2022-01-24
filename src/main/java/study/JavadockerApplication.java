package study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavadockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavadockerApplication.class, args);
		System.out.println(checkIfInputIsAnEvenNumber(122));
	}
	public static boolean checkIfInputIsAnEvenNumber(int number)
	{
		return number % 2 == 0;
	}
}


