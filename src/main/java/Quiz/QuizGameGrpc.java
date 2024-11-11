package Quiz;

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
    comments = "Source: Quiz.proto")
public final class QuizGameGrpc {

  private QuizGameGrpc() {}

  public static final String SERVICE_NAME = "Quiz.QuizGame";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      Quiz.QuizOuterClass.QuizSequence> getGetQuizMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQuiz",
      requestType = com.google.protobuf.Empty.class,
      responseType = Quiz.QuizOuterClass.QuizSequence.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      Quiz.QuizOuterClass.QuizSequence> getGetQuizMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, Quiz.QuizOuterClass.QuizSequence> getGetQuizMethod;
    if ((getGetQuizMethod = QuizGameGrpc.getGetQuizMethod) == null) {
      synchronized (QuizGameGrpc.class) {
        if ((getGetQuizMethod = QuizGameGrpc.getGetQuizMethod) == null) {
          QuizGameGrpc.getGetQuizMethod = getGetQuizMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, Quiz.QuizOuterClass.QuizSequence>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Quiz.QuizGame", "GetQuiz"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Quiz.QuizOuterClass.QuizSequence.getDefaultInstance()))
                  .setSchemaDescriptor(new QuizGameMethodDescriptorSupplier("GetQuiz"))
                  .build();
          }
        }
     }
     return getGetQuizMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Quiz.QuizOuterClass.QuizId,
      Quiz.QuizOuterClass.Quiz> getGetQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQuestion",
      requestType = Quiz.QuizOuterClass.QuizId.class,
      responseType = Quiz.QuizOuterClass.Quiz.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Quiz.QuizOuterClass.QuizId,
      Quiz.QuizOuterClass.Quiz> getGetQuestionMethod() {
    io.grpc.MethodDescriptor<Quiz.QuizOuterClass.QuizId, Quiz.QuizOuterClass.Quiz> getGetQuestionMethod;
    if ((getGetQuestionMethod = QuizGameGrpc.getGetQuestionMethod) == null) {
      synchronized (QuizGameGrpc.class) {
        if ((getGetQuestionMethod = QuizGameGrpc.getGetQuestionMethod) == null) {
          QuizGameGrpc.getGetQuestionMethod = getGetQuestionMethod = 
              io.grpc.MethodDescriptor.<Quiz.QuizOuterClass.QuizId, Quiz.QuizOuterClass.Quiz>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Quiz.QuizGame", "GetQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Quiz.QuizOuterClass.QuizId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Quiz.QuizOuterClass.Quiz.getDefaultInstance()))
                  .setSchemaDescriptor(new QuizGameMethodDescriptorSupplier("GetQuestion"))
                  .build();
          }
        }
     }
     return getGetQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Quiz.QuizOuterClass.RegisterPlayerRequest,
      com.google.protobuf.Empty> getRegisterPlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterPlayer",
      requestType = Quiz.QuizOuterClass.RegisterPlayerRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Quiz.QuizOuterClass.RegisterPlayerRequest,
      com.google.protobuf.Empty> getRegisterPlayerMethod() {
    io.grpc.MethodDescriptor<Quiz.QuizOuterClass.RegisterPlayerRequest, com.google.protobuf.Empty> getRegisterPlayerMethod;
    if ((getRegisterPlayerMethod = QuizGameGrpc.getRegisterPlayerMethod) == null) {
      synchronized (QuizGameGrpc.class) {
        if ((getRegisterPlayerMethod = QuizGameGrpc.getRegisterPlayerMethod) == null) {
          QuizGameGrpc.getRegisterPlayerMethod = getRegisterPlayerMethod = 
              io.grpc.MethodDescriptor.<Quiz.QuizOuterClass.RegisterPlayerRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Quiz.QuizGame", "RegisterPlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Quiz.QuizOuterClass.RegisterPlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new QuizGameMethodDescriptorSupplier("RegisterPlayer"))
                  .build();
          }
        }
     }
     return getRegisterPlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Quiz.QuizOuterClass.PlayRequest,
      com.google.protobuf.Empty> getPlayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Play",
      requestType = Quiz.QuizOuterClass.PlayRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Quiz.QuizOuterClass.PlayRequest,
      com.google.protobuf.Empty> getPlayMethod() {
    io.grpc.MethodDescriptor<Quiz.QuizOuterClass.PlayRequest, com.google.protobuf.Empty> getPlayMethod;
    if ((getPlayMethod = QuizGameGrpc.getPlayMethod) == null) {
      synchronized (QuizGameGrpc.class) {
        if ((getPlayMethod = QuizGameGrpc.getPlayMethod) == null) {
          QuizGameGrpc.getPlayMethod = getPlayMethod = 
              io.grpc.MethodDescriptor.<Quiz.QuizOuterClass.PlayRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Quiz.QuizGame", "Play"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Quiz.QuizOuterClass.PlayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new QuizGameMethodDescriptorSupplier("Play"))
                  .build();
          }
        }
     }
     return getPlayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      Quiz.QuizOuterClass.PlayerSequence> getGetPlayerScoresMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayerScores",
      requestType = com.google.protobuf.Empty.class,
      responseType = Quiz.QuizOuterClass.PlayerSequence.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      Quiz.QuizOuterClass.PlayerSequence> getGetPlayerScoresMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, Quiz.QuizOuterClass.PlayerSequence> getGetPlayerScoresMethod;
    if ((getGetPlayerScoresMethod = QuizGameGrpc.getGetPlayerScoresMethod) == null) {
      synchronized (QuizGameGrpc.class) {
        if ((getGetPlayerScoresMethod = QuizGameGrpc.getGetPlayerScoresMethod) == null) {
          QuizGameGrpc.getGetPlayerScoresMethod = getGetPlayerScoresMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, Quiz.QuizOuterClass.PlayerSequence>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Quiz.QuizGame", "GetPlayerScores"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Quiz.QuizOuterClass.PlayerSequence.getDefaultInstance()))
                  .setSchemaDescriptor(new QuizGameMethodDescriptorSupplier("GetPlayerScores"))
                  .build();
          }
        }
     }
     return getGetPlayerScoresMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QuizGameStub newStub(io.grpc.Channel channel) {
    return new QuizGameStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QuizGameBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QuizGameBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QuizGameFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QuizGameFutureStub(channel);
  }

  /**
   */
  public static abstract class QuizGameImplBase implements io.grpc.BindableService {

    /**
     */
    public void getQuiz(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<Quiz.QuizOuterClass.QuizSequence> responseObserver) {
      asyncUnimplementedUnaryCall(getGetQuizMethod(), responseObserver);
    }

    /**
     */
    public void getQuestion(Quiz.QuizOuterClass.QuizId request,
        io.grpc.stub.StreamObserver<Quiz.QuizOuterClass.Quiz> responseObserver) {
      asyncUnimplementedUnaryCall(getGetQuestionMethod(), responseObserver);
    }

    /**
     */
    public void registerPlayer(Quiz.QuizOuterClass.RegisterPlayerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterPlayerMethod(), responseObserver);
    }

    /**
     */
    public void play(Quiz.QuizOuterClass.PlayRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getPlayMethod(), responseObserver);
    }

    /**
     */
    public void getPlayerScores(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<Quiz.QuizOuterClass.PlayerSequence> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPlayerScoresMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetQuizMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                Quiz.QuizOuterClass.QuizSequence>(
                  this, METHODID_GET_QUIZ)))
          .addMethod(
            getGetQuestionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Quiz.QuizOuterClass.QuizId,
                Quiz.QuizOuterClass.Quiz>(
                  this, METHODID_GET_QUESTION)))
          .addMethod(
            getRegisterPlayerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Quiz.QuizOuterClass.RegisterPlayerRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_REGISTER_PLAYER)))
          .addMethod(
            getPlayMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Quiz.QuizOuterClass.PlayRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_PLAY)))
          .addMethod(
            getGetPlayerScoresMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                Quiz.QuizOuterClass.PlayerSequence>(
                  this, METHODID_GET_PLAYER_SCORES)))
          .build();
    }
  }

  /**
   */
  public static final class QuizGameStub extends io.grpc.stub.AbstractStub<QuizGameStub> {
    private QuizGameStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QuizGameStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuizGameStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QuizGameStub(channel, callOptions);
    }

    /**
     */
    public void getQuiz(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<Quiz.QuizOuterClass.QuizSequence> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetQuizMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getQuestion(Quiz.QuizOuterClass.QuizId request,
        io.grpc.stub.StreamObserver<Quiz.QuizOuterClass.Quiz> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerPlayer(Quiz.QuizOuterClass.RegisterPlayerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterPlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void play(Quiz.QuizOuterClass.PlayRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPlayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPlayerScores(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<Quiz.QuizOuterClass.PlayerSequence> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPlayerScoresMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class QuizGameBlockingStub extends io.grpc.stub.AbstractStub<QuizGameBlockingStub> {
    private QuizGameBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QuizGameBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuizGameBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QuizGameBlockingStub(channel, callOptions);
    }

    /**
     */
    public Quiz.QuizOuterClass.QuizSequence getQuiz(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetQuizMethod(), getCallOptions(), request);
    }

    /**
     */
    public Quiz.QuizOuterClass.Quiz getQuestion(Quiz.QuizOuterClass.QuizId request) {
      return blockingUnaryCall(
          getChannel(), getGetQuestionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty registerPlayer(Quiz.QuizOuterClass.RegisterPlayerRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterPlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty play(Quiz.QuizOuterClass.PlayRequest request) {
      return blockingUnaryCall(
          getChannel(), getPlayMethod(), getCallOptions(), request);
    }

    /**
     */
    public Quiz.QuizOuterClass.PlayerSequence getPlayerScores(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetPlayerScoresMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class QuizGameFutureStub extends io.grpc.stub.AbstractStub<QuizGameFutureStub> {
    private QuizGameFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QuizGameFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuizGameFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QuizGameFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Quiz.QuizOuterClass.QuizSequence> getQuiz(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetQuizMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Quiz.QuizOuterClass.Quiz> getQuestion(
        Quiz.QuizOuterClass.QuizId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetQuestionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> registerPlayer(
        Quiz.QuizOuterClass.RegisterPlayerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterPlayerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> play(
        Quiz.QuizOuterClass.PlayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPlayMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Quiz.QuizOuterClass.PlayerSequence> getPlayerScores(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPlayerScoresMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_QUIZ = 0;
  private static final int METHODID_GET_QUESTION = 1;
  private static final int METHODID_REGISTER_PLAYER = 2;
  private static final int METHODID_PLAY = 3;
  private static final int METHODID_GET_PLAYER_SCORES = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QuizGameImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QuizGameImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_QUIZ:
          serviceImpl.getQuiz((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<Quiz.QuizOuterClass.QuizSequence>) responseObserver);
          break;
        case METHODID_GET_QUESTION:
          serviceImpl.getQuestion((Quiz.QuizOuterClass.QuizId) request,
              (io.grpc.stub.StreamObserver<Quiz.QuizOuterClass.Quiz>) responseObserver);
          break;
        case METHODID_REGISTER_PLAYER:
          serviceImpl.registerPlayer((Quiz.QuizOuterClass.RegisterPlayerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_PLAY:
          serviceImpl.play((Quiz.QuizOuterClass.PlayRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_PLAYER_SCORES:
          serviceImpl.getPlayerScores((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<Quiz.QuizOuterClass.PlayerSequence>) responseObserver);
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

  private static abstract class QuizGameBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QuizGameBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Quiz.QuizOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QuizGame");
    }
  }

  private static final class QuizGameFileDescriptorSupplier
      extends QuizGameBaseDescriptorSupplier {
    QuizGameFileDescriptorSupplier() {}
  }

  private static final class QuizGameMethodDescriptorSupplier
      extends QuizGameBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QuizGameMethodDescriptorSupplier(String methodName) {
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
      synchronized (QuizGameGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QuizGameFileDescriptorSupplier())
              .addMethod(getGetQuizMethod())
              .addMethod(getGetQuestionMethod())
              .addMethod(getRegisterPlayerMethod())
              .addMethod(getPlayMethod())
              .addMethod(getGetPlayerScoresMethod())
              .build();
        }
      }
    }
    return result;
  }
}
