package com.rbikbulatov.investorassistant.data

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import com.google.gson.Gson
import com.rbikbulatov.investorassistant.domain.Invest
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class InvestSharedPreferences @Inject constructor(
    @ApplicationContext val context: Context
) {
    private var sharedPreferences: SharedPreferences? = null

    fun getSharedPref(): SharedPreferences? {
        if (sharedPreferences == null)
            sharedPreferences = context.getSharedPreferences(SHARED_PREF, Context.MODE_PRIVATE)
        return sharedPreferences
    }

    fun getInvests(): MutableSet<Invest>? {
        return getSharedPref()?.getStringSet(INVESTS_KEY, setOf())
            ?.map { Gson().fromJson(it, Invest::class.java) }?.toMutableSet()

    }

    fun addInvest(invest: Invest) {
        val invests = getInvests()
        invests?.add(invest)
        getSharedPref()?.edit {
            putStringSet(INVESTS_KEY, invests?.map { Gson().toJson(it) }?.toSet())
        }
    }

    fun deleteInvest(id: String) {
        val invests = getInvests()
        invests?.removeIf { it.id == id }
        getSharedPref()?.edit {
            putStringSet(INVESTS_KEY, invests?.map { Gson().toJson(it) }?.toSet())
        }
    }

    private companion object {
        const val SHARED_PREF = "SHARED_PREF"
        private const val INVESTS_KEY = "INVESTS_KEY"
    }
}