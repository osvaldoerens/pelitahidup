package pelitahidup.gpib.pelitahidup.presenter;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import pelitahidup.gpib.pelitahidup.GlobalConsta;
import pelitahidup.gpib.pelitahidup.service.UserServices;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Presenter {

    //private String port;                  //ketika menggunakan port untuk dev atau prod
    private Retrofit retrofit;

    //method untuk Retrofit Builder
    public Retrofit retrofitBuilder(){
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor)
                .readTimeout(1, TimeUnit.MINUTES)
                .connectTimeout(1, TimeUnit.MINUTES)
                .build();


        //initiate base url
        //Dipakai saat menggunakan port
                    /** start prort **/
//                    if (GlobalConsta.APP_TYPE_LAUNCH.equalsIgnoreCase("0")) {
//                        port = GlobalConstants.APP_PORT_DEV;
//                    } else {
//                        port = GlobalConstants.APP_PORT_PROD;
//                    }
//                    String BASE_URL = String.format("http://202.169.43.53:%s/", port);
                    /** end port **/

        retrofit = new Retrofit.Builder()
                .baseUrl(GlobalConsta.BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }

    public UserServices userService(){
        return retrofitBuilder().create(UserServices.class);
    }
}
