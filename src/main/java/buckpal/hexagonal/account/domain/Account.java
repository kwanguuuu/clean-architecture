package buckpal.hexagonal.account.domain;

import lombok.Value;

public class Account {
	private AccountId id;


	@Value
	private static class AccountId {
		private final Long id;
	}
}
