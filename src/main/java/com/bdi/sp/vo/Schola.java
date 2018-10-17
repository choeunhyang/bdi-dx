package com.bdi.sp.vo;

public class Schola {
	private Integer scnum;
	private String scname;
	private String scid;
	private String scpwd;
	private String scemail;
	private String scaddr;
	private String scmobile;
	private String scBirth;
	private String scdesc;
	private String sccredat;
	
	public Schola(){}

	public Integer getScnum() {
		return scnum;
	}

	public void setScnum(Integer scnum) {
		this.scnum = scnum;
	}

	public String getScname() {
		return scname;
	}

	public void setScname(String scname) {
		this.scname = scname;
	}

	public String getScid() {
		return scid;
	}

	public void setScid(String scid) {
		this.scid = scid;
	}

	public String getScpwd() {
		return scpwd;
	}

	public void setScpwd(String scpwd) {
		this.scpwd = scpwd;
	}

	public String getScemail() {
		return scemail;
	}

	public void setScemail(String scemail) {
		this.scemail = scemail;
	}

	public String getScaddr() {
		return scaddr;
	}

	public void setScaddr(String scaddr) {
		this.scaddr = scaddr;
	}

	public String getScmobile() {
		return scmobile;
	}

	public void setScmobile(String scmobile) {
		this.scmobile = scmobile;
	}

	public String getScBirth() {
		return scBirth;
	}

	public void setScBirth(String scBirth) {
		this.scBirth = scBirth;
	}

	public String getScdesc() {
		return scdesc;
	}

	public void setScdesc(String scdesc) {
		this.scdesc = scdesc;
	}

	public String getSccredat() {
		return sccredat;
	}

	public void setSccredat(String sccredat) {
		this.sccredat = sccredat;
	}

	@Override
	public String toString() {
		return "Schola [scnum=" + scnum + ", scname=" + scname + ", scid=" + scid + ", scpwd=" + scpwd + ", scemail="
				+ scemail + ", scaddr=" + scaddr + ", scmobile=" + scmobile + ", scBirth=" + scBirth + ", scdesc="
				+ scdesc + ", sccredat=" + sccredat + "]";
	}

	public Schola(Integer scnum, String scname, String scid, String scpwd, String scemail, String scaddr,
			String scmobile, String scBirth, String scdesc, String sccredat) {
		super();
		this.scnum = scnum;
		this.scname = scname;
		this.scid = scid;
		this.scpwd = scpwd;
		this.scemail = scemail;
		this.scaddr = scaddr;
		this.scmobile = scmobile;
		this.scBirth = scBirth;
		this.scdesc = scdesc;
		this.sccredat = sccredat;
	};
	
}
