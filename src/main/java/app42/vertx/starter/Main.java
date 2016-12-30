package app42.vertx.starter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		service.submit(new Controller());
	}
}
