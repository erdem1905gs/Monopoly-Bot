package Bot;

public class Tiles_Chance extends Tiles { 
 int min = -50;
 int max = 50;
 int random;
 int rent = 0;
 boolean hasOwner = false;
 public Tiles_Chance() {
  name = "Chance Tile!";
  type = 4;
  emoji = ":question:";
  random = (int)Math.floor(Math.random()*(max-min+1)+min);
  hasOwner = false;
  rent = 0;
 }
 public Tiles_Chance(String name, String emoji) {
  this.name = name;
  type = 4;
  this.emoji = emoji;
  random = (int)Math.floor(Math.random()*(max-min+1)+min);
  hasOwner = false;
  rent = 0;
 }
 
 public int getRandom(){
   return random;
 }
 public boolean hasOwner(){
   return hasOwner;
 }
 public int getRent(){
   return rent;
 }
 public String getChance() {
	 return "";
 }
@Override
public String getMessage(int playNum) {
	// TODO Implement Chance!
	return "You landed on a " + name + "\n" + getChance();
}
 
}
