package com.jim.ezenpj.miniCommand;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.jim.ezenpj.dao.MiniDao;
import com.jim.ezenpj.dto.BoardDto;
import com.jim.ezenpj.util.Constant;

public class BoardReplyViewCommand implements MiniCommand {

	@Override
	public void execute(Model model, HttpServletRequest request) {
		MiniDao mdao = Constant.mdao;
		
		String bid = request.getParameter("bId");
		
		System.out.println(bid);
		
		BoardDto dto = mdao.reply_view(bid);
		
		//String bName = dto.setBName(Constant.username);
		model.addAttribute("reply_view", dto);
	}

}
