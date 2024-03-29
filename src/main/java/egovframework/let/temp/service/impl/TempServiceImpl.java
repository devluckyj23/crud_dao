package egovframework.let.temp.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.let.temp.service.TempService;
import egovframework.let.temp.service.TempVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("tempService")
// interface 가져오기 : implement // class 가져오기 extends
public class TempServiceImpl extends EgovAbstractServiceImpl implements TempService{

	@Resource(name="tempDAO")
	private TempDAO tempDAO;
	

	public TempVO selectTemp(TempVO vo) throws Exception {
		return tempDAO.selectTemp(vo);
	}

}
