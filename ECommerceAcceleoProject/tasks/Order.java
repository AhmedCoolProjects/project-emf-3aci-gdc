public class Order{
 private EInt id;
 
 private EInt number;
 
 private EDate date;
 
 public Order()
 {
 }
 public EInt getId(){
  return this.id;
 }
 
 public EInt getNumber(){
  return this.number;
 }
 
 public EDate getDate(){
  return this.date;
 }
 public void setId(EInt id){
  this.id=id;
 }
 
 public void setNumber(EInt number){
  this.number=number;
 }
 
 public void setDate(EDate date){
  this.date=date;
 }
 
}
