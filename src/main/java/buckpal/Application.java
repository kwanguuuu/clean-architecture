package buckpal;

import buckpal.account.adapter.in.web.SendMoneyController;
import buckpal.account.adapter.out.persistence.AccountPersistenceAdapter;
import buckpal.account.adapter.out.persistence.AccountRepository;
import buckpal.account.adapter.out.persistence.ActivityRepository;
import buckpal.application.service.SendMoneyService;
import buckpal.application.service.port.in.SendMoneyUserCase;

public class Application {
	public static void main(String[] args) {

		AccountRepository accountRepository = null; // 구현체를 안 만들어놓음.
		ActivityRepository activityRepository = null;

		AccountPersistenceAdapter accountPersistenceAdapter = new AccountPersistenceAdapter(accountRepository, activityRepository, null);

		SendMoneyUserCase sendMoneyUserCase = new SendMoneyService(accountPersistenceAdapter, accountPersistenceAdapter);

		SendMoneyController sendMoneyController = new SendMoneyController(sendMoneyUserCase);


	}
}
