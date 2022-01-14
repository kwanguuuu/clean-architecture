package buckpal.hierachy.domain;

import lombok.Value;

public class Account {
	private AccountId id;
	private Activity activity;

	@Value
	public static class AccountId {
		private final Long value;
	}
}
