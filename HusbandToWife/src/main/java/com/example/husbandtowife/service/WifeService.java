package com.example.husbandtowife.service;

import com.example.husbandtowife.dto.ResponseDTO;
import com.example.husbandtowife.model.Wife;

public interface WifeService {

	ResponseDTO findAllWifes();

	ResponseDTO addWife(Wife wife);

	ResponseDTO findWifeByHusbandName(String hName);

}
