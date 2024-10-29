package daotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import daotao.model.nhanvien;
import daotao.repository.nhanvienrespon;

@Controller

public class nhanviencontrol {
	@Autowired
	private nhanvienrespon nvRepository;

	@RequestMapping(value = "/nhanvien", method = RequestMethod.POST)

	public ResponseEntity<String> insertdulieunhanvien(@RequestBody nhanvien l_body) {

		// nvRepository.save(l_body);

		nhanvien nv = new nhanvien();

		nv.setTennhanvien(l_body.getTennhanvien());

		System.out.println("l_body.getTENNHANVIEN() = " + l_body.getTennhanvien());

		nv.setTuoi(l_body.getTuoi());

		nvRepository.save(nv);

		return new ResponseEntity<>("Đã insert dữ liệu", HttpStatus.OK);

	}

}
