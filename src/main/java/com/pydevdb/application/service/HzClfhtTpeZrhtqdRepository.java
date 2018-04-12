package com.pydevdb.application.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pydevdb.application.domain.HzClfhtTpeZrhtqd;

public interface HzClfhtTpeZrhtqdRepository extends JpaRepository<HzClfhtTpeZrhtqd, Long> {
	List<HzClfhtTpeZrhtqd> findByFwzlLikeOrderByHtqdsjDesc(String fwzl);

	List<HzClfhtTpeZrhtqd> findByHtqdsjAfterOrderByHtqdsjDesc(Date htqdsj);
}
