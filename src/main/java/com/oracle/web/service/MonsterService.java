package com.oracle.web.service;

import java.util.List;


import com.oralce.web.bean.Monster;
import com.oralce.web.bean.PageBean;
import com.oralce.web.bean.subMonster;

public interface MonsterService {

	//List<Monster> list();

	int save(Monster monster);

	void delete(Monster monster);

	Monster queryOneMonster(Integer monsterId);

	void update(Monster monster);

	//List<subMonster> list();

	PageBean<subMonster> showByPage(Integer pageNow, int pageSize);

}
