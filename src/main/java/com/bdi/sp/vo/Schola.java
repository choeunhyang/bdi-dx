package com.bdi.sp.vo;

public class Schola {
	private String scid;
	private String scpwd;
	private String scname;
	private Integer scage;
	private String scemail;
	private String scaddr;
	private String scmobile;
	private String scbirth;
	private String scdesc;
	private String sccredat;
	
	public Schola(){}
 
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

	public Integer getScage() {
		return scage;
	}

	public void setScage(Integer scage) {
		this.scage = scage;
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

	public String getScbirth() {
		return scbirth;
	}

	public void setScbirth(String scbirth) {
		this.scbirth = scbirth;
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
		return "Schola [scid=" + scid + ", scpwd=" + scpwd + ", scname=" + scname + ", scage=" + scage + ", scemail="
				+ scemail + ", scaddr=" + scaddr + ", scmobile=" + scmobile + ", scbirth=" + scbirth + ", scdesc="
				+ scdesc + ", sccredat=" + sccredat + "]";
	}

	public Schola(String scid, String scpwd, String scname, Integer scage, String scemail, String scaddr,
			String scmobile, String scbirth, String scdesc, String sccredat) {
		super();
		this.scid = scid;
		this.scpwd = scpwd;
		this.scname = scname;
		this.scage = scage;
		this.scemail = scemail;
		this.scaddr = scaddr;
		this.scmobile = scmobile;
		this.scbirth = scbirth;
		this.scdesc = scdesc;
		this.sccredat = sccredat;
	}

}
