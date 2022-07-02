package server;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import user.UserService;

public class GRPCServer{
	public static void main(String[] args) throws InterruptedException, IOException {
		Server server = ServerBuilder.
				forPort(9090).addService( new UserService()).build();
		server.start();
		
		System.out.println("Server startedd at" + server.getPort());
		server.awaitTermination();
		
	}
}