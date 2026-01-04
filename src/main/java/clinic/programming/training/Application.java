package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {

  public int countWords(String words) {
    String[] separeteWords = StringUtils.split(words, " ");
    return (separeteWords == null) ? 0 : separeteWords.length;
  }

  public void greed() {
    List<String> greetings = new ArrayList<>();
    greetings.add("Hello");

    for (String greeting : greetings) {
      System.out.println("Greeting: " + greeting);
    }
  }

  public Application() {
    System.out.println("Inside Application");
  }

  // method main(): ALWAYS the APPLICATION entry point
  public static void main(String[] args) {
    System.out.println("Starting Application");
    Application app = new Application();
    app.greed();
    int count = app.countWords("I have four words");
    System.out.println("Word Count: " + count);
  }
}
