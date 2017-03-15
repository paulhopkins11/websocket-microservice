package uk.co.nstech.websockets.adderservice;

import static io.advantageous.qbit.client.ClientBuilder.clientBuilder;

import io.advantageous.qbit.client.Client;

public class WebSocketAdderClient {

	public static void main(String[] args) {
		System.out.println("Client");
		/* Start QBit client for WebSocket calls. */
		final Client client = clientBuilder().setPort(8080).setRequestBatchSize(1).build();

		/* Create a proxy to the service. */
		final AdderServiceClientInterface adderService = client.createProxy(AdderServiceClientInterface.class,
				"adder-service");

		client.start();

		/* Call the service */
		adderService.add(System.out::println, 1, 2);
	}

}
