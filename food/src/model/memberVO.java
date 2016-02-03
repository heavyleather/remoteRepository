package model;

public class memberVO implements java.io.Serializable{
//private UUID member_UID;
private String member_ID;
private String name;
private String acc_email;
private String pwd;
private String member_photo;
private boolean gender;
private String tel;
private String GUAR_CT;
private String GUAR_AR;
private String NB_CODE;
private String GUAR_NO;
private String email2;
private String cel;
private java.sql.Date insdate;


	
public memberVO(String member_ID, String name, String acc_email, String pwd,
		String member_photo, boolean gender, String tel, String GUAR_CT,
		String GUAR_AR, String NB_CODE, String GUAR_NO, String email2,
		String cel, String insdate) {
	// TODO Auto-generated constructor stub
}
//public UUID getMember_UID() {
//	return member_UID;
//}
//public void setMember_UID(UUID member_UID) {
//	this.member_UID = member_UID;
//}
public String getMember_ID() {
	return member_ID;
}
public void setMember_ID(String member_ID) {
	this.member_ID = member_ID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAcc_email() {
	return acc_email;
}
public void setAcc_email(String acc_email) {
	this.acc_email = acc_email;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getMember_photo() {
	return member_photo;
}
public void setMember_photo(String member_photo) {
	this.member_photo = member_photo;
}
public boolean getGender() {
	return gender;
}
public void setGender(boolean gender) {
	this.gender = gender;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getGUAR_CT() {
	return GUAR_CT;
}
public void setGUAR_CT(String gUAR_CT) {
	GUAR_CT = gUAR_CT;
}
public String getGUAR_AR() {
	return GUAR_AR;
}
public void setGUAR_AR(String gUAR_AR) {
	GUAR_AR = gUAR_AR;
}
public String getNB_CODE() {
	return NB_CODE;
}
public void setNB_CODE(String nB_CODE) {
	NB_CODE = nB_CODE;
}
public String getEmail2() {
	return email2;
}
public void setEmail2(String email2) {
	this.email2 = email2;
}
public String getCel() {
	return cel;
}
public void setCel(String cel) {
	this.cel = cel;
}
public java.sql.Date getInsdate() {
	return insdate;
}
public void setInsdate(java.sql.Date insdate) {
	this.insdate = insdate;
}
public String getGUAR_NO() {
	return GUAR_NO;
}
public void setGUAR_NO(String gUAR_NO) {
	GUAR_NO = gUAR_NO;
}
}
