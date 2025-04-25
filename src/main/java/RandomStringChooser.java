import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String> list;
  public RandomStringChooser(String [] a){
    list = new ArrayList<String>();
    for(int i = 0; i < a.length; i++){
      list.add(a[i]);
    }
  }
  public String getNext(){
    if(list.size() > 0){
      int temp = (int)(Math.random()*list.size());
      return list.remove(temp);
    } else {
      return "NONE";
    }
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
