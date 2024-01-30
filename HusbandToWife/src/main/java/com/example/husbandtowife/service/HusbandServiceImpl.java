package com.example.husbandtowife.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.husbandtowife.dto.ResponseDTO;
import com.example.husbandtowife.model.Husband;
import com.example.husbandtowife.model.Wife;
import com.example.husbandtowife.repository.HusbandRepository;
import com.example.husbandtowife.repository.WifeRepository;

@Service
public class HusbandServiceImpl implements HusbandService{
	
	@Autowired
	private HusbandRepository husbandRepository;
	
	@Autowired
	private WifeRepository wifeRepository;
	
	ResponseDTO response=new ResponseDTO();
	
	private void setResponseData(int status, String message, Object data)
	{
		response.setStatus(status);
		response.setMessage(message);
		response.setData(data);
	}

	@Override
	public ResponseDTO findAllHusband() {
		setResponseData(200,"All Husbands",husbandRepository.getAllHusbands());
		return response;
	}

	@Override
	public ResponseDTO addHusband(Husband husband) {
		setResponseData(200, "Husband Added Successfully", husbandRepository.save(husband));
		return response;
	}

	@Override
	public ResponseDTO editHusbandByWife(long hId, long wId) {
		Husband husband=husbandRepository.findById(hId).get();
		Wife wife=wifeRepository.findById(wId).get();
		husband.setWife(wife);
		setResponseData(200, "Husband Edited", husbandRepository.save(husband));
		return response;
	}

	@Override
	public ResponseDTO findHusbandByWifeName(String wName) {
		setResponseData(200, "Wife", husbandRepository.findByWifeNameContaining(wName));
		return response;
	}

}
