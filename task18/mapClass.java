package task18;

import java.util.*;

public class mapClass<K, V> {

    private Map<K, V> mp = new HashMap<>();

    public Map<K, V> getMp() {
        return mp;
    }

    public void addItem(K o1, V o2){
        MyEntry<K,V> myEntry = new MyEntry<>(o1, o2);
        mp.put(myEntry.getO1(), myEntry.getO2());
    }

    public void removeItemByKey(K o1){
        Set<Map.Entry<K,V>> mSet = mp.entrySet();
        Iterator<Map.Entry<K,V>> mIterator = mSet.iterator();
        while(mIterator.hasNext()){
            Map.Entry<K,V> iter = mIterator.next();
            if(iter.getKey().equals(o1)){
                mIterator.remove();
            }
        }
    }
    public void removeItemByValue(V o2){
        Set<Map.Entry<K,V>> mSet = mp.entrySet();
        Iterator<Map.Entry<K,V>> mIterator = mSet.iterator();
        while(mIterator.hasNext()){
            Map.Entry<K,V> iter = mIterator.next();
            if(iter.getValue().equals(o2)){
                mIterator.remove();
            }
        }
    }

    public void showItemSet(){
        Set<Map.Entry<K,V>> mSet = mp.entrySet();
        Iterator<Map.Entry<K,V>> mIterator = mSet.iterator();
        Set<K> getSet = new HashSet<>();
        while(mIterator.hasNext()){
            getSet.add(mIterator.next().getKey());
        }
        System.out.println(getSet);
    }

    public void showItemList(){
        Set<Map.Entry<K,V>> mSet = mp.entrySet();
        Iterator<Map.Entry<K,V>> mIterator = mSet.iterator();
        List<V> getList = new ArrayList<>();
        while(mIterator.hasNext()){
            getList.add(mIterator.next().getValue());
        }

        System.out.println(getList);
    }

    public void showMap() {
        Iterator<Map.Entry<K, V>> itrMap = mp.entrySet().iterator();

        while (itrMap.hasNext()) {
            System.out.println(itrMap.next());
        }


    }
}