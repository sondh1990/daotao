package daotao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SONDH_NHANVIEN")

public class nhanvien {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String tennhanvien;
	private String tuoi;
	
	
	public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "tennhanvien", nullable = false)
    public String getTennhanvien() {
        return tennhanvien;
    }
    public void setTennhanvien(String tennhanvien) {
        this.tennhanvien = tennhanvien;
    }
    @Column(name = "tuoi", nullable = false)
    public String getTuoi() {
        return tuoi;
    }
    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

}
