public class HTDemo
{
    public static void main(String[] args)
    {
        int findVal = 12;
        HashTableSC<Integer> ht = new HashTableSC<Integer>(14);
        int[] arr = {52, 810, 91, 455, 5, 10, 2, 12, 18, 25, 45, 80, -6, 14, 0, 1, -12};
        System.out.println("Is hash table empty?" + ht.isEmpty());
        
        for (int i = 0; i < arr.length; i++)
        {
            ht.insert(arr[i]);
        }
        
        System.out.println("Is has table empty? " + ht.isEmpty());
        
        ht.print();
        System.out.println("Did find succeed?" + ht.find(findVal));
        ht.delete(findVal);
        System.out.println("Did find succeed?" + ht.find(findVal));
        ht.print();
        ht.insert(findVal);
        System.out.println("Did find succeed?" + ht.find(findVal));

    }
}
