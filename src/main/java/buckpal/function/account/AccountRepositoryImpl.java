package buckpal.function.account;


class AccountRepositoryImpl implements AccountRepository {
	public void selfCall() {
		System.out.println("call");
	}
}
