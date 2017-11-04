import java.util.*;  
class ArrayListExample{
	
 public static void main(String args[]){  
	 
  ArrayList<String> listN=new ArrayList<String>(); 
  
  listN.add("John");  
  listN.add("Charith");  
  listN.add("nans");  
  listN.add("Kurey");  
  
  Iterator tr=listN.iterator(); 
  
  while(tr.hasNext()){ 
	  
   System.out.println(tr.next());  
  }  
 }  
}  