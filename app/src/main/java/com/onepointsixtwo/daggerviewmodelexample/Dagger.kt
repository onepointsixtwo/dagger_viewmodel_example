package com.onepointsixtwo.daggerviewmodelexample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.onepointsixtwo.dagger_viewmodel_android.ViewModelFactory
import com.onepointsixtwo.dagger_viewmodel_android.ViewModelKey
import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Component(modules = arrayOf(ViewModelModule::class))
@Singleton
interface ViewModelComponent {
    fun getFactory(): ViewModelProvider.Factory
}

@Module
internal abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(TestViewModel::class)
    internal abstract fun bindTestViewModel(viewModel: TestViewModel): ViewModel

    @Binds
    internal abstract fun bindFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}