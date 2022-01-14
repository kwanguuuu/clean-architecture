package buckpal.account.adapter.out.persistence;

import buckpal.domain.Account;
import buckpal.domain.Money;

public class AccountMapper {
	public Account mapToDomainEntity(AccountJpaEntity account) {
		return new Account(
				new Account.AccountId(account.getId()),
				Money.ZERO,
				null);
	}
}
