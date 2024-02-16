public class Main {
    public static void main(String[] args)
    {
        int num[] ={1,2,3,4,5};
        int target = 3;

        int result = linearSearch(num,target);
    if(result != -1) {
        System.out.println("Element found: " + result);
    }else{
        System.out.println("Element not found");
    }
    }

    public static int linearSearch(int[] num, int target) {
        int ita;
        for(i=0; i<num.length; i++){
            if(num[i] == target)
                return i;
        }
        return -1;
    }
}