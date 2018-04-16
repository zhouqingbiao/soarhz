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

import com.soarhz.application.domain.HzSpfhtTpnYxshtqd;
import com.soarhz.application.service.HzSpfhtTpnYxshtqdRepository;

@Controller
public class HzSpfhtTpnYxshtqdController {

	@Autowired
	private HzSpfhtTpnYxshtqdRepository hzSpfhtTpnYxshtqdRepository;

	@GetMapping("/HzSpfhtTpnYxshtqd")
	public String hzSpfhtTpnYxshtqd(Model model, @ModelAttribute HzSpfhtTpnYxshtqd hzSpfhtTpnYxshtqd) {

		model.addAttribute("fwzl", hzSpfhtTpnYxshtqd.getFwzl());

		List<HzSpfhtTpnYxshtqd> listHzSpfhtTpnYxshtqd = null;

		if (StringUtils.isEmpty(hzSpfhtTpnYxshtqd.getFwzl())) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(new Date());
			calendar.add(Calendar.MONTH, -1);

			listHzSpfhtTpnYxshtqd = hzSpfhtTpnYxshtqdRepository.findByHtqdsjAfterOrderByHtqdsjDesc(calendar.getTime());
		} else {
			listHzSpfhtTpnYxshtqd = hzSpfhtTpnYxshtqdRepository
					.findByFwzlLikeOrderByHtqdsjDesc("%" + hzSpfhtTpnYxshtqd.getFwzl() + "%");
		}

		model.addAttribute("list", listHzSpfhtTpnYxshtqd);

		return "HzSpfhtTpnYxshtqd";
	}
}
