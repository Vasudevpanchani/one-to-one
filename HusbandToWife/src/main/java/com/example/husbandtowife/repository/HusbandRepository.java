package com.example.husbandtowife.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.husbandtowife.model.Husband;


@Repository
public interface HusbandRepository extends JpaRepository<Husband, Long>{
	
	@Query(value="select * from husband_table",nativeQuery = true)
	public List<Husband> getAllHusbands();

	@Query(value="select * from husband_table as h\r\n"
			+ "INNER JOIN wife_table as w\r\n"
			+ "ON h.wife_id = w.w_id\r\n"
			+ "WHERE w.w_name=?1",nativeQuery = true)
	public List<Husband> findByWifeNameContaining(String wName);
	
}
