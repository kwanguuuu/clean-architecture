package buckpal.function.account;

import lombok.Value;

class Account {
	private AccountId id;
	private Activity activity;

	@Value
	public static class AccountId {
		private final Long value;
	}
}
