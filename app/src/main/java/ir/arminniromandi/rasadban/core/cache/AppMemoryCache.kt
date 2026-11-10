package ir.arminniromandi.rasadban.core.cache

import androidx.collection.LruCache

/**
 * Generic in-memory LRU Cache wrapper.
 */
class AppMemoryCache<K : Any, V : Any>(maxSize: Int = 100) {
    private val lruCache = LruCache<K, V>(maxSize)

    fun get(key: K): V? = lruCache.get(key)

    fun put(key: K, value: V) {
        lruCache.put(key, value)
    }

    fun remove(key: K): V? = lruCache.remove(key)

    fun clear() {
        lruCache.evictAll()
    }

    fun size(): Int = lruCache.size()
}
