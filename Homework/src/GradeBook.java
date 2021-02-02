import java.util.Random;

public class GradeBook {
    int[][] grades;

    public GradeBook(int numberOfStudents, int numberOfHWs) {
        grades = new int[numberOfStudents][numberOfHWs];
        Random rand = new Random();
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < numberOfHWs; j++) {
                grades[i][j] = 50 + rand.nextInt(51);
            }
        }
    }

    /*
    public GradesIterator gradeIterator()
    {
       return new
    		 GradesIterator ()
          {
    	   
           private int row = 0;
           private int column = 0;
           
             public boolean hasNext()
             {
                return column < grades.length -1;
             }

             public int next()
             {
            	 if(!(column < grades.length -1)) {
                     row++;
                     column= 0;
                     return grades[row][column];
            		}
            	 else
            		 return grades[row][column];
             }

             public void remove()
             {
                throw new UnsupportedOperationException();
             }

          };
    }
*/
    
    public GradesIterator gradeIterator()
    {
       return new
    		 GradesIterator ()
          {
    	   
           private int row = 0;
           private int column = 0;
           
           @Override
           public int next()
           {
          	 int grade = grades[row][column];
          	 column++;
          	 
          	 if (column ==grades[row].length)
          	 {
                   column= 0;
                   row++;
          	 }    	 
          		 return grade;
           }
           
           @Override
             public boolean hasNext()
             {
                return row < grades.length;
             }

          };
    }

    public static void main(String[] args) {
        GradeBook gbook = new GradeBook(3, 2);
        GradesIterator iterator = gbook.gradeIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}