package com.app.cabking.driverapp.Service;

import com.app.cabking.driverapp.Common.Common;
import com.app.cabking.driverapp.Model.Token;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingService;

public class FirebaseIdService extends FirebaseMessagingService {

    public void onTokenRefresh(String s) {
        super.onNewToken(s);
        String refreshedToken= FirebaseInstanceId.getInstance().getToken();
        updateTokenToServer(refreshedToken);
    }

    private void updateTokenToServer(String refreshedToken) {
        FirebaseDatabase db=FirebaseDatabase.getInstance();
        DatabaseReference tokens=db.getReference(Common.token_tbl);

        Token token=new Token(refreshedToken);
        if (FirebaseAuth.getInstance().getCurrentUser()!=null)tokens.child(FirebaseAuth.getInstance().getUid())
                .setValue(token);
    }
}
