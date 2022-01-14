package buckpal.hierachy.domain;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountService {
	private final AccountRepository repository;

	public void call(){
		repository.call();
	}
}
