package CorbaQuiz;

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
 * <pre>
 * Service interface for the Quiz game operations
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Quiz.proto")
public final class QuizGameGrpc {

  private QuizGameGrpc() {}

  public static final String SERVICE_NAME = "CorbaQuiz.QuizGame";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<CorbaQuiz.QuizOuterClass.Empty,
      CorbaQuiz.QuizOuterClass.QuizSequence> getGetQuizMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQuiz",
      requestType = CorbaQuiz.QuizOuterClass.Empty.class,
      responseType = CorbaQuiz.QuizOuterClass.QuizSequence.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CorbaQuiz.QuizOuterClass.Empty,
      CorbaQuiz.QuizOuterClass.QuizSequence> getGetQuizMethod() {
    io.grpc.MethodDescriptor<CorbaQuiz.QuizOuterClass.Empty, CorbaQuiz.QuizOuterClass.QuizSequence> getGetQuizMethod;
    if ((getGetQuizMethod = QuizGameGrpc.getGetQuizMethod) == null) {
      synchronized (QuizGameGrpc.class) {
        if ((getGetQuizMethod = QuizGameGrpc.getGetQuizMethod) == null) {
          QuizGameGrpc.getGetQuizMethod = getGetQuizMethod = 
              io.grpc.MethodDescriptor.<CorbaQuiz.QuizOuterClass.Empty, CorbaQuiz.QuizOuterClass.QuizSequence>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CorbaQuiz.QuizGame", "GetQuiz"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CorbaQuiz.QuizOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CorbaQuiz.QuizOuterClass.QuizSequence.getDefaultInstance()))
                  .setSchemaDescriptor(new QuizGameMethodDescriptorSupplier("GetQuiz"))
                  .build();
          }
        }
     }
     return getGetQuizMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CorbaQuiz.QuizOuterClass.QuestionRequest,
      CorbaQuiz.QuizOuterClass.Quiz> getGetQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQuestion",
      requestType = CorbaQuiz.QuizOuterClass.QuestionRequest.class,
      responseType = CorbaQuiz.QuizOuterClass.Quiz.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CorbaQuiz.QuizOuterClass.QuestionRequest,
      CorbaQuiz.QuizOuterClass.Quiz> getGetQuestionMethod() {
    io.grpc.MethodDescriptor<CorbaQuiz.QuizOuterClass.QuestionRequest, CorbaQuiz.QuizOuterClass.Quiz> getGetQuestionMethod;
    if ((getGetQuestionMethod = QuizGameGrpc.getGetQuestionMethod) == null) {
      synchronized (QuizGameGrpc.class) {
        if ((getGetQuestionMethod = QuizGameGrpc.getGetQuestionMethod) == null) {
          QuizGameGrpc.getGetQuestionMethod = getGetQuestionMethod = 
              io.grpc.MethodDescriptor.<CorbaQuiz.QuizOuterClass.QuestionRequest, CorbaQuiz.QuizOuterClass.Quiz>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CorbaQuiz.QuizGame", "GetQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CorbaQuiz.QuizOuterClass.QuestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CorbaQuiz.QuizOuterClass.Quiz.getDefaultInstance()))
                  .setSchemaDescriptor(new QuizGameMethodDescriptorSupplier("GetQuestion"))
                  .build();
          }
        }
     }
     return getGetQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CorbaQuiz.QuizOuterClass.PlayerRegistration,
      CorbaQuiz.QuizOuterClass.Empty> getRegisterPlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterPlayer",
      requestType = CorbaQuiz.QuizOuterClass.PlayerRegistration.class,
      responseType = CorbaQuiz.QuizOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CorbaQuiz.QuizOuterClass.PlayerRegistration,
      CorbaQuiz.QuizOuterClass.Empty> getRegisterPlayerMethod() {
    io.grpc.MethodDescriptor<CorbaQuiz.QuizOuterClass.PlayerRegistration, CorbaQuiz.QuizOuterClass.Empty> getRegisterPlayerMethod;
    if ((getRegisterPlayerMethod = QuizGameGrpc.getRegisterPlayerMethod) == null) {
      synchronized (QuizGameGrpc.class) {
        if ((getRegisterPlayerMethod = QuizGameGrpc.getRegisterPlayerMethod) == null) {
          QuizGameGrpc.getRegisterPlayerMethod = getRegisterPlayerMethod = 
              io.grpc.MethodDescriptor.<CorbaQuiz.QuizOuterClass.PlayerRegistration, CorbaQuiz.QuizOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CorbaQuiz.QuizGame", "RegisterPlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CorbaQuiz.QuizOuterClass.PlayerRegistration.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CorbaQuiz.QuizOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new QuizGameMethodDescriptorSupplier("RegisterPlayer"))
                  .build();
          }
        }
     }
     return getRegisterPlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CorbaQuiz.QuizOuterClass.PlayerMove,
      CorbaQuiz.QuizOuterClass.Empty> getPlayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Play",
      requestType = CorbaQuiz.QuizOuterClass.PlayerMove.class,
      responseType = CorbaQuiz.QuizOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CorbaQuiz.QuizOuterClass.PlayerMove,
      CorbaQuiz.QuizOuterClass.Empty> getPlayMethod() {
    io.grpc.MethodDescriptor<CorbaQuiz.QuizOuterClass.PlayerMove, CorbaQuiz.QuizOuterClass.Empty> getPlayMethod;
    if ((getPlayMethod = QuizGameGrpc.getPlayMethod) == null) {
      synchronized (QuizGameGrpc.class) {
        if ((getPlayMethod = QuizGameGrpc.getPlayMethod) == null) {
          QuizGameGrpc.getPlayMethod = getPlayMethod = 
              io.grpc.MethodDescriptor.<CorbaQuiz.QuizOuterClass.PlayerMove, CorbaQuiz.QuizOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CorbaQuiz.QuizGame", "Play"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CorbaQuiz.QuizOuterClass.PlayerMove.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CorbaQuiz.QuizOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new QuizGameMethodDescriptorSupplier("Play"))
                  .build();
          }
        }
     }
     return getPlayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CorbaQuiz.QuizOuterClass.Empty,
      CorbaQuiz.QuizOuterClass.PlayerSequence> getGetPlayerScoresMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayerScores",
      requestType = CorbaQuiz.QuizOuterClass.Empty.class,
      responseType = CorbaQuiz.QuizOuterClass.PlayerSequence.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CorbaQuiz.QuizOuterClass.Empty,
      CorbaQuiz.QuizOuterClass.PlayerSequence> getGetPlayerScoresMethod() {
    io.grpc.MethodDescriptor<CorbaQuiz.QuizOuterClass.Empty, CorbaQuiz.QuizOuterClass.PlayerSequence> getGetPlayerScoresMethod;
    if ((getGetPlayerScoresMethod = QuizGameGrpc.getGetPlayerScoresMethod) == null) {
      synchronized (QuizGameGrpc.class) {
        if ((getGetPlayerScoresMethod = QuizGameGrpc.getGetPlayerScoresMethod) == null) {
          QuizGameGrpc.getGetPlayerScoresMethod = getGetPlayerScoresMethod = 
              io.grpc.MethodDescriptor.<CorbaQuiz.QuizOuterClass.Empty, CorbaQuiz.QuizOuterClass.PlayerSequence>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CorbaQuiz.QuizGame", "GetPlayerScores"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CorbaQuiz.QuizOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CorbaQuiz.QuizOuterClass.PlayerSequence.getDefaultInstance()))
                  .setSchemaDescriptor(new QuizGameMethodDescriptorSupplier("GetPlayerScores"))
                  .build();
          }
        }
     }
     return getGetPlayerScoresMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CorbaQuiz.QuizOuterClass.Player,
      CorbaQuiz.QuizOuterClass.PlayerScore> getGetPlayerScoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPlayerScore",
      requestType = CorbaQuiz.QuizOuterClass.Player.class,
      responseType = CorbaQuiz.QuizOuterClass.PlayerScore.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CorbaQuiz.QuizOuterClass.Player,
      CorbaQuiz.QuizOuterClass.PlayerScore> getGetPlayerScoreMethod() {
    io.grpc.MethodDescriptor<CorbaQuiz.QuizOuterClass.Player, CorbaQuiz.QuizOuterClass.PlayerScore> getGetPlayerScoreMethod;
    if ((getGetPlayerScoreMethod = QuizGameGrpc.getGetPlayerScoreMethod) == null) {
      synchronized (QuizGameGrpc.class) {
        if ((getGetPlayerScoreMethod = QuizGameGrpc.getGetPlayerScoreMethod) == null) {
          QuizGameGrpc.getGetPlayerScoreMethod = getGetPlayerScoreMethod = 
              io.grpc.MethodDescriptor.<CorbaQuiz.QuizOuterClass.Player, CorbaQuiz.QuizOuterClass.PlayerScore>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CorbaQuiz.QuizGame", "getPlayerScore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CorbaQuiz.QuizOuterClass.Player.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CorbaQuiz.QuizOuterClass.PlayerScore.getDefaultInstance()))
                  .setSchemaDescriptor(new QuizGameMethodDescriptorSupplier("getPlayerScore"))
                  .build();
          }
        }
     }
     return getGetPlayerScoreMethod;
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
   * <pre>
   * Service interface for the Quiz game operations
   * </pre>
   */
  public static abstract class QuizGameImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get all the available quizzes
     * </pre>
     */
    public void getQuiz(CorbaQuiz.QuizOuterClass.Empty request,
        io.grpc.stub.StreamObserver<CorbaQuiz.QuizOuterClass.QuizSequence> responseObserver) {
      asyncUnimplementedUnaryCall(getGetQuizMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific quiz question by its ID
     * </pre>
     */
    public void getQuestion(CorbaQuiz.QuizOuterClass.QuestionRequest request,
        io.grpc.stub.StreamObserver<CorbaQuiz.QuizOuterClass.Quiz> responseObserver) {
      asyncUnimplementedUnaryCall(getGetQuestionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Register a player for the quiz game
     * </pre>
     */
    public void registerPlayer(CorbaQuiz.QuizOuterClass.PlayerRegistration request,
        io.grpc.stub.StreamObserver<CorbaQuiz.QuizOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterPlayerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Make a player's move (submit an answer for a quiz)
     * </pre>
     */
    public void play(CorbaQuiz.QuizOuterClass.PlayerMove request,
        io.grpc.stub.StreamObserver<CorbaQuiz.QuizOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getPlayMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the list of player scores
     * </pre>
     */
    public void getPlayerScores(CorbaQuiz.QuizOuterClass.Empty request,
        io.grpc.stub.StreamObserver<CorbaQuiz.QuizOuterClass.PlayerSequence> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPlayerScoresMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the player's score
     * </pre>
     */
    public void getPlayerScore(CorbaQuiz.QuizOuterClass.Player request,
        io.grpc.stub.StreamObserver<CorbaQuiz.QuizOuterClass.PlayerScore> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPlayerScoreMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetQuizMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CorbaQuiz.QuizOuterClass.Empty,
                CorbaQuiz.QuizOuterClass.QuizSequence>(
                  this, METHODID_GET_QUIZ)))
          .addMethod(
            getGetQuestionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CorbaQuiz.QuizOuterClass.QuestionRequest,
                CorbaQuiz.QuizOuterClass.Quiz>(
                  this, METHODID_GET_QUESTION)))
          .addMethod(
            getRegisterPlayerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CorbaQuiz.QuizOuterClass.PlayerRegistration,
                CorbaQuiz.QuizOuterClass.Empty>(
                  this, METHODID_REGISTER_PLAYER)))
          .addMethod(
            getPlayMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CorbaQuiz.QuizOuterClass.PlayerMove,
                CorbaQuiz.QuizOuterClass.Empty>(
                  this, METHODID_PLAY)))
          .addMethod(
            getGetPlayerScoresMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CorbaQuiz.QuizOuterClass.Empty,
                CorbaQuiz.QuizOuterClass.PlayerSequence>(
                  this, METHODID_GET_PLAYER_SCORES)))
          .addMethod(
            getGetPlayerScoreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CorbaQuiz.QuizOuterClass.Player,
                CorbaQuiz.QuizOuterClass.PlayerScore>(
                  this, METHODID_GET_PLAYER_SCORE)))
          .build();
    }
  }

