// Lab 2 - Git
// UniqueWords.java
// Konstantinos Georgiou
// 2/10/22
// This is lab 2 where we will clone a project to our local machine
// edit it, and upload it back to github.

import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;

      for (int i = 0; i < list.size(); i++)
      {		
    	 for (int j = 0; j < list.size(); j++)
		 {
    		 
    	/*  	  
    	  long unique = list.stream()
                  .distinct()
                  .count();
    	  System.out.println(unique);
    	  */ 
    	  if(j < i && list.get(j) == list.get(i))
    	  {
    		  break;
    	  }
    	  else if(j > i && list.get(j) != list.get(i))
    	  {
    		  count ++; 
    		  break;
    		  
    	  }
    	  else if(j == list.size() -1)
    	  {
    		  count++;
    		  		  
    	  }
    	  
		 }
		 
      }
	  return count;
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
	  
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}