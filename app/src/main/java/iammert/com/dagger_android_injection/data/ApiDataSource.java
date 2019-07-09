package iammert.com.dagger_android_injection.data;

import javax.inject.Inject;

public class ApiDataSource {
    @Inject
    public ApiDataSource() {
    }

    public String loadData(){
        return "data from datasource";
    }
}
