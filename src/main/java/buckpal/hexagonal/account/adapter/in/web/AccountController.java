package buckpal.hexagonal.account.adapter.in.web;

import buckpal.hexagonal.account.application.port.in.SendMoneyUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class AccountController {
	private final SendMoneyUseCase sendMoney;

	public void sendMoney(){
		sendMoney.send();
	}

}
