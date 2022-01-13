package buckpal.account.adapter.out.persistence;

import buckpal.application.service.port.out.LoadAccountPort;
import buckpal.application.service.port.out.UpdateAccountStatePort;
import buckpal.domain.Account;
import buckpal.domain.Account.AccountId;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDateTime;

@RequiredArgsConstructor
@Component
public class AccountPersistenceAdapter implements LoadAccountPort, UpdateAccountStatePort {

	private final AccountRepository accountRepository;
	private final ActivityRepository activityRepository;
	private final AccountMapper accountMapper;

	@Override
	public Account loadAccount(AccountId accountId, LocalDateTime baselineDate) {

		AccountJpaEntity account = accountRepository.findById(accountId.getId()).orElseThrow(EntityNotFoundException::new);
		//...

		accountMapper.mapToDomainEntity(account);
	}
}
