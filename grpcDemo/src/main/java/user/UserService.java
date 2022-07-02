package user;

import io.grpc.stub.StreamObserver;
import sistemasd.grpc.User.CreateRequest;
import sistemasd.grpc.User.Empyt;
import sistemasd.grpc.User.GetRequest;
import sistemasd.grpc.User.ListRequest;
import sistemasd.grpc.User.UpdateRequest;
import sistemasd.grpc.User.UsersRequest;
import sistemasd.grpc.userGrpc.userImplBase;

public class UserService extends userImplBase{

	@Override
	public void createUser(CreateRequest request, StreamObserver<UsersRequest> responseObserver) {
		System.out.println("Digite: ");
		
		String name = request.getName();
		String email = request.getEmail();
		
		UsersRequest.Builder response = UsersRequest.newBuilder();
		
		System.out.println(request);
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void deleteUser(CreateRequest request, StreamObserver<Empyt> responseObserver) {
		
	}

	@Override
	public void updateUser(UpdateRequest request, StreamObserver<UsersRequest> responseObserver) {
		
	}

	@Override
	public void listUser(Empyt request, StreamObserver<ListRequest> responseObserver) {
		// TODO Auto-generated method stub
		super.listUser(request, responseObserver);
	}

	@Override
	public void getUser(GetRequest request, StreamObserver<UsersRequest> responseObserver) {
		System.out.println("Procurar id: ");
		
		int id = request.getId();
		
		UsersRequest.Builder response = UsersRequest.newBuilder();
		
		if(id == -1) {
			System.out.println(" Cliente nao encontrado ");
		}
		else {
			System.out.println("id" + id);
		}
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		
	}
	
	
}