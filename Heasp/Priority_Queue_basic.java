import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.*;

public class Priority_Queue_basic   {

    static class Student implements Comparable<Student> {
        String student;
        int rank;
        public Student(String student,int rank){
            this.student=student;
            this.rank=rank;

        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }


    }

    public static void main(String[] args) {

        PriorityQueue<Student>pq=new PriorityQueue<>();
        pq.add(new Student("a",1));//logn
        pq.add(new Student("b",2));
        pq.add(new Student("d",4));
        pq.add(new Student("c",3));


        while(!pq.isEmpty()){
            System.out.println(pq.peek().student +" and rank is "+pq.peek().rank);//0(1)  ----output=1,2,3,4
            pq.remove();//logn
        }
    }
}
