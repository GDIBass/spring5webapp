package guru.springframework;

import java.util.Objects;

public abstract class Money {

  protected final int amount;
  protected final String currency;

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public String currency() {
    return currency;
  }

  public static Money dollar(int value) {
    return new Dollar(value, "USD");
  }

  public static Money franc(int value) {
    return new Franc(value, "CHF");
  }

  public abstract Money times(int multiplier);

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Money money = (Money) o;
    return amount == money.amount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount);
  }
}
