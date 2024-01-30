package com.example.husbandtowife.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.husbandtowife.model.Wife;

@Repository
public interface WifeRepository extends JpaRepository<Wife, Long> {

	@Query(value = "select * from wife_table", nativeQuery = true)
	public List<Wife> getAllWifes();

	@Query(value = "select * from wife_table as w\r\n" + "INNER JOIN husband_table h\r\n" + "ON h.wife_id = w.w_id\r\n"
			+ "WHERE h.h_name=?1", nativeQuery = true)

	public Wife getWifeByHusbandName(String husband);

}
