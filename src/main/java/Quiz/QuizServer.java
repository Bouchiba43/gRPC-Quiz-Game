package Quiz;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class QuizServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(1323)
                .addService(new ServiceQuizGame())
                .build();

        System.out.println("Starting server on port 1323...");
        server.start();
        System.out.println("Server started!");
        server.awaitTermination();

    }
}
