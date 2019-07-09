package iammert.com.dagger_android_injection.data;

import javax.inject.Inject;

/**
 * Created by mertsimsek on 26/05/2017.
 */

public class ApiService {

    ApiDataSource dataSource;

    @Inject
    public ApiService(ApiDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String loadData(){
        return dataSource.loadData();
    }
}
