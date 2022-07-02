package sistemasd.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: user.proto")
public final class userGrpc {

  private userGrpc() {}

  public static final String SERVICE_NAME = "user";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sistemasd.grpc.User.CreateRequest,
      sistemasd.grpc.User.UsersRequest> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = sistemasd.grpc.User.CreateRequest.class,
      responseType = sistemasd.grpc.User.UsersRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sistemasd.grpc.User.CreateRequest,
      sistemasd.grpc.User.UsersRequest> getCreateUserMethod() {
    io.grpc.MethodDescriptor<sistemasd.grpc.User.CreateRequest, sistemasd.grpc.User.UsersRequest> getCreateUserMethod;
    if ((getCreateUserMethod = userGrpc.getCreateUserMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getCreateUserMethod = userGrpc.getCreateUserMethod) == null) {
          userGrpc.getCreateUserMethod = getCreateUserMethod = 
              io.grpc.MethodDescriptor.<sistemasd.grpc.User.CreateRequest, sistemasd.grpc.User.UsersRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sistemasd.grpc.User.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sistemasd.grpc.User.UsersRequest.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("CreateUser"))
                  .build();
          }
        }
     }
     return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sistemasd.grpc.User.CreateRequest,
      sistemasd.grpc.User.Empyt> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUser",
      requestType = sistemasd.grpc.User.CreateRequest.class,
      responseType = sistemasd.grpc.User.Empyt.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sistemasd.grpc.User.CreateRequest,
      sistemasd.grpc.User.Empyt> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<sistemasd.grpc.User.CreateRequest, sistemasd.grpc.User.Empyt> getDeleteUserMethod;
    if ((getDeleteUserMethod = userGrpc.getDeleteUserMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getDeleteUserMethod = userGrpc.getDeleteUserMethod) == null) {
          userGrpc.getDeleteUserMethod = getDeleteUserMethod = 
              io.grpc.MethodDescriptor.<sistemasd.grpc.User.CreateRequest, sistemasd.grpc.User.Empyt>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "DeleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sistemasd.grpc.User.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sistemasd.grpc.User.Empyt.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("DeleteUser"))
                  .build();
          }
        }
     }
     return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sistemasd.grpc.User.UpdateRequest,
      sistemasd.grpc.User.UsersRequest> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = sistemasd.grpc.User.UpdateRequest.class,
      responseType = sistemasd.grpc.User.UsersRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sistemasd.grpc.User.UpdateRequest,
      sistemasd.grpc.User.UsersRequest> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<sistemasd.grpc.User.UpdateRequest, sistemasd.grpc.User.UsersRequest> getUpdateUserMethod;
    if ((getUpdateUserMethod = userGrpc.getUpdateUserMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getUpdateUserMethod = userGrpc.getUpdateUserMethod) == null) {
          userGrpc.getUpdateUserMethod = getUpdateUserMethod = 
              io.grpc.MethodDescriptor.<sistemasd.grpc.User.UpdateRequest, sistemasd.grpc.User.UsersRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sistemasd.grpc.User.UpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sistemasd.grpc.User.UsersRequest.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("UpdateUser"))
                  .build();
          }
        }
     }
     return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sistemasd.grpc.User.Empyt,
      sistemasd.grpc.User.ListRequest> getListUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUser",
      requestType = sistemasd.grpc.User.Empyt.class,
      responseType = sistemasd.grpc.User.ListRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sistemasd.grpc.User.Empyt,
      sistemasd.grpc.User.ListRequest> getListUserMethod() {
    io.grpc.MethodDescriptor<sistemasd.grpc.User.Empyt, sistemasd.grpc.User.ListRequest> getListUserMethod;
    if ((getListUserMethod = userGrpc.getListUserMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getListUserMethod = userGrpc.getListUserMethod) == null) {
          userGrpc.getListUserMethod = getListUserMethod = 
              io.grpc.MethodDescriptor.<sistemasd.grpc.User.Empyt, sistemasd.grpc.User.ListRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "ListUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sistemasd.grpc.User.Empyt.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sistemasd.grpc.User.ListRequest.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("ListUser"))
                  .build();
          }
        }
     }
     return getListUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sistemasd.grpc.User.GetRequest,
      sistemasd.grpc.User.UsersRequest> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = sistemasd.grpc.User.GetRequest.class,
      responseType = sistemasd.grpc.User.UsersRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sistemasd.grpc.User.GetRequest,
      sistemasd.grpc.User.UsersRequest> getGetUserMethod() {
    io.grpc.MethodDescriptor<sistemasd.grpc.User.GetRequest, sistemasd.grpc.User.UsersRequest> getGetUserMethod;
    if ((getGetUserMethod = userGrpc.getGetUserMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getGetUserMethod = userGrpc.getGetUserMethod) == null) {
          userGrpc.getGetUserMethod = getGetUserMethod = 
              io.grpc.MethodDescriptor.<sistemasd.grpc.User.GetRequest, sistemasd.grpc.User.UsersRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sistemasd.grpc.User.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sistemasd.grpc.User.UsersRequest.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("GetUser"))
                  .build();
          }
        }
     }
     return getGetUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userStub newStub(io.grpc.Channel channel) {
    return new userStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new userBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new userFutureStub(channel);
  }

  /**
   */
  public static abstract class userImplBase implements io.grpc.BindableService {

    /**
     */
    public void createUser(sistemasd.grpc.User.CreateRequest request,
        io.grpc.stub.StreamObserver<sistemasd.grpc.User.UsersRequest> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    public void deleteUser(sistemasd.grpc.User.CreateRequest request,
        io.grpc.stub.StreamObserver<sistemasd.grpc.User.Empyt> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     */
    public void updateUser(sistemasd.grpc.User.UpdateRequest request,
        io.grpc.stub.StreamObserver<sistemasd.grpc.User.UsersRequest> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    public void listUser(sistemasd.grpc.User.Empyt request,
        io.grpc.stub.StreamObserver<sistemasd.grpc.User.ListRequest> responseObserver) {
      asyncUnimplementedUnaryCall(getListUserMethod(), responseObserver);
    }

    /**
     */
    public void getUser(sistemasd.grpc.User.GetRequest request,
        io.grpc.stub.StreamObserver<sistemasd.grpc.User.UsersRequest> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sistemasd.grpc.User.CreateRequest,
                sistemasd.grpc.User.UsersRequest>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getDeleteUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sistemasd.grpc.User.CreateRequest,
                sistemasd.grpc.User.Empyt>(
                  this, METHODID_DELETE_USER)))
          .addMethod(
            getUpdateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sistemasd.grpc.User.UpdateRequest,
                sistemasd.grpc.User.UsersRequest>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getListUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sistemasd.grpc.User.Empyt,
                sistemasd.grpc.User.ListRequest>(
                  this, METHODID_LIST_USER)))
          .addMethod(
            getGetUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sistemasd.grpc.User.GetRequest,
                sistemasd.grpc.User.UsersRequest>(
                  this, METHODID_GET_USER)))
          .build();
    }
  }

  /**
   */
  public static final class userStub extends io.grpc.stub.AbstractStub<userStub> {
    private userStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userStub(channel, callOptions);
    }

    /**
     */
    public void createUser(sistemasd.grpc.User.CreateRequest request,
        io.grpc.stub.StreamObserver<sistemasd.grpc.User.UsersRequest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(sistemasd.grpc.User.CreateRequest request,
        io.grpc.stub.StreamObserver<sistemasd.grpc.User.Empyt> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(sistemasd.grpc.User.UpdateRequest request,
        io.grpc.stub.StreamObserver<sistemasd.grpc.User.UsersRequest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listUser(sistemasd.grpc.User.Empyt request,
        io.grpc.stub.StreamObserver<sistemasd.grpc.User.ListRequest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUser(sistemasd.grpc.User.GetRequest request,
        io.grpc.stub.StreamObserver<sistemasd.grpc.User.UsersRequest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class userBlockingStub extends io.grpc.stub.AbstractStub<userBlockingStub> {
    private userBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userBlockingStub(channel, callOptions);
    }

    /**
     */
    public sistemasd.grpc.User.UsersRequest createUser(sistemasd.grpc.User.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public sistemasd.grpc.User.Empyt deleteUser(sistemasd.grpc.User.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public sistemasd.grpc.User.UsersRequest updateUser(sistemasd.grpc.User.UpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public sistemasd.grpc.User.ListRequest listUser(sistemasd.grpc.User.Empyt request) {
      return blockingUnaryCall(
          getChannel(), getListUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public sistemasd.grpc.User.UsersRequest getUser(sistemasd.grpc.User.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class userFutureStub extends io.grpc.stub.AbstractStub<userFutureStub> {
    private userFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sistemasd.grpc.User.UsersRequest> createUser(
        sistemasd.grpc.User.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sistemasd.grpc.User.Empyt> deleteUser(
        sistemasd.grpc.User.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sistemasd.grpc.User.UsersRequest> updateUser(
        sistemasd.grpc.User.UpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sistemasd.grpc.User.ListRequest> listUser(
        sistemasd.grpc.User.Empyt request) {
      return futureUnaryCall(
          getChannel().newCall(getListUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sistemasd.grpc.User.UsersRequest> getUser(
        sistemasd.grpc.User.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_DELETE_USER = 1;
  private static final int METHODID_UPDATE_USER = 2;
  private static final int METHODID_LIST_USER = 3;
  private static final int METHODID_GET_USER = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER:
          serviceImpl.createUser((sistemasd.grpc.User.CreateRequest) request,
              (io.grpc.stub.StreamObserver<sistemasd.grpc.User.UsersRequest>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((sistemasd.grpc.User.CreateRequest) request,
              (io.grpc.stub.StreamObserver<sistemasd.grpc.User.Empyt>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((sistemasd.grpc.User.UpdateRequest) request,
              (io.grpc.stub.StreamObserver<sistemasd.grpc.User.UsersRequest>) responseObserver);
          break;
        case METHODID_LIST_USER:
          serviceImpl.listUser((sistemasd.grpc.User.Empyt) request,
              (io.grpc.stub.StreamObserver<sistemasd.grpc.User.ListRequest>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((sistemasd.grpc.User.GetRequest) request,
              (io.grpc.stub.StreamObserver<sistemasd.grpc.User.UsersRequest>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class userBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sistemasd.grpc.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("user");
    }
  }

  private static final class userFileDescriptorSupplier
      extends userBaseDescriptorSupplier {
    userFileDescriptorSupplier() {}
  }

  private static final class userMethodDescriptorSupplier
      extends userBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (userGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userFileDescriptorSupplier())
              .addMethod(getCreateUserMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getListUserMethod())
              .addMethod(getGetUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
