import java.util.Comparator;

/*public class Chain implements Comparable<Chain> {
    int id;
    String name;
    int numberOfBusinesses;

    public Chain(int id, String name, int numberOfBusinesses) {
        this.id = id;
        this.name = name;
        this.numberOfBusinesses = numberOfBusinesses;
    }

    @Override
    public String toString() {
        // Prints the information for each Chain object
        // you can use it for testing your solution
        return "[Chain with id = " + this.id + ", name = " + this.name +
                ",  n businesses " + this.numberOfBusinesses + "]";
    }

	@Override
	public int compareTo(Chain o) {
        if (id < o.id) return -1;
        if (id > o.id) return 1;
        return 0;
	}
}
*/

public class Chain implements Comparable<Chain> {
    int id;
    String name;
    int numberOfBusinesses;

    public Chain(int id, String name, int numberOfBusinesses) {
        this.id = id;
        this.name = name;
        this.numberOfBusinesses = numberOfBusinesses;
    }

    @Override
    public String toString() {
        // Prints the information for each Chain object
        // you can use it for testing your solution
        return "[Chain with id = " + this.id + ", name = " + this.name +
                ",  n businesses " + this.numberOfBusinesses + "]";
    }
    
    @Override
    public boolean equals(Object obj) { 
    	if (obj instanceof Chain) {
    		   Chain other = (Chain) obj;
    		   return compareTo(other) == 0;
    		    }
    		    return false;
    }

	@Override
	public int compareTo(Chain o) {
        if (id < o.id) return -1;
        if (id > o.id) return 1;
        return 0;
	}
}

//Not Solved
/*
public class Chain implements Comparable<Chain> {
    int id;
    String name;
    int numberOfBusinesses;

    public Chain(int id, String name, int numberOfBusinesses) {
        this.id = id;
        this.name = name;
        this.numberOfBusinesses = numberOfBusinesses;
    }

    @Override
    public String toString() {
        // Prints the information for each Chain object
        // you can use it for testing your solution
        return "[Chain with id = " + this.id + ", name = " + this.name +
                ",  n businesses " + this.numberOfBusinesses + "]";
    }
    
    public String getName()
    {
    	return name;
    }
    
    @Override
    public boolean equals(Object obj) { 
    	if (obj instanceof Chain) {
    		   Chain other = (Chain) obj;
    		   return compareTo(other) == 0;
    		    }
    		    return false;
    }

	@Override
	public int compareTo(Chain o) {
		return this.name.compareTo(o.name);
	}
}


class ChainComparator implements Comparator<Chain> {
@Override
public int compare(Chain a, Chain b) 
{ 
    return a.name.compareTo(b.name); 
} 
}*/