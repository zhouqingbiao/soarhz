package com.soarhz.application.web;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.soarhz.application.domain.HzClfhtTpeZrhtqd;
import com.soarhz.application.service.HzClfhtTpeZrhtqdRepository;

@Controller
public class HzClfhtTpeZrhtqdController {

	@Autowired
	private HzClfhtTpeZrhtqdRepository hzClfhtTpeZrhtqdRepository;

	@GetMapping("/HzClfhtTpeZrhtqd")
	public String hzClfhtTpeZrhtqd(Model model, @ModelAttribute HzClfhtTpeZrhtqd hzClfhtTpeZrhtqd) {

		model.addAttribute("fwzl", hzClfhtTpeZrhtqd.getFwzl());

		List<HzClfhtTpeZrhtqd> listHzClfhtTpeZrhtqd = null;

		if (StringUtils.isEmpty(hzClfhtTpeZrhtqd.getFwzl())) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(new Date());
			calendar.add(Calendar.MONTH, -1);

			listHzClfhtTpeZrhtqd = hzClfhtTpeZrhtqdRepository.findByHtqdsjAfterOrderByHtqdsjDesc(calendar.getTime());
		} else {
			listHzClfhtTpeZrhtqd = hzClfhtTpeZrhtqdRepository
					.findByFwzlLikeOrderByHtqdsjDesc("%" + hzClfhtTpeZrhtqd.getFwzl() + "%");
		}

		model.addAttribute("list", listHzClfhtTpeZrhtqd);

		return "HzClfhtTpeZrhtqd";
	}
}
