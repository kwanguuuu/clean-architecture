package buckpal.function.account;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
class SendMoneyService {
	private final AccountRepository repository;
	private final AccountRepositoryImpl repositoryImpl;

	public void wrongApproach(){
		// p26. 도메인 코드와 영속성 코드 간의 의존성을 역전시켜서 SendMoneyService가 AccountRepository 인터페이스만 알고 있고
		// 구현체는 알 수 없게 했음에도 불구하고,
		// package-private 접근 수준을 이용해 도메인 코드가 실수로 영속성 코드에 의존하는 것을 막을 수 없다.
		repositoryImpl.selfCall();
	}
}
