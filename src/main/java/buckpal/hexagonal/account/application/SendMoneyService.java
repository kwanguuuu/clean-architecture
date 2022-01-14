package buckpal.hexagonal.account.application;

import buckpal.hexagonal.account.application.port.in.SendMoneyUseCase;
import buckpal.hexagonal.account.application.port.out.LoadAccountPort;
import buckpal.hexagonal.account.application.port.out.UpdateAccountStatePort;
import buckpal.hexagonal.account.domain.Account;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
class SendMoneyService implements SendMoneyUseCase {
	private final LoadAccountPort loadPort;
	private final UpdateAccountStatePort updatePort;

	@Override
	public void send() {
		Account account = loadPort.loadAccount();

		// send biz logic
		// account.sendMoneyTo(money, account)

		updatePort.updateBalance(account);

	}
}
