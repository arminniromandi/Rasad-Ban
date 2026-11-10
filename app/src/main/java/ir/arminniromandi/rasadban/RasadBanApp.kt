package ir.arminniromandi.rasadban

import android.app.Application
import ir.arminniromandi.rasadban.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class RasadBanApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@RasadBanApp)
            modules(appModules)
        }
    }
}
