package Arrays;

public class _17_FindMostRepeated {
    public static void main(String[] args) {
        String[] array={"pen","eraser","pencil","pen","123","abc","pen","eraser"};
        mostRepeated(array);
    }
    public static void mostRepeated(String[] list){
        int index=0,mostCounted=0,counter=0;
        for (int i = 0; i < list.length; i++) {
            for (int j = i+1; j < list.length ; j++) {
                if(list[i].equals(list[j])){
                    counter++;
                }
            }
            if(mostCounted<counter){
                mostCounted=counter;
                index=i;
            }
            counter=0;
        }
        System.out.println(list[index]);
    }
}
