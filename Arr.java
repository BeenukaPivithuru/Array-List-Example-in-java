import java.util.*;  
class ArrayListExample{
	
 public static void main(String args[]){  
	 
  ArrayList<String> listN=new ArrayList<String>(); 
  
  listN.add("Yehen");  
  listN.add("Charith");  
  listN.add("Vimukthi");  
  listN.add("Rayan");  
  
  Iterator tr=listN.iterator(); 
  
  while(tr.hasNext()){ 
	  
   System.out.println(tr.next());  
  }  
 }  
}  