package buckpal.account.adapter.in.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
public class SendMoneyController {

	@PostMapping("/accounts/send/{sourceAccountId}/{targetAccountId}/{amount}")
	RegisterAccount sendMoney(
			@PathVariable("sourceAccountId") Long sourceAccountId,
			@PathVariable("targetAccountId") Long targetAccountId,
			@PathVariable("amount") Long amount
	) {
		// TODO: 2022/01/13
	}
}
