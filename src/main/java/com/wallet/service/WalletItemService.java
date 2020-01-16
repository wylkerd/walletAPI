package com.wallet.service;

import java.util.Date;

import org.springframework.data.domain.Page;

import com.wallet.entity.WalletItem;

public interface WalletItemService {
	

	WalletItem save(WalletItem i);
	
	Page<WalletItem> findBetweenDates(Long wallet, Date start, Date end, int page );
}
