package com.example.registry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.registry.entities.Account;
import com.example.registry.entities.Transfer;
import com.example.registry.repositories.AccountRepository;
import com.example.registry.repositories.TransferRepository;

@SpringBootApplication
@EnableMongoRepositories
public class RegistryApplication implements CommandLineRunner{

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private TransferRepository transferRepository;

	public static void main(String[] args) {
		SpringApplication.run(RegistryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Account newAccount = new Account("1", "102932849291", "Martin", "Chafloque", "10/04/2000", "19/03/2021", "Ahorros", "COP", 145790);

		Transfer newTranser = new Transfer("1", "102978849291", "COP", 30000, "20/03/2023", "102932849291");
		transferRepository.save(newTranser);

		newAccount.getTransfers().add(newTranser);
		accountRepository.save(newAccount);*/
	}
}
