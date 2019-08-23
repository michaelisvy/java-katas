package kata.foobarqix;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class FooBarQixTest {

    private FooBarQix fooBarQix = new FooBarQix();

    @Test
    public void shouldTestPlainNumber() { // 1 -> 1
        assertThat(fooBarQix.fooBarQixResult(1)).isEqualTo("1");
    }

    @Test
    public void shouldTestSimpleFoo() { // 6 -> Foo
        assertThat(fooBarQix.fooBarQixResult(6)).isEqualTo("Foo");
    }

    @Test
    public void shouldTestSimpleBar() { // 10 -> Bar
        assertThat(fooBarQix.fooBarQixResult(10)).isEqualTo("Bar");
    }

    @Test
    public void shouldTestSimpleQix() { // 14 -> Qix
        assertThat(fooBarQix.fooBarQixResult(14)).isEqualTo("Qix");
    }

    @Test
    public void shouldTestNumberIncluded() { // 13 -> Foo
        assertThat(fooBarQix.fooBarQixResult(13)).isEqualTo("Foo");
    }

    @Test
    public void shouldTestDoubleCondition() { // 60 -> FooBar
        assertThat((fooBarQix.fooBarQixResult(60))).isEqualTo("FooBar");
    }

    @Test
    public void shouldTestDoubleIdenticalCondition() { // 3 -> FooFoo
        assertThat(fooBarQix.fooBarQixResult(3)).isEqualTo("FooFoo");
    }
}
