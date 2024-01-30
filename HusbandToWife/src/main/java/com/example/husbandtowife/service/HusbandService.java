package com.example.husbandtowife.service;

import com.example.husbandtowife.dto.ResponseDTO;
import com.example.husbandtowife.model.Husband;

public interface HusbandService {
	
	ResponseDTO findAllHusband();
	
	ResponseDTO addHusband(Husband husband);
	
	ResponseDTO editHusbandByWife(long hId,long wId);
	
	ResponseDTO findHusbandByWifeName(String wName);

}
