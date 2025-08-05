import java.util.HashMap;
import java.util.Map;

public class Q15 {
    public static void main(String[] args) {
       String[][] str= {{"Charles", "84"},
            {"John", "100"},
            {"Andy", "37"},
            {"John", "23"},
            {"Charles", "20"}};
        Map<String,Double> student=new HashMap<>();
        Map<String, Integer> count = new HashMap<>();
        double high=0.0;
        double avg=0;
        String sname = "";
       for(int i=0;i<str.length;i++){
           String name=str[i][0];
           double mark=Integer.parseInt(str[i][1]);

               student.put(name,student.getOrDefault(name,0.0)+mark);
                count.put(name,count.getOrDefault(name,0)+1);
                if(count.get(name)>1)
                    avg=student.get(name)/count.get(name);
            if(high<avg){
                high=avg;
                sname=name;
            }

       }
        System.out.println(sname+"  " +high);

    }
}
