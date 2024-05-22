// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {

    int days = 0;
    Feeder cage = new Feeder(2400);
    days = cage.simualateManyDays(220,5);
    System.out.println(days);
  }

}
