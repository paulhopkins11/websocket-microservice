package uk.co.nstech.websockets.adderservice;

import io.advantageous.qbit.annotation.PathVariable;
import io.advantageous.qbit.annotation.RequestMapping;
import io.advantageous.qbit.server.EndpointServerBuilder;
import io.advantageous.qbit.server.ServiceEndpointServer;

@RequestMapping("/adder-service")
public class AdderService {

	@RequestMapping("/add/{0}/{1}")
	public int add(@PathVariable int a, @PathVariable int b) {
		// System.out.println("Adding " + a + " and " + b);
		return a + b;
	}

	public static void main(String... args) {
		System.out.println("Starting Server...");
		ServiceEndpointServer server = new EndpointServerBuilder().setPort(8080).build();
		server.initServices(new AdderService());
		server.start();
	}
}