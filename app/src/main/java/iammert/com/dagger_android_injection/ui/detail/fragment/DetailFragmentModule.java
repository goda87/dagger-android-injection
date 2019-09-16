package iammert.com.dagger_android_injection.ui.detail.fragment;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by mertsimsek on 02/06/2017.
 */
@Module
public abstract class DetailFragmentModule {

    @Binds
    abstract DetailFragmentView provideDetailFragmentView(DetailFragment detailFragment);

}
