package com.example.husbandtowife.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.husbandtowife.dto.ResponseDTO;
import com.example.husbandtowife.model.Wife;
import com.example.husbandtowife.repository.WifeRepository;

@Service
public class WifeServiceImpl implements WifeService {

	@Autowired
	private WifeRepository wifeRepository;

	ResponseDTO response = new ResponseDTO();

	private void setResponseData(int status, String message, Object data) {
		response.setStatus(status);
		response.setMessage(message);
		response.setData(data);
	}

	@Override
	public ResponseDTO findAllWifes() {
		setResponseData(200,"All Wifes",wifeRepository.getAllWifes());
		return response;
	}

	@Override
	public ResponseDTO addWife(Wife wife) {
		setResponseData(200, "Wife Added", wifeRepository.save(wife));
		return response;
	}

	@Override
	public ResponseDTO findWifeByHusbandName(String hName) {
		setResponseData(200,"Wife",wifeRepository.getWifeByHusbandName(hName));
		return response;
	}

}
