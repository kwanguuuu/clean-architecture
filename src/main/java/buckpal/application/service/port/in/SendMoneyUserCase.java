package buckpal.application.service.port.in;

public interface SendMoneyUserCase {
	public boolean sendMoney(SendMoneyCommand command);
}
