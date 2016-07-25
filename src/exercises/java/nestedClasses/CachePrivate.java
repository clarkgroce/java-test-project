package exercises.java.nestedClasses;

import com.sun.deploy.cache.CacheEntry;

import java.util.HashMap;
import java.util.Map;

public class CachePrivate {

    private Map<String, CacheEntry> cacheEntryMap = new HashMap<String, CacheEntry>();
    //Here is an example of when you might use a nested class.  They are usually used when the nested class will be
    //tightly associated and used by the outer class.  In this example we have a Cache class with a cacheentry class
    //nested inside the cache class.  In this example the nested class is marked private, which prevents outside
    // access beyond the outer Cache class.  Below is an example of the CacheEntry class exposed for access beyond
    //the outer class.
    private class CacheEntry {
        public long timeInserted = 0;
        public Object value = null;

    }

    public void store(String key, Object value) {
        CacheEntry entry = new CacheEntry();
        entry.value = value;
        entry.timeInserted = System.currentTimeMillis();
        this.cacheEntryMap.put(key, entry);
    }

    public Object get(String key) {
        CacheEntry entry = this.cacheEntryMap.get(key);
        if (entry == null) return null;
        return entry.value;
    }
}

//public class Cache {
//
//    private Map<String, CacheEntry> cacheMap = new HashMap<String, CacheEntry>();
//
//    public class CacheEntry {
//        public long   timeInserted = 0;
//        public object value        = null;
//    }
//
//    public void store(String key, Object value){
//        CacheEntry entry = new CacheEntry();
//        entry.value = value;
//        entry.timeInserted = System.currentTimeMillis();
//        this.cacheMap.put(key, entry);
//    }
//
//    public Object get(String key) {
//        CacheEntry entry = this.cacheMap.get(key);
//        if(entry == null) return null;
//        return entry.value;
//    }
//
//    public CacheEntry getCacheEntry(String key) {
//        return this.cacheMap.get(key);
//    }
//
//}
