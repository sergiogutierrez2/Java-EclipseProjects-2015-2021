import java.util.Comparator;


public class InstagramAccount implements Comparable<InstagramAccount> {
    String userName;
    private int numberOfPosts;
    private int numberOfFollowing;


    public InstagramAccount(String userName, int numberOfPosts, int numberOfFollowing) {
        this.userName = userName;
        this.numberOfPosts = numberOfPosts;
        this.numberOfFollowing = numberOfFollowing;
    }

    @Override
    public String toString() {
        // To nicely print each object
        // May be helpful for debugging
        return this.userName + " posts " + this.numberOfPosts + " following " + this.numberOfFollowing;
    }
    

	@Override
	public int compareTo(InstagramAccount o) {
        if (numberOfPosts > o.numberOfPosts) return -1;
        else if (numberOfPosts < o.numberOfPosts) return 1;
        if (numberOfFollowing > o.numberOfFollowing) return -1;
        else if (numberOfFollowing < o.numberOfFollowing) return 1;
        return 0;
	}
	
    @Override
    public boolean equals(Object obj) { 
    	if (obj instanceof InstagramAccount) {
    		InstagramAccount other = (InstagramAccount) obj;
    		   return compareTo(other) == 0;
    		    }
    		    return false;
    }
}
