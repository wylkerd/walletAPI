package com.wallet.repository;


import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.wallet.entity.Wallet;
import com.wallet.entity.WalletItem;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
public class WalletItemRepositoryTest {
	
	private static final Date DATE = new Date();
	private static final String TYPE = "EN";
	private static final String DESCRIPTION = "Conta de Luz";
	private static final BigDecimal VALUE = BigDecimal.valueOf(65);
	
	
	
	@Autowired
	WalletItemRepository repository;
	
	@Autowired
	WalletRepository walletRepository;
	
	@Test
	public void testSave() {
		
		Wallet w = new Wallet();
		w.setName("Carteira 1");
		w.setValue(BigDecimal.valueOf(500));
		walletRepository.save(w);
		
		WalletItem wi = new WalletItem(1L, w, DATE, TYPE, DESCRIPTION, VALUE);
		
		WalletItem response = repository.save(wi);
		
		assertNotNull(response);
		
		
	}

	public static Date getDate() {
		return DATE;
	}

	public static String getType() {
		return TYPE;
	}

	public static String getDescription() {
		return DESCRIPTION;
	}

	public static BigDecimal getValue() {
		return VALUE;
	}
}
