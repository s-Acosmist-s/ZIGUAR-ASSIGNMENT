/*
 * Steps for solving :
 * 1. find the new current index element
 * 2. count its occurances in the old array
 * 3. trace its index in the new array
 */

import java.util.*;

public class Q1 {
    public static void main(String[] args) 
    {
        List<String> oldArray = Arrays.asList("A","B","C","D","E","F","A","B","C","D","A","B","C","A","B","A");
        List<String> newArray = Arrays.asList("B","C","E","F","B","C","B","C","B");
        int givenIndex = 7;
        int currentIndex = givenIndex-1;
        int newIndex=-1;
        String newMember = "";
        System.out.println("Current Index Member in the Old Queue : "+oldArray.get(currentIndex));
        System.out.println("Current Index : "+givenIndex);
        //Step-1.
        while (currentIndex < oldArray.size())
        {
            if(newArray.contains(oldArray.get(currentIndex)))
            {
                newMember=oldArray.get(currentIndex);
                break;
            }
            currentIndex++;
        }
        System.out.println("Current Index Member in the New Queue : "+newMember);
        //Step-2.
        int count=0;
        for(int i=0;i<=currentIndex;i++)
        {
            if(oldArray.get(i)==newMember)
            count++;
        }
        //Step-3.
        int temp=0;
        for(int i=0;i<newArray.size();i++)
        {
            if(newArray.get(i)==newMember)
            temp++;
            if(temp==count)
            {
                newIndex=i;
                break;
            }
        }
        System.out.println("New Current Index : " + (newIndex+1));
    }
}
