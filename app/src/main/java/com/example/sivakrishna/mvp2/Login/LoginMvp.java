package com.example.sivakrishna.mvp2.Login;

/**
 * Created by siva krishna on 9/23/2017.
 */

public interface LoginMvp {
    interface View{
        String getusername();
        String getPassword();
        void showerrormessage();
    }
    interface Presenter{
        void loginbuttonclicked();
        void setView(LoginMvp.View view);
    }
}
