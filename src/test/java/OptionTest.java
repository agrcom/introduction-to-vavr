import io.vavr.control.Option;
import org.junit.Test;

public class OptionTest {

    @Test
    public void basic() {
        String text = "Lorum ipsum";

        String result = Option.of(text)
                .map(String::toLowerCase)
                .getOrElse("");

        assert !result.isEmpty();
        assert result.equals(text.toLowerCase());
    }
}
