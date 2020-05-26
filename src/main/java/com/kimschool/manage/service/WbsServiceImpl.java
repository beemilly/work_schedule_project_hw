package com.kimschool.manage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.kimschool.manage.dao.WbsDao;
import com.kimschool.manage.entity.User_Info;
import com.kimschool.manage.entity.Wbs;
import com.kimschool.manage.entity.WbsInfoVo;
import com.kimschool.manage.entity.Wbs_2020;
import com.kimschool.manage.entity.WorkPlaceInfo;

@Service
public class WbsServiceImpl implements WbsService {

	@Autowired
	WbsDao wbsDao;

	@Override
	public ModelAndView wbslogincheck(String u_no, String u_password) {

		List<User_Info> result = wbsDao.wbslogincheck(u_no, u_password);
		
		int count = result.size();
		
		ModelAndView mv = new ModelAndView();
		
		if (count == 1) {
			mv.addObject("u_no", u_no);
			mv.setViewName("redirect:/getwbsinfo");
		} else {
			mv.setViewName("login");
		}
		
		return mv;
	}

	@Override
	public ModelAndView getwbsinfo(String u_no) {
		
		ModelAndView mv = new ModelAndView("wbs");
		
		List<Wbs_2020> wbs_2020 = new ArrayList<Wbs_2020>();
		List<User_Info> user_info = new ArrayList<User_Info>();
		List<WorkPlaceInfo> workplaceinfo = new ArrayList<WorkPlaceInfo>();
		
		wbs_2020 = wbsDao.getwbs2020(u_no);
		user_info = wbsDao.getuserinfo(u_no);
		workplaceinfo = wbsDao.getworkplaceinfo(u_no);
		
		WbsInfoVo vo = new WbsInfoVo();
		
		vo.setU_name(user_info.get(0).getName());
		vo.setU_no(user_info.get(0).getU_no());
		vo.setMin_time(String.valueOf(workplaceinfo.get(0).getMin_time()));
		vo.setMax_time(String.valueOf(workplaceinfo.get(0).getMax_time()));
		
		List<Wbs> wbslist = new ArrayList<Wbs>();
		
		for (Wbs_2020 wbs : wbs_2020) {
			Wbs wbsvo = new Wbs();
			wbsvo.setDate(wbs.getDate());
			if (wbs.getStart_time().equals("0")) {
				wbsvo.setStart_h("0");
				wbsvo.setStart_m("0");
			} else {
				wbsvo.setStart_h(wbs.getStart_time().substring(0, 2));
				wbsvo.setStart_m(wbs.getStart_time().substring(2, 4));
			}
			if (wbs.getEnd_time().equals("0")) {
				wbsvo.setEnd_h("0");
				wbsvo.setEnd_m("0");
			} else {
				wbsvo.setEnd_h(wbs.getEnd_time().substring(0, 2));
				wbsvo.setEnd_m(wbs.getEnd_time().substring(2, 4));
			}
			wbsvo.setTotal_h("8");
			wbsvo.setVacation_type(wbs.getVacation_type());
			wbsvo.setMemo(wbs.getMemo());
			
			wbslist.add(wbsvo);
		}
		vo.setWbslist(wbslist);
		
		mv.addObject("wbsinfo", vo);
		
		return mv;
	}

}
