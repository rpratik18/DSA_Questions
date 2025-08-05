public class MyHashMap  {
    private static class Entry {

        String key;

        int value;

        Entry next;

        Entry(String key, int value) {
            this.key = key;
            this.value = value;
        }


    }
    private final int SIZE=1000;
    private Entry[] table;

    public MyHashMap() {
        table = new Entry[SIZE];
    }

    private int hash(String key){
        return Math.abs(key.hashCode()%SIZE);
    }

    public void put(String key,int value){
        int index=hash(key);
        Entry head=table[index];

        if (head==null){
            table[index]=new Entry(key,value);
            return;
        }

        Entry current=head;
        while(current!=null){
            if (current.key.equals(key)){
                current.value=value;
                return;
            }
            if(current.next==null)
                break;

            current=current.next;



        }
        current.next = new Entry(key, value);
    }

    public Integer get(String key){
        int index=hash(key);
        Entry current=table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }
    public boolean containsKey(String key) {
        return get(key) != null;
    }

}
