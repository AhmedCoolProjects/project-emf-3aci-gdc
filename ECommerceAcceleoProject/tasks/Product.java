public class Product{
	
 private EInt id;
 
 private EString title;
 
 private EString description;
 
 private EFloat price;
 
 private EString category;
 
 public Product()
 {
 }
 public EInt getId(){
  return this.id;
 }
 
 public EString getTitle(){
  return this.title;
 }
 
 public EString getDescription(){
  return this.description;
 }
 
 public EFloat getPrice(){
  return this.price;
 }
 
 public EString getCategory(){
  return this.category;
 }
 public void setId(EInt id){
  this.id=id;
 }
 
 public void setTitle(EString title){
  this.title=title;
 }
 
 public void setDescription(EString description){
  this.description=description;
 }
 
 public void setPrice(EFloat price){
  this.price=price;
 }
 
 public void setCategory(EString category){
  this.category=category;
 }
 
}
