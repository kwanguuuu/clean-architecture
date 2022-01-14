package buckpal.hexagonal.account.application.port.out;

import buckpal.hexagonal.account.domain.Account;

public interface LoadAccountPort {
	Account loadAccount();
}
