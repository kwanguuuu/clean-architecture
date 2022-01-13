package buckpal.application.service.port.out;

import buckpal.domain.Account;
import buckpal.domain.Account.AccountId;

import java.time.LocalDateTime;

public interface LoadAccountPort {

	public Account loadAccount(AccountId accountId, LocalDateTime baselineDate);
}
