public class LinearSearch {
    public static void main(String[] args) {

        //int[] array = new int[10];
        int[] array = {10, 20, 30, 40, 35, 45, 50};
        int index=-1, find = 30;

        for(int i=0; i<array.length; i++)
        {
            if(array[i] == find){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("Item not found !!!");
        }else{
            System.out.println("Item found. index = "+index);
        }

    }
}

