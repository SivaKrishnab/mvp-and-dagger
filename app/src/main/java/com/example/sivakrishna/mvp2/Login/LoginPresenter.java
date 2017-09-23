package com.example.sivakrishna.mvp2.Login;

import android.support.annotation.Nullable;

/**
 * Created by siva krishna on 9/23/2017.
 */

public class LoginPresenter implements LoginMvp.Presenter {
    @Nullable
    private LoginMvp.View view;

    public void loginbuttonclicked() {
        if(view.getusername()==null){
            view.showerrormessage();
        }
        if(view.getPassword()==null){
            view.showerrormessage();
        }
        else{
            view.showerrormessage();
        }
    }

    @Override
    public void setView(LoginMvp.View view) {
        this.view=view;
    }


}
