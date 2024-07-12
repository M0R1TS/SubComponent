package ru.devsokovix.subcomponent

import dagger.Module
import dagger.Provides

@Module
class RootModule {
    @Provides
    fun accountsInfo() = arrayOf(
        AccountInfo(R.drawable.ava1, 42, 230, 130),
        AccountInfo(R.drawable.ava2, 80, 80, 313)
    )
}