

public class Wrapper<T extends Comparable<T>>
implements Comparable<Wrapper<T>> {
 T value;

 public Wrapper(T value) {
 this.value = value;
 }

    public T unwrap() {
        return value;
    }
    
    public void setValue(T value) {
        this.value = value;
    }

@Override
public int compareTo(Wrapper<T> o) {
//if (this.value == o.value)  {
	return unwrap().compareTo(o.unwrap());
//}
//return this.value.compareTo(o.value);
}

 @Override 
 public boolean equals(Object obj) {
 //if (obj instanceof T) {
 Wrapper<T> other = (Wrapper<T>) obj;
 return this.compareTo(other) == 0;
 //}
 //return false;
 }

 @Override
 public int hashCode() {
 return this.value.hashCode();
 }
} 