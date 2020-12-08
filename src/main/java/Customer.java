import java.util.HashMap;

public class Customer {
	private String _id;
	private String _firstname;
	private String _lastname;
	private String _telephone;
	private String _street1;
	private String _street2;
	private String _city;
	private String _state;
	private String _zipcode;
	private String _country;
	private String _mail;
	
	private static HashMap<String,Customer> customers=new HashMap<String,Customer>();
	
    public Customer(String id, String fName, String lName){
        this(id,fName,lName,null,null,null,null,null,null,null,null);
    }
    public Customer(String id, String fName, String lName, String tele, String str1, String str2,
            String city, String state, String zip, String country, String mail){
        _id=id;
        _firstname=fName;
        _lastname=lName;
        _telephone=tele;
        _street1=str1;
        _street2=str2;
        _city=city;
        _state=state;
        _zipcode=zip;
        _country=country;
        _mail=mail;
        
    }
	
    
    
    public static Customer find(String id){
        return customers.get(id);
    }

   public static boolean remove(String s){
        return customers.remove(s)!=null;
    }
   public static boolean insert(Customer c){
        return customers.put(c.getId(), c)!=null;
    }
	
	
	    
	    public String getLastname(){
	        return _lastname;
	    }
	    
	    public String getFirstname(){
	        return _firstname;
	    }

	    public String getId() {
	        return _id;
	    }

	    public String getTelephone() {
	        return _telephone;
	    }

	    public String getStreet1() {
	        return _street1;
	    }

	    public String getStreet2() {
	        return _street2;
	    }

	    public String getCity() {
	        return _city;
	    }

	    public String getState() {
	        return _state;
	    }

	    public String getZipcode() {
	        return _zipcode;
	    }

	    public String getCountry() {
	        return _country;
	    }

	    public String getMail() {
	        return _mail;
	    }    
	    
	    
	    public void setId(String _id) {
	        this._id = _id;
	    }

	    public void setFirstname(String _firstname) {
	        this._firstname = _firstname;
	    }

	    public void setLastname(String _lastname) {
	        this._lastname = _lastname;
	    }

	    public void setTelephone(String _telephone) {
	        this._telephone = _telephone;
	    }

	    public void setStreet1(String _street1) {
	        this._street1 = _street1;
	    }

	    public void setStreet2(String _street2) {
	        this._street2 = _street2;
	    }

	    public void setCity(String _city) {
	        this._city = _city;
	    }

	    public void setState(String _state) {
	        this._state = _state;
	    }

	    public void setZipcode(String _zipcode) {
	        this._zipcode = _zipcode;
	    }

	    public void setCountry(String _country) {
	        this._country = _country;
	    }

	    public void setMail(String _mail) {
	        this._mail = _mail;
	    }
	    
	    public String getCheckDataError(){
	        if (!checkId(_id))
	            return "Invalid id";
	        else if (!checkFirstname())
	            return "Invalid first name";
	        else if (!checkLastname())
	            return "Invalid last name";
	        else if(!checkTelephone())
	            return "Invalid telephone";
	        else if (!checkStreet1())
	            return "Invalid street 1";
	        else if (!checkStreet2())
	            return "Invalid street 2";
	        else if (!checkCity())
	            return "Invalid city";
	        else if (!checkState())
	            return "Invalid state";
	        else if (!checkZip())
	            return "Invalid zip";
	        else if (!checkCountry())
	            return "Invalid country";
	        else
	            return "Invalid mail";
	    }
	    
	    public boolean checkCountry(){
	        return checkField(_country);
	    }
	    
	    public boolean checkMail(){
	        return checkField(_mail)&&(_mail.length()>=10&&_mail.length()<=30)
	                &&(_mail.indexOf("@")==_mail.lastIndexOf("@")&&_mail.contains("@"))
	                &&(_mail.substring(_mail.lastIndexOf(".")+1).equals("fr")||_mail.substring(_mail.lastIndexOf(".")+1).equals("ue"));
	    }
	    
	    public boolean checkData(){
	        return checkId(_id)&&checkFirstname()&& checkLastname()&&checkTelephone()
	                &&checkStreet1()&&checkStreet2()&&checkCity()&&checkState()
	                &&checkZip()&&checkCountry()&&checkMail();
	    }
	    
	    
	    public boolean checkId(String id){
	        return checkField(id);
	    }
	    
	    public boolean checkFirstname(){
	        return checkField(_firstname);
	    }
	    
	    public boolean checkLastname(){
	        return checkField(_lastname);
	    }
	    
	    public boolean checkTelephone(){
	        return checkField(_telephone);
	    }
	    
	    public boolean checkStreet1(){
	        return checkField(_street1);
	    }
	    
	    public boolean checkStreet2(){
	        return checkField(_street2);
	    }
	    
	    public boolean checkCity(){
	        return checkField(_city);
	    }
	    
	    public boolean checkState(){
	        return checkField(_state);
	    }
	    
	    public boolean checkZip(){
	        return checkField(_zipcode);
	    }
	    private boolean checkField(String s){
	        return s != null && !s.equals("");
	    }
	    
}
