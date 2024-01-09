package entities;

public class customer {
	
	private int id;
	private String name;
	private String pnumber;
	private String email;
	private String password;
	private String log_email;
	private String log_passsword;
	private int P_Id;
	private String P_Name;
	private String P_Description;
	private String P_Price;
	private String image_path;
	private String category;
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPnumber() {
		return pnumber;
	}

	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLog_email() {
		return log_email;
	}

	public void setLog_email(String log_email) {
		this.log_email = log_email;
	}

	public String getLog_passsword() {
		return log_passsword;
	}

	public void setLog_passsword(String log_passsword) {
		this.log_passsword = log_passsword;
	}



	public int getP_Id() {
		return P_Id;
	}

	public void setP_Id(int p_Id) {
		P_Id = p_Id;
	}

	public String getP_Name() {
		return P_Name;
	}

	public void setP_Name(String p_Name) {
		P_Name = p_Name;
	}

	public String getP_Description() {
		return P_Description;
	}

	public void setP_Description(String p_Description) {
		P_Description = p_Description;
	}

	public String getP_Price() {
		return P_Price;
	}

	public void setP_Price(String p_Price) {
		P_Price = p_Price;
	}
	

	public String getImage_path() {
		return image_path;
	}

	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public customer() {

		name = "";
		pnumber = "";
		email = "";
		password = "";
		log_email = "";
		log_passsword = "";
		P_Id = 0 ;
		P_Name = "";
		P_Description ="";
		P_Price ="";
		
	}

}
