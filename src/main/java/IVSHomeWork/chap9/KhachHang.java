package IVSHomeWork.chap9;

import java.util.ArrayList;
import java.util.List;

import IVSHomeWork.Math.*;

public class KhachHang {
	general general = new general(null);
	public long id ,doanhSo;
	public String maKH , ten ,diaChi;
	
	public KhachHang(long id , long doanhSo , String maKH , String tem , String diaChi)
	{
		this.id = id;
		this.ten = tem;
		this.doanhSo = doanhSo;
		this.maKH = maKH ;
		this.diaChi = diaChi;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getDoanhSo() {
		return doanhSo;
	}
	public void setDoanhSo(long doanhSo) {
		this.doanhSo = doanhSo;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public List<KhachHang> khachHangs = new ArrayList<KhachHang>();
	public void info() {
		for(KhachHang item:khachHangs)
		{
			if(item == null)
			{System.out.println("danh sách trống !");}
			general.line("ID : "+item.id);
			System.out.println("tên khách hàng :"+item.ten);
			System.out.println("địa chỉ khách hàng :"+item.diaChi);
			System.out.println("doanh số khách hàng :"+item.doanhSo);
		}
	}
	public long muaHang(int soTien)
	{
		doanhSo += soTien;
		return doanhSo;
	}
}
