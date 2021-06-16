package com.redbee.academy.challenge;

import java.util.List;
import java.util.ArrayList;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    List<Integer> list_max = new ArrayList<Integer>();
    int i = 0;
    if(a.isEmpty() & b.isEmpty()){
      System.out.println("Both lists are empty");
      return null;
    } else if(a.isEmpty()){
      System.out.println("First list is empty");
      return b;
    } else if(b.isEmpty()){
      System.out.println("Second list is empty");
      return a;
    } else if(a.size() > b.size()){
      while (i < b.size()){
        if(b.get(i) > a.get(i)){
          list_max.add(b.get(i));
        } else{
          list_max.add(a.get(i));
        }
        i += 1;
      }
      while (i < a.size()){
        list_max.add(a.get(i));
        i += 1;
      }
    } else if(b.size() > a.size()){
      while (i < a.size()){
        if(b.get(i) > a.get(i)){
          list_max.add(b.get(i));
        } else{
          list_max.add(a.get(i));
        }
        i += 1;
      }
      while (i < b.size()){
        list_max.add(b.get(i));
        i += 1;
      }
    } else{
      for(i = 0; i < b.size(); i++){
        if(b.get(i) > a.get(i)){
          list_max.add(b.get(i));
        } else{
          list_max.add(a.get(i));
        }
      }
    }
    return list_max;
  }
}
