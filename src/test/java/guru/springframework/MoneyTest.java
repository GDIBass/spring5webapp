package guru.springframework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {

  @Test
  void testMultiplication() {
    Money five = Money.dollar(5);
    Assertions.assertEquals(Money.dollar(10), five.times(2));
    Assertions.assertEquals(Money.dollar(15), five.times(3));
  }

  @Test
  void testEquality() {
    Assertions.assertEquals(Money.dollar(5), Money.dollar(5));
    Assertions.assertNotEquals(Money.dollar(5), Money.dollar(8));
  }

  @Test
  void testEqualityFranc() {
    Assertions.assertEquals(Money.franc(5), Money.franc(5));
    Assertions.assertNotEquals(Money.franc(5), Money.franc(10));
  }

  @Test
  void testDifferentCurrenciesNotTheSame() {
    Assertions.assertNotEquals(Money.dollar(5), Money.franc(5));
  }

  @Test
  void testCurrency() {
    Assertions.assertEquals("USD", Money.dollar(1).currency());
    Assertions.assertEquals("CHF", Money.franc(1).currency());
  }
}