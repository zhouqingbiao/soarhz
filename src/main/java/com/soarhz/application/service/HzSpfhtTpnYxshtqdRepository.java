package com.soarhz.application.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soarhz.application.domain.HzSpfhtTpnYxshtqd;

public interface HzSpfhtTpnYxshtqdRepository extends JpaRepository<HzSpfhtTpnYxshtqd, Long> {
	List<HzSpfhtTpnYxshtqd> findByFwzlLikeOrderByHtqdsjDesc(String fwzl);

	List<HzSpfhtTpnYxshtqd> findByHtqdsjAfterOrderByHtqdsjDesc(Date htqdsj);
}
