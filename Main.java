import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    String[] arr = {"willow", "trees", "lake", "forest", "apple"};
    sortAndPrintDescending(arr);
    ArrayList<Integer> arr2 = new ArrayList<Integer>();
    arr2.add(4);
    arr2.add(6);
    arr2.add(3);
    arr2.add(7);
    selectSortDescending(arr2);
  }


  /** Precondition: No element of arr is null.
   * Precondition: arr is non-empty
   */
  public static void sortAndPrintDescending(String[] arr)
  {
    String theMin;
    String theTemp;
    for (int i = 0; i < arr.length; i++)
    {
      theMin = arr[i];
      for (int j = i+1; j < arr.length; j++)
      {
        if (arr[i].compareTo(arr[j]) < 0)
        {
          theTemp = arr[i]; 
          arr[i] = arr[j];
          arr[j] = theTemp; 
        }
      }
    }
    for (String n: arr)
    {
      System.out.println(n);
    }
  }

  /** Precondition: No element of arr is null.
   * Precondition: arr is non-empty
   */
  public static void selectSortDescending(ArrayList<Integer> arr2)
  {
    Integer theMin;
    Integer theTemp;
    for (int i = 0; i < arr2.size(); i++)
    {
      theMin = arr2.get(i);
      for (int j = i+1; j < arr2.size(); j++)
      {
        if (arr2.get(i) < arr2.get(j))
        {
          theTemp = arr2.get(i); 
          arr2.set(i, arr2.get(j));
          arr2.set(j, theTemp); 
        }
      }
    }
    for (Integer n: arr2)
    {
      System.out.println(n);
    }
  }
}