package buckpal.account.adapter.out.persistence;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
@Data
public class AccountJpaEntity {

	@Id
	@GeneratedValue
	private Long id;
}
