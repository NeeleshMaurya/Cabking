package com.app.cabking.riderapp.Interfaces;

import com.app.cabking.riderapp.Model.fcm.FCMResponse;
import com.app.cabking.riderapp.Model.fcm.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
        "Content-Type:application/json",
        "Authorization:key=AAAAkdKBGqw:APA91bEdzBj1iAjAwkf90AjJHz1RmtUx48b8eV0PC_XafxDYxFyOpSGkbG0pMI1qslhNTiCQSe4YhFh7YLjqmJ_YI7XPVSt_pLixg2o6fr1DjSjcY0oqp6lLSgagewpKRB4hdgTEbkn_"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
