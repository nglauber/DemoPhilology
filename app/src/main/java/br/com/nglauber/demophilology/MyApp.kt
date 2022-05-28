package br.com.nglauber.demophilology

import android.app.Application
import br.com.nglauber.demophilology.intl.EnglishRestringsRepository
import br.com.nglauber.demophilology.intl.PortugueseRestringsRepository
import dev.b3nedikt.restring.Restring
import dev.b3nedikt.reword.RewordInterceptor
import dev.b3nedikt.viewpump.ViewPump
import java.util.Locale

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Restring.init(this)
        ViewPump.init(RewordInterceptor)

        Restring.putStrings(Locale.forLanguageTag("pt-BR"), PortugueseRestringsRepository.strings)
        Restring.putStrings(Locale.ENGLISH, EnglishRestringsRepository.strings)
    }
}