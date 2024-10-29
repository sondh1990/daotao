package daotao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import daotao.model.nhanvien;

@Repository
public interface nhanvienrespon extends JpaRepository<nhanvien, Long> {
	 
	}