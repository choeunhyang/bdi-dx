package com.bdi.sp.vo;

public class DepartInfo {
	private int dino;
	private String diname;
	private String didesc;
	private int dicnt;
	@Override
	public String toString() {
		return "DepartInfo [dino=" + dino + ", diname=" + diname + ", didesc=" + didesc + ", dicnt=" + dicnt + "]";
	}
	public int getDino() {
		return dino;
	}
	public void setDino(int dino) {
		this.dino = dino;
	}
	public String getDiname() {
		return diname;
	}
	public void setDiname(String diname) {
		this.diname = diname;
	}
	public String getDidesc() {
		return didesc;
	}
	public void setDidesc(String didesc) {
		this.didesc = didesc;
	}
	public int getDicnt() {
		return dicnt;
	}
	public void setDicnt(int dicnt) {
		this.dicnt = dicnt;
	}
}
