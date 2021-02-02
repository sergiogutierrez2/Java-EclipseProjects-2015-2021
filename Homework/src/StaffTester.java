import java.util.ArrayList;
/**
 * Tester
 */
public class StaffTester
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("Goodyear"));
        list.add(new String("Sathyanantha"));
        list.add(new String("Keomahavong"));
        list.add(new String("Addison"));
        list.add(new String("Smith"));
        
        ArrayList<String> list2 = new ArrayList<>();
        list2.add(new String("^aeiouy$"));
        list2.add(new String("^AEIOUY$"));
        
        
        Staff lister = new Staff(list);
        Staff lister2 = new Staff(list2);
        Staff empty = new Staff(new ArrayList<String>()); //test an empty list
        
        
        lister.replaceVowelsWith("*");
        System.out.println(lister);
        System.out.println("Expected: [G**d***r, S*th**n*nth*, K**m*h*v*ng, *dd*s*n, Sm*th]");
        
        lister2.replaceVowelsWith("#");
        System.out.println(lister2);
        System.out.println("Expected: [^######$, ^######$]");
        
        empty.replaceVowelsWith("*");
        System.out.println(empty);
        System.out.println("Expected: []");

        
        //testing equals
        list.clear();
        list.add(new String("Goodyear"));
        list.add(new String("Sathyanantha"));
        list.add(new String("Keomahavong"));
        list.add(new String("Addison"));
        list.add(new String("Smith"));
        lister = new Staff(list);
        
        list2.clear();
        list2.add(new String("Goodyear"));
        list2.add(new String("Sathyanantha"));
        list2.add(new String("Keomahavong"));
        list2.add(new String("Addison"));
        list2.add(new String("Smith"));
        lister2 = new Staff(list2);
        
        System.out.println("equal?: " + lister.equals(lister2));
        System.out.println("Expected: true");

        
        list2.remove(list2.size() - 1);
        System.out.println("equal?: " + lister.equals(lister2));
        System.out.println("Expected: false");
        
        System.out.println("contains?: " + lister.sameContents(lister2));
        System.out.println("Expected: false");
        
        list2.add(1, new String("Smith"));
        System.out.println("contains?: " + lister.sameContents(lister2));
        System.out.println("Expected: true");

        
        list2.set(1, new String("smith"));
        System.out.println("equal?: " + lister.equals(lister2));
        System.out.println("Expected: false");
        
        System.out.println("equal?: " + empty.equals(empty));
        System.out.println("Expected: true");
        
        System.out.println(lister.mostVowels());
        System.out.println("Expected: Keomahavong");
        
        list.remove(2);
        System.out.println(lister.mostVowels());
        System.out.println("Expected: Goodyear");
        
        System.out.println(empty.mostVowels());
        System.out.println("Expected: null");
        
        //Test only first equal
        list = new ArrayList<>();
        list.add(new String("Goodyear"));
        list.add(new String("Sathyanantha"));
        list.add(new String("Keomahavong"));
        list.add(new String("Addison"));
        list.add(new String("Smith"));
        lister = new Staff(list);
        
        
        list2.clear();
        list2.add(new String("Goodyear"));
        list2.add(new String("Goodyear"));
        list2.add(new String("Goodyear"));
        list2.add(new String("Goodyear"));
        list2.add(new String("Goodyear"));
        lister2 = new Staff(list2);
        
        System.out.println(list);
        System.out.println(list2);
        System.out.println("contains?: " + lister.sameContents(lister2));
        System.out.println("Expected: false");
        System.out.println("contains?: " + lister2.sameContents(lister));
        System.out.println("Expected: false");
        
        
        
    }
    
}