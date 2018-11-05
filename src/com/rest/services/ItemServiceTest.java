package com.rest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

//import javax.ws.rs.client.Client;
//import javax.ws.rs.client.ClientBuilder;
//import javax.ws.rs.client.WebTarget;
//
//import org.junit.Before;
//import org.junit.Test;

public class ItemServiceTest {
//
//	private WebTarget tutItem;
//	private WebTarget tutCustomer;
//
//	@Before
//	public void init() {
//
//		Client clientItem = ClientBuilder.newClient();
//		tutItem = clientItem.target("http://localhost:8080/fancyitemserver/rest/itemService/random");
//
//		Client clientCustomer = ClientBuilder.newClient();
//		tutCustomer = clientCustomer.target("http://localhost:8080/customerserver/rest/customerService/random");
//	}
//
//	@Test
//	public void shouldCallServer() throws InterruptedException, ExecutionException {
//
//		CompletableFuture<String> futureCustomer = CompletableFuture.supplyAsync(this::retrieveCustomer);
//		CompletableFuture<String> futureItem = CompletableFuture.supplyAsync(this::retrieveItem);
//
//		Order order = futureCustomer.thenCombine(futureItem, this::order).thenApply(this::validate).get();
//
//		System.out.println(order);
//	}
//
//	Order validate(Order order) {
//		System.out.println("validating... " + order.customer);
//		return order;
//	}
//
//	Order order(String customer, String item) {
//
//		System.out.println("Creating order");
//
//		Order order = new Order();
//		order.customer = customer;
//		order.items.add(item);
//
//		return order;
//	}
//
//	String retrieveItem() {
//
//		System.out.println("retrieving item");
//		return tutItem.request().get(String.class);
//	}
//
//	String retrieveCustomer() {
//
//		System.out.println("retrieving customer");
//
//		return tutCustomer.request().get(String.class);
//	}

	class Order {

		public String customer;
		public List<String> items = new ArrayList<>();

		@Override
		public String toString() {

			return "Bestellung: " + customer + " = " + items;
		}
	}
}
