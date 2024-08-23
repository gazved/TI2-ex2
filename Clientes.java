

public class Clientes {
    private int id;
    private String name;
    private int phone;
    private String email;
    private int birthday;
    
    
     public Clientes() {
    	 this.id = -1;
    	 this.name = "";
    	 this.phone = -1;
    	 this.email = "";
    	 this.birthday = -1;
     }
     
     public Clientes(int id, String name, int phone, String email, int birthday) {
    	 this.id = id;
    	 this.name = name;
    	 this.phone = phone;
    	 this.email = email;
    	 this.birthday = birthday;
    	 
     }
     
     public int getId() {
    	 return id;
     }
     
     public void SetId(int id) {
    	 this.id = id;
     }
     
     public String getName() {
    	 return name;
     }
     public void setName(String name) {
         this.name = name;
     }
     
     // Getter e Setter para phone
     public int getPhone() {
         return phone;
     }
     
     public void setPhone(int phone) {
         this.phone = phone;
     }
     
     // Getter e Setter para email
     public String getEmail() {
         return email;
     }
     
     public void setEmail(String email) {
         this.email = email;
     }
     
 
     public int getBirthday() {
         return birthday;
     }
     
     public void setBirthday(int birthday) {
         this.birthday = birthday;
     }
     
     @Override
     public String toString() {
    	 return "Clientes[ id =" + id + ", name =" + name + ", phone =" + phone + ", email ="+ email + ", birthday ="+ birthday+"]";
     }
     
     
     
     
     
     
}
