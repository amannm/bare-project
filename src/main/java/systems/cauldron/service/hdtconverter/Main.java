package systems.cauldron.service.hdtconverter;

import java.util.List;
import java.util.concurrent.SubmissionPublisher;

public class Main {

    public static void main(final String[] args) {
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        EndSubscriber<String> subscriber = new EndSubscriber<>(5);
        publisher.subscribe(subscriber);
        List<String> items = List.of("1", "x", "2", "x", "3", "x");
        items.forEach(publisher::submit);
        publisher.close();
    }


}
