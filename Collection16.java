/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_java_assignment;

/**
 *
 * @author SHARDUL
 */


import java.util.TreeSet;

public class Collection16 {
  public static void main(String[] args) {
  TreeSet<String> tree_set = new TreeSet<String>();
  tree_set.add("Violet");
  tree_set.add("Lavender");
  tree_set.add("Green");
  tree_set.add("White");
  tree_set.add("Black");
  System.out.println("Tree set: ");
  System.out.println(tree_set);

  
    Object first_element = tree_set.first();
    System.out.println("First Element is: "+first_element);
 
  
    Object last_element = tree_set.last();
    System.out.println("Last Element is: "+last_element);
 }
}
    