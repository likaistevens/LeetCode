
public class Competetion {
    public static String shitf(String s, int[][] matrix){
//        String res = s;
//        for(int i = 0; i < matrix.length; i++){
//            res = i==0 ? helper(s,matrix[i]) : helper(res,matrix[i]);
//        }
//        return res;
        for(int i = 0; i < matrix.length; i++){
            s = helper(s,matrix[i]);
        }
        return s;
    }
    
    private static String helper(String s,int[] array){
//        String rs = "";
//        String ls = "";
//        if(array[0]==1){
//            rs = s.subSequence(s.length()-array[1], s.length()).toString();
//            ls = s.subSequence(0, s.length()-array[1]).toString();
//        }
//        StringBuilder rsb = new StringBuilder(rs);
//        StringBuilder lsb = new StringBuilder(ls);
        StringBuilder rsb = new StringBuilder(array[0]==1 ? s.subSequence(s.length()-array[1], s.length()).toString() : s.subSequence(0, array[1]).toString());
        StringBuilder lsb = new StringBuilder(array[0]==1 ? s.subSequence(0, s.length()-array[1]).toString() : s.subSequence(array[1], s.length()).toString());
        return array[0]==1 ? rsb.append(lsb.toString()).toString() : lsb.append(rsb.toString()).toString();
    }
    
    public static void main(String[] args){
//        String s = "gabcdef";
//        int[] array = {1,1};
//        System.out.println(helper(s,array));
        String s = "abc";
        int[][] matrix = {{0,1},{1,2}};
        System.out.println(shitf(s,matrix));
    }
}

