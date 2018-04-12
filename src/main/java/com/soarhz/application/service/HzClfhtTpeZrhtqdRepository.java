package com.soarhz.application.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soarhz.application.domain.HzClfhtTpeZrhtqd;

public interface HzClfhtTpeZrhtqdRepository extends JpaRepository<HzClfhtTpeZrhtqd, Long> {
	List<HzClfhtTpeZrhtqd> findByFwzlLikeOrderByHtqdsjDesc(String fwzl);

	List<HzClfhtTpeZrhtqd> findByHtqdsjAfterOrderByHtqdsjDesc(Date htqdsj);
}
