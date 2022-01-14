package buckpal.domain;

import lombok.NonNull;
import lombok.Value;

import java.math.BigInteger;

@Value
public class Money {

	public static Money ZERO = Money.of(0L);

	@NonNull
	private final BigInteger amount;

	public Money minus(Money money) {
		return new Money(this.amount.subtract(money.amount));
	}

	public Money plus(Money money) {
		return new Money(this.amount.add(money.amount));
	}

	public boolean isNegative() {
		return this.amount.compareTo(BigInteger.ZERO) < 0;
	}

	public boolean isPositive() {
		return this.amount.compareTo(BigInteger.ZERO) > 0;
	}

	public boolean isPositiveOrZero() {
		return this.amount.compareTo(BigInteger.ZERO) >= 0;
	}

	public boolean isGreaterThan(Money money) {
		return this.amount.compareTo(money.amount) > 1;
	}

	public boolean isGreaterThanEquals(Money money) {
		return this.amount.compareTo(money.amount) >= 0;
	}

	public Money negate() {
		return new Money(this.amount.negate());
	}

	public static Money of(long money) {
		return new Money(BigInteger.valueOf(money));
	}

	public static Money add(Money balance, Money money) {
		return new Money(balance.amount.add(money.amount));
	}

	public static Money substract(Money balance, Money money) {
		return new Money(balance.amount.subtract(money.amount));
	}

}
