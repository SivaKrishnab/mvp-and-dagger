package com.example.sivakrishna.mvp2.Login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sivakrishna.mvp2.R;
import com.example.sivakrishna.mvp2.root.App;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity implements LoginMvp.View {
EditText editText,editText1;
    Button button;
   @Inject
   LoginMvp.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ((App) getApplication()).getComponent().inject(this);
        editText=(EditText)findViewById(R.id.edittext);
        editText1=(EditText)findViewById(R.id.edittext2);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loginbuttonclicked();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
    }

    @Override
    public String getusername() {
        return editText.getText().toString();
    }

    @Override
    public String getPassword() {
        return editText1.getText().toString();
    }

    @Override
    public void showerrormessage() {
        Toast.makeText(this,"Message",Toast.LENGTH_SHORT).show();
    }
}
