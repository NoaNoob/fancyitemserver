package com.rest.services;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

@Path("itemService")
public class ItemService {

	static String[] colours = { "rot", "gelb", "blau", "grün", "orange", "schwarz", "rosa" };
	static String[] names = { "Pullover", "Hose", "Schlüppi", "Mütze", "Schuhe" };
	static Random random = new Random();

	@GET
	@Path("random")
	@Produces("application/txt")
	public void getRandom(@Suspended AsyncResponse response) {

		CompletableFuture.supplyAsync(this::createRandomItem).thenAccept(response::resume);
	}

	private String createRandomItem() {

		String item = random(names) + " in " + random(colours) + " " + (random.nextInt(99)) + "€";
		System.out.println("[ItemService] Item created: " + item + " [" + idleAround() + "ms]");
		return item;
	}

	private static String random(String[] array) {

		return array[random.nextInt(array.length - 1)];
	}

	private int idleAround() {

		int idle = random.nextInt(130);

		try {
			Thread.sleep(idle);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return idle;
	}

}
