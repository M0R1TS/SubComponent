package ru.devsokovix.subcomponent

import dagger.Subcomponent

@ScreenScope
@Subcomponent(modules = [Screen1Module::class])
interface Screen1Component {

    fun inject(fragment: MyFragment)

    @Subcomponent.Builder
    interface Builder {
        fun build(): Screen1Component
    }

}