  /**
   * <pre>
   * Service interface for the Quiz game operations
   * </pre>
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
     * <pre>
     * Get all the available quizzes
     * </pre>
     */
    public void getQuiz(CorbaQuiz.QuizOuterClass.Empty request,
        io.grpc.stub.StreamObserver<CorbaQuiz.QuizOuterClass.QuizSequence> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetQuizMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific quiz question by its ID
     * </pre>
     */
    public void getQuestion(CorbaQuiz.QuizOuterClass.QuestionRequest request,
        io.grpc.stub.StreamObserver<CorbaQuiz.QuizOuterClass.Quiz> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Register a player for the quiz game
     * </pre>
     */
    public void registerPlayer(CorbaQuiz.QuizOuterClass.PlayerRegistration request,
        io.grpc.stub.StreamObserver<CorbaQuiz.QuizOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterPlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Make a player's move (submit an answer for a quiz)
     * </pre>
     */
    public void play(CorbaQuiz.QuizOuterClass.PlayerMove request,
        io.grpc.stub.StreamObserver<CorbaQuiz.QuizOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPlayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the list of player scores
     * </pre>
     */
    public void getPlayerScores(CorbaQuiz.QuizOuterClass.Empty request,
        io.grpc.stub.StreamObserver<CorbaQuiz.QuizOuterClass.PlayerSequence> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPlayerScoresMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the player's score
     * </pre>
     */
    public void getPlayerScore(CorbaQuiz.QuizOuterClass.Player request,
        io.grpc.stub.StreamObserver<CorbaQuiz.QuizOuterClass.PlayerScore> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPlayerScoreMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service interface for the Quiz game operations
   * </pre>
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
     * <pre>
     * Get all the available quizzes
     * </pre>
     */
    public CorbaQuiz.QuizOuterClass.QuizSequence getQuiz(CorbaQuiz.QuizOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetQuizMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific quiz question by its ID
     * </pre>
     */
    public CorbaQuiz.QuizOuterClass.Quiz getQuestion(CorbaQuiz.QuizOuterClass.QuestionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetQuestionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Register a player for the quiz game
     * </pre>
     */
    public CorbaQuiz.QuizOuterClass.Empty registerPlayer(CorbaQuiz.QuizOuterClass.PlayerRegistration request) {
      return blockingUnaryCall(
          getChannel(), getRegisterPlayerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Make a player's move (submit an answer for a quiz)
     * </pre>
     */
    public CorbaQuiz.QuizOuterClass.Empty play(CorbaQuiz.QuizOuterClass.PlayerMove request) {
      return blockingUnaryCall(
          getChannel(), getPlayMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the list of player scores
     * </pre>
     */
    public CorbaQuiz.QuizOuterClass.PlayerSequence getPlayerScores(CorbaQuiz.QuizOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetPlayerScoresMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the player's score
     * </pre>
     */
    public CorbaQuiz.QuizOuterClass.PlayerScore getPlayerScore(CorbaQuiz.QuizOuterClass.Player request) {
      return blockingUnaryCall(
          getChannel(), getGetPlayerScoreMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service interface for the Quiz game operations
   * </pre>
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
     * <pre>
     * Get all the available quizzes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<CorbaQuiz.QuizOuterClass.QuizSequence> getQuiz(
        CorbaQuiz.QuizOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetQuizMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific quiz question by its ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<CorbaQuiz.QuizOuterClass.Quiz> getQuestion(
        CorbaQuiz.QuizOuterClass.QuestionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetQuestionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Register a player for the quiz game
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<CorbaQuiz.QuizOuterClass.Empty> registerPlayer(
        CorbaQuiz.QuizOuterClass.PlayerRegistration request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterPlayerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Make a player's move (submit an answer for a quiz)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<CorbaQuiz.QuizOuterClass.Empty> play(
        CorbaQuiz.QuizOuterClass.PlayerMove request) {
      return futureUnaryCall(
          getChannel().newCall(getPlayMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the list of player scores
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<CorbaQuiz.QuizOuterClass.PlayerSequence> getPlayerScores(
        CorbaQuiz.QuizOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPlayerScoresMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the player's score
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<CorbaQuiz.QuizOuterClass.PlayerScore> getPlayerScore(
        CorbaQuiz.QuizOuterClass.Player request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPlayerScoreMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_QUIZ = 0;
  private static final int METHODID_GET_QUESTION = 1;
  private static final int METHODID_REGISTER_PLAYER = 2;
  private static final int METHODID_PLAY = 3;
  private static final int METHODID_GET_PLAYER_SCORES = 4;
  private static final int METHODID_GET_PLAYER_SCORE = 5;

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
          serviceImpl.getQuiz((CorbaQuiz.QuizOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<CorbaQuiz.QuizOuterClass.QuizSequence>) responseObserver);
          break;
        case METHODID_GET_QUESTION:
          serviceImpl.getQuestion((CorbaQuiz.QuizOuterClass.QuestionRequest) request,
              (io.grpc.stub.StreamObserver<CorbaQuiz.QuizOuterClass.Quiz>) responseObserver);
          break;
        case METHODID_REGISTER_PLAYER:
          serviceImpl.registerPlayer((CorbaQuiz.QuizOuterClass.PlayerRegistration) request,
              (io.grpc.stub.StreamObserver<CorbaQuiz.QuizOuterClass.Empty>) responseObserver);
          break;
        case METHODID_PLAY:
          serviceImpl.play((CorbaQuiz.QuizOuterClass.PlayerMove) request,
              (io.grpc.stub.StreamObserver<CorbaQuiz.QuizOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GET_PLAYER_SCORES:
          serviceImpl.getPlayerScores((CorbaQuiz.QuizOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<CorbaQuiz.QuizOuterClass.PlayerSequence>) responseObserver);
          break;
        case METHODID_GET_PLAYER_SCORE:
          serviceImpl.getPlayerScore((CorbaQuiz.QuizOuterClass.Player) request,
              (io.grpc.stub.StreamObserver<CorbaQuiz.QuizOuterClass.PlayerScore>) responseObserver);
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
      return CorbaQuiz.QuizOuterClass.getDescriptor();
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
              .addMethod(getGetPlayerScoreMethod())
              .build();
        }
      }
    }
    return result;
  }
}
