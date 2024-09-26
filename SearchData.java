package Arrays_DataStructure.Arrays_Programs.Easy_Arrays_Programs;

public class SearchData {
    public static void main(String[] args) {
        String str= "ManishArya";
        String output=reversedata(str);
        System.out.println("reverse data is ="+ output);

        
    }

    private static String reversedata(String inputdata) {
        StringBuilder strbldr= new StringBuilder();
        for(int i=inputdata.length()-1;i>=0; i--){
            strbldr.append(inputdata.charAt(i));
        }
        return strbldr.toString();
      
    }
}
