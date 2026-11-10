package ir.arminniromandi.rasadban.di

import ir.arminniromandi.rasadban.core.cache.AppMemoryCache
import org.koin.dsl.module

val appModule = module {
    // Provide LRU Cache singleton instance
    single { AppMemoryCache<String, Any>(maxSize = 100) }
}

val domainModule = module {
    // Repositories & Use Cases will be registered here
}

val viewModelModule = module {
    // ViewModels will be registered here
}

val appModules = listOf(
    appModule,
    domainModule,
    viewModelModule
)
