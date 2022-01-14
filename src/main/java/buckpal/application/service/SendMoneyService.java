package buckpal.application.service;

import buckpal.application.service.port.in.SendMoneyCommand;
import buckpal.application.service.port.in.SendMoneyUserCase;
import buckpal.application.service.port.out.LoadAccountPort;
import buckpal.application.service.port.out.UpdateAccountStatePort;
import lombok.RequiredArgsConstructor;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Transactional
public class SendMoneyService implements SendMoneyUserCase {

	private final LoadAccountPort loadAccountPort;
//	private final AccountLock accountLock;
	private final UpdateAccountStatePort updateAccountStatePort;

	@Override
	public boolean sendMoney(SendMoneyCommand command) {
		// TODO: 2022/01/10 비즈니스 규칙 검증
		// TODO: 2022/01/10 모델 상태 조작
		// TODO: 2022/01/10 출력 값 반환
		return false;
	}
}
