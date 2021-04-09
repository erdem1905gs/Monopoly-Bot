package Bot;

public class Tiles_Property extends Tiles  {
 int ownerNum;
 int value;
 int rent;
 boolean isMortgaged = false;
 int random = 0;
 public Tiles_Property(int value, int rent, String name) {
  // TODO Auto-generated constructor stub
  ownerNum = 5; //Owner number = 5 can mean there is no owner. This removes need for boolean. Simple encapsulation.
  type = 2;
  this.value = value;
  this.rent = rent;
  this.name = name;
  emoji = ":house:";
 }
 public Tiles_Property(int value, int rent, String name, String emoji) {
  // TODO Auto-generated constructor stub
  ownerNum = 5; //Owner number = 5 can mean there is no owner. This removes need for boolean. Simple encapsulation.
  type = 2;
  this.value = value;
  this.rent = rent;
  this.name = name;
  this.emoji = emoji;
 }
 
 public int getRandom(){
   return random;
 }
 public boolean hasOwner() {
  return ownerNum == 5;
 }
 void freeOwner() {
  ownerNum = 5;
 }
 int getOwner() {
  return ownerNum;
 }
 void setMortgaged() {
  isMortgaged = true;
 }
 void freeMortgaged() {
  isMortgaged = false;
 }
 boolean isMortgaged() {
  return isMortgaged;
 }
 int getValue(){
   return value;
 }
 
 public int getRent(){
   return rent;
 }
 
 void setRent(int ren){
   rent = ren;
 }
 
 void setValue(int val){
   value = val;
 }
 void setName(String name) {
  this.name = name;
 }
 public String toString() { return ":classical_building:"; }
}
