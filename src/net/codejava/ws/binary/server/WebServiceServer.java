package net.codejava.ws.binary.server;

import javax.xml.ws.Endpoint;

/**
 * A simple web service server.
 * @author www.codejava.net
 *
 */
public class WebServiceServer {

	public static void main(String[] args) {
		String bindingURI = "http://localhost:9898/codejava/fileService";
		FileTransferer service = new FileTransfererImpl();
		Endpoint.publish(bindingURI, service);
		System.out.println("Server started at: " + bindingURI);
	}
}