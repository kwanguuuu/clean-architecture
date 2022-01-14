package buckpal.hexagonal.account.application.port.out;

import buckpal.hexagonal.account.domain.Account;

public interface UpdateAccountStatePort {
	void updateBalance(Account account);
}
