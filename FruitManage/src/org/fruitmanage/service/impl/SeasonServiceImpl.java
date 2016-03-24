package org.fruitmanage.service.impl;

import org.fruitmanage.dao.SeasonDao;
import org.fruitmanage.entity.Season;
import org.fruitmanage.service.SeasonService;

public class SeasonServiceImpl implements SeasonService{

	private SeasonDao seasonDao;
	
	public void setSeasonDao(SeasonDao seasonDao) {
		this.seasonDao = seasonDao;
	}

	@Override
	public Season findSeasonById(Integer id) {
		// TODO Auto-generated method stub
		Season season = seasonDao.get(Season.class, id);
		return season;
	}

}
