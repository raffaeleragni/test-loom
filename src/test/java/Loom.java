

import java.util.concurrent.Executors;
import org.junit.jupiter.api.Test;

class Loom {
  @Test void test() {
    try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
      for (int i = 0; i< 1_000_000; i++)
        executor.submit(() -> System.out.println("ASD"));
    }
  }
}
