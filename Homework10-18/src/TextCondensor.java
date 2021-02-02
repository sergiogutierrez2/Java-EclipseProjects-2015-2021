//HOMEWORK 16A
/*
Write a class, TextCondensor, whose constructor takes an ArrayList<String> as a parameter. Save the ArrayList as the only instance variable.
Provide methods:

public Set<String> condenseText() which removes any duplicates and returns an Set<String> containing 
words without duplicates and in alphabetical order. Think Set
public int condensedSize() which gets the number of unique elements in the text. 
Do this efficiently without duplicating code already written. Do not use an unnecessary instance variable.
public void setList(ArrayList<String> newText) which sets a new list of text
public double relativeSize() gets the percent the condensed text is of the original ( condensed size / original size) * 100
 */

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
public class TextCondensor
{
   private ArrayList<String> text;
    public TextCondensor(ArrayList<String> text)
    {
       this.text = text;
    }
    
    public Set<String> condenseText()
    {
       Set<String> unique = new TreeSet<String>();
       for (String word : text)
       {
          unique.add(word);
       }
       return unique;
    }
    
    public int condensedSize()
    {
        return condenseText().size();
    }
    
    public void setList(ArrayList<String> newText)
    {
       text = newText;
    }
    
    public double relativeSize() 
    {
       return condensedSize() * 100.0 / text.size();
    }
}