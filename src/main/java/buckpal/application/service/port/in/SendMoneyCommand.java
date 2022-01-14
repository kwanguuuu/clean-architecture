package buckpal.application.service.port.in;

import buckpal.common.SelfValidating;
import buckpal.domain.Account;
import buckpal.domain.Money;
import lombok.Getter;

@Getter
public class SendMoneyCommand extends SelfValidating<SendMoneyCommand> {

	private final Account.AccountId sourceAccountId;
	private final Account.AccountId targetAccountId;
	private final Money money;

	// 책의 저자는 생성자를 통한 역할 수행을 선호하는 듯.
	public SendMoneyCommand(Account.AccountId sourceAccountId, Account.AccountId targetAccountId, Money money) {
		this.sourceAccountId = sourceAccountId;
		this.targetAccountId = targetAccountId;
		this.money = money;

		this.validateSelf();
	}
}
