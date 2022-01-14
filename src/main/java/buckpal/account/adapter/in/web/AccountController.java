package buckpal.account.adapter.in.web;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AccountController {
	@GetMapping("/accounts")
	List<AccountInfo> listAccounts(){
		// TODO: 2022/01/13
	}

	@GetMapping("/accounts/{accountId}")
	AccountInfo getAccount(@PathVariable("accountId") Long accountId) {
		// TODO: 2022/01/13
	}

	@GetMapping("/accounts/{accountId}/balance")
	Long geAccountBalance(@PathVariable("accountId") Long accountId) {
		// TODO: 2022/01/13
	}
	@PostMapping("/accounts")
	AccountInfo registerAccount(@RequestBody RegisterAccount account) {
		// TODO: 2022/01/13
	}

}
