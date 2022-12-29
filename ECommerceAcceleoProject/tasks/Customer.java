public class Customer{
 private EInt id;
 
 private EString full_name;
 
 private EString email;
 
 private EString phone;
 
 private EString address;
 
 private Gender gender;
 
 public Customer()
 {
 }
 public EInt getId(){
  return this.id;
 }
 
 public EString getFull_name(){
  return this.full_name;
 }
 
 public EString getEmail(){
  return this.email;
 }
 
 public EString getPhone(){
  return this.phone;
 }
 
 public EString getAddress(){
  return this.address;
 }
 
 public Gender getGender(){
  return this.gender;
 }
 public void setId(EInt id){
  this.id=id;
 }
 
 public void setFull_name(EString full_name){
  this.full_name=full_name;
 }
 
 public void setEmail(EString email){
  this.email=email;
 }
 
 public void setPhone(EString phone){
  this.phone=phone;
 }
 
 public void setAddress(EString address){
  this.address=address;
 }
 
 public void setGender(Gender gender){
  this.gender=gender;
 }
 
}
