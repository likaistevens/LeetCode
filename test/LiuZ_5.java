

import java.lang.reflect.Array;
import java.util.*;

public class LiuZ_5 {

    public static void InitializeA(int[] A,int n){
        Random r = new Random();
        for(int i = 0; i < n; i++) A[r.nextInt(13)+1]++;
    }
    public static void InitializeB(int[] A,double[] B,int n){
        int i = 0;
        for(int d: A) B[i++] = ((double)d)/n;
    }

    public static int randomizedSelect(int[] A,int p,int r,int i){
        if(p == r) return A[p];
        int q = randomPartition(A,p,r);
        int k = q-p+1;
        if(i == k) return A[q];
        else if(i<k) return randomizedSelect(A,p,q-1,i);
        else return randomizedSelect(A,q+1,r,i-k);
    }

    public static int randomPartition(int[] A,int p, int r){
        Random rand = new Random();
        int i = rand.nextInt(r-p+1)+ p;
        int temp = A[i];
        A[i] = A[r];
        A[r] = temp;
        return partition(A,p,r);
    }

    public static int partition(int[] B,int l, int r){
        int i = l-1;
        int j = l;
        while(j < r){
            if(B[j] < B[r]){
                i++;
                int temp = B[j];
                B[j] = B[i];
                B[i] = temp;
            }
            j++;
        }
        int temp = B[r];
        B[r] = B[++i];
        B[i] = temp;
        return i;
    }

    public static int findIndex(int[] A, int n){
        int index = 0;
        for(int i = 1; i<A.length;i++){
            if(A[i] == n){
                index = i;
                break;
            }
        }
        return index;
    }

    public static int findIndex(double[] A, double n){
        int index = 0;
        for(int i = 1; i<A.length;i++){
            if(A[i] == n){
                index = i;
                break;
            }
        }
        return index;
    }

    /**Counting sort*/
    public static int[] countingSort(int[] A,int n){
        int[] B = new int[14];
        int[] C = new int[n+1];
        for(int i = 1; i < A.length; i++)C[A[i]]++;
        for(int i = 1; i < C.length; i++)C[i] = C[i]+C[i-1];
        for(int i = A.length-1; i >= 1; i--){
            B[C[A[i]]] = A[i];
            C[A[i]]--;
        }
        return B;
    }

    /**Bucket Sort*/
    public static double[] bucketSort(double[] A){
        List<List<Double>> B = new ArrayList<>();
        double[] result = new double[14];
        int indexR = 1;
        for(int i = 0; i <= 10; i++){
            B.add(new ArrayList<Double>());
        }
        for (int i = 1; i < A.length; i++) {
            int index = (int) (A[i] / 0.1);
            B.get(index).add(A[i]);
        }
        for(int i = 0; i<=10; i++){
           Collections.sort(B.get(i));
           for(double b:B.get(i)){
               result[indexR++] = b;
           }
        }
        return result;
    }

    public static void main(String[] arg){
        int n = 10;
        int[] copya1;
        int[] copya2;
        double[] B = new double[14];
        int[] D;
        float[] runtime_RS = new float[100];
        float[] runtime_CS = new float[100];
        float[] runtime_BS = new float[100];
        int[] lucky_RS = new int[4];
        int[] lucky_CS = new int[4];
        int[] lucky_BS = new int[4];
        int[] unlucky_RS = new int[4];
        int[] unlucky_CS = new int[4];
        int[] unlucky_BS = new int[4];
        double[] luckyP_RS = new double[4];
        double[] luckyP_CS = new double[4];
        double[] luckyP_BS = new double[4];
        double[] unluckyP_RS = new double[4];
        double[] unluckyP_CS = new double[4];
        double[] unluckyP_BS = new double[4];

        int index = 0;
        int index2 = 0;
        while(n<=1000){
            int[] A = new int[14];
            InitializeA(A,n);
            copya1 = A.clone();
            copya2 = A.clone();
            long startTime = System.nanoTime();
            int worst_index_RS = findIndex(A,randomizedSelect(copya1,1,13,1));
            int best_index_RS = findIndex(A,randomizedSelect(copya2,1,13,13));
            long endTime = System.nanoTime();
            runtime_RS[index] = (endTime-startTime)/1000;
            startTime = System.nanoTime();
            D = countingSort(A,n);
            int worst_index_CS = findIndex(A,D[1]);
            int best_index_CS =findIndex(A,D[13]);
            endTime = System.nanoTime();
            runtime_CS[index] = (endTime-startTime)/1000;
//            System.out.println("CS:"+runtime_CS[index]);

            InitializeB(A,B,n);
            /**get the runtime of bucket sort*/
            startTime = System.nanoTime();
            double[] C = bucketSort(B);
            int worst_index_BS = findIndex(B,C[1]);
            int best_index_BS = findIndex(B,C[13]);
            endTime = System.nanoTime();
            runtime_BS[index] = (endTime-startTime)/1000;
//            System.out.println("BS:"+runtime_BS[index]);
            /**get the lucky and unlucky number and their probability when n is 10/100/500/1000*/
            if(n == 10 || n == 100||n == 500||n == 1000){
                lucky_RS[index2] = best_index_RS;
                luckyP_RS[index2] = ((double)A[best_index_RS])/n;
                unlucky_RS[index2] = worst_index_RS;
                unluckyP_RS[index2] = ((double)A[worst_index_RS])/n;
                lucky_CS[index2] = best_index_CS;
                luckyP_CS[index2] = ((double)A[best_index_CS])/n;
                unlucky_CS[index2] = worst_index_CS;
                unluckyP_CS[index2] = ((double)A[worst_index_CS])/n;
                lucky_BS[index2] = best_index_BS;
                luckyP_BS[index2] = ((double)A[best_index_BS])/n;
                unlucky_BS[index2] = worst_index_BS;
                unluckyP_BS[index2] = ((double)A[worst_index_BS])/n;
                index2++;
            }
            n += 10;
            index++;
        }
        System.out.println("Runtimes");
        System.out.println("\n#n\t\tRS\t\tCS\t\tBS");
        int n1 = 10;
        for(int i = 0; i < 100;i++){
            System.out.println(n1 + "\t\t"+runtime_RS[i]+"\t\t"+runtime_CS[i]+"\t\t"+runtime_BS[i]);
//            System.out.println();
            n1 +=10;
        }
        System.out.println("lucky and unlucky winners and their probabilities");
        System.out.println("\n#n\t\tlucky_RS\t\tlucky_RS_P\t\tunlucky_RS\t\tunlucky_RS_P\t\tlucky_CS\t\tlucky_CS_P\t\tunlucky_CS\t\tunlucky_CS_P\t\tlucky_BS\t\tlucky_BS_P\t\tunlucky_BS\t\tunlucky_BS_P");
        int[] n2 = new int[]{10,100,500,1000};
        for(int i = 0; i < 4;i++){
            System.out.println(n2[i]+ "\t\t"+lucky_RS[i]+"\t\t"+luckyP_RS[i]+"\t\t"+unlucky_RS[i]+"\t\t"+unluckyP_RS[i]+ "\t\t"+lucky_CS[i]+"\t\t"+luckyP_CS[i]+"\t\t"+unlucky_CS[i]+"\t\t"+unluckyP_CS[i]+ "\t\t"+lucky_BS[i]+"\t\t"+luckyP_BS[i]+"\t\t"+unlucky_BS[i]+"\t\t"+unluckyP_BS[i]);
        }

    }
}
