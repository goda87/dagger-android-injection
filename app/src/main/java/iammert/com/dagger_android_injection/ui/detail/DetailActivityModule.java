package iammert.com.dagger_android_injection.ui.detail;

import dagger.Binds;
import dagger.Module;
import iammert.com.dagger_android_injection.data.ApiDataSource;

/**
 * Created by mertsimsek on 30/05/2017.
 */
@Module
public abstract class DetailActivityModule {

//    @Provides
//    DetailView provideDetailView(DetailActivity detailActivity) {
//        return detailActivity;
//    }
//
//    @Provides
//    DetailPresenter provideDetailPresenter(DetailView detailView, ApiService apiService) {
//        return new DetailPresenterImpl(detailView, apiService);
//    }

    @Binds
    abstract DetailView bindView(DetailActivity mainActivity);

    @Binds
    abstract DetailPresenter bindPresenter(DetailPresenterImpl mainPresenter);
}
