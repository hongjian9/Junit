package test;

public class Triangle {

    public String TriangleType(String s11, String s22, String s33) {
        
        String type = "";
    
         int s1 = Integer.parseInt(s11);
         int s2 = Integer.parseInt(s22);
         int s3 = Integer.parseInt(s33);

        if ((s1 + s2 <= s3) || (s1 + s3 <= s2) || (s2 + s3 <= s1)) {
               //err += "The lengths of the triangles do not form a valid triangle!\n";
        	type = "Not_a_triangle";
        }

        else {            
            if (( s1 == s2) && (s2 == s3) && (s1 == s3)) {
               type= "Equilateral";
           } else if ((s1 == s3) ||(s2 == s3)||(s1 == s2)) {
               type = "Isosceles";
           } else {
               type = "Scalene";
           }                 
        }
        return type;        
    }
}
    