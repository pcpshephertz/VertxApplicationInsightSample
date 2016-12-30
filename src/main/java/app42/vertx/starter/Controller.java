package app42.vertx.starter;

import io.vertx.core.Vertx;

public class Controller implements Runnable {

	@Override
	public void run() {
		
		Vertx vertx = Vertx.vertx();
		vertx.deployVerticle(MyFirstVerticle.class.getName());
	}
}
