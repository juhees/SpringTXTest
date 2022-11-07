package kr.kwangan2.tx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.kwangan2.tx.mapper.TBL1Mapper;
import kr.kwangan2.tx.mapper.TBL2Mapper;
import kr.kwangan2.tx.service.SampleTxService;
import lombok.Setter;


@Service
public class SampleTxServiceImpl implements SampleTxService {

	@Setter(onMethod_= {@Autowired})
	private TBL1Mapper tbl1mapper;
	
	@Setter(onMethod_= {@Autowired})
	private TBL2Mapper tbl2mapper;
	
	@Transactional
	@Override
	public void addData(String value) {
		
		tbl1mapper.insertCol1(value);
		
		tbl2mapper.insertCol2(value);
		
	}
	

}
