package com.lotto.web.serviceImpls;

import java.util.Random;

import com.lotto.web.daoImpls.LottoDAOImpl;
import com.lotto.web.daos.LottoDAO;
import com.lotto.web.domains.LottoBean;
import com.lotto.web.services.LottoService;

public class LottoServiceImpl implements LottoService{
	
	private LottoDAO dao;
	
	public LottoServiceImpl() {
		dao = new LottoDAOImpl();
	}

	@Override
	public void createLotto(LottoBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String createLottoSeq() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createBall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createLotteryNum() {
		
		
		return null;
	}

	@Override
	public boolean duplicatePrevention(int[] arr) {
		
		return false;
	}

	@Override
	public String ascendingSort(int[] arr) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